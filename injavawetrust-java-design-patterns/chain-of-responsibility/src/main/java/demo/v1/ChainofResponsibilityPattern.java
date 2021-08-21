package demo.v1;

public class ChainofResponsibilityPattern {

    public static void main(String[] args) {

        System.out.println("\n ***Chain of Responsibility Pattern Demo***\n");
        Receiver faxHandler, emailHandler;

        // Objects of the chains
        IssueRaiser issueRaiser = new IssueRaiser();
        faxHandler = new FaxErrorHandler();
        emailHandler = new EmailErrorHandler();

        // Making the chain Starting point:IssueRaiser will raise issues and set the first handler

        issueRaiser.setFirstErrorHandler(faxHandler);
        // FaxErrorHandler will pass the error to EmailHandler if needed.
        faxHandler.nextErrorHandler(emailHandler);
        // EmailErrorHandler will be placed at the last position in the chain
        emailHandler.nextErrorHandler(null);

        Message m1 = new Message("Fax is going slow.", MessagePriority.NORMAL);
        Message m2 = new Message("Emails are not reaching.", MessagePriority.HIGH);
        Message m3 = new Message("In Email, CC field is disabled always.", MessagePriority.NORMAL);
        Message m4 = new Message("Fax is not reaching destinations.", MessagePriority.HIGH);
        issueRaiser.raiseMessage(m1);
        issueRaiser.raiseMessage(m2);
        issueRaiser.raiseMessage(m3);
        issueRaiser.raiseMessage(m4);

    }

}
