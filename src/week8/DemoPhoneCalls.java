package week8;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("555 1014 555");
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("+1 1011 101 222", 20);

        incomingPhoneCall.getCallInformation();
        outgoingPhoneCall.getCallInformation();
    }
}
