package demo.v1;

public interface Command {

    //Typically this method does not take any argument.
    //Some of the reasons are:
    //1.We supply all the information when it is created.
    //2.Invoker may reside in different address space.etc.

    void executeCommand();

}
