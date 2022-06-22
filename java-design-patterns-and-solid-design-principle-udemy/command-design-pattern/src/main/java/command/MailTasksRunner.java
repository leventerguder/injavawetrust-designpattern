package command;

import java.util.LinkedList;
import java.util.List;
//Throw Away POC code DON'T USE in PROD
//This is invoker actually executing commands. 
//starts a worker thread in charge of executing commands
public class MailTasksRunner implements Runnable {

	private Thread runner;

	private List<Command> pendingCommands;

	private volatile boolean stop;

	private static final MailTasksRunner RUNNER = new MailTasksRunner();

	public static final MailTasksRunner getInstance() {
		return RUNNER;
	}

	private MailTasksRunner() {
		pendingCommands = new LinkedList<>();
		runner = new Thread(this);
		runner.start();
	}

	//Run method takes pending commands and executes them.
	@Override
	public void run() {

		while (true) {
			Command cmd = null;
			synchronized (pendingCommands) {
				if (pendingCommands.isEmpty()) {
					try {
						pendingCommands.wait();
					} catch (InterruptedException e) {
						System.out.println("Runner interrupted");
						if (stop) {
							System.out.println("Runner stopping");
							return;
						}
					}
				}
				cmd = pendingCommands.isEmpty()?null:pendingCommands.remove(0);
			}
			if (cmd == null)
				return;
			cmd.execute();
		}

	}
	
	//Giving it a command will schedule it for later execution
	public void addCommand(Command cmd) {
		synchronized (pendingCommands) {
			pendingCommands.add(cmd);
			pendingCommands.notifyAll();
		}
	}

	public void shutdown() {
		this.stop = true;
		this.runner.interrupt();
	}
}
