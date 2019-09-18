package week8;

public class PhoneCallArray {
    public static void main(String[] args) {

        PhoneCall[] phoneCalls = {
                new IncomingPhoneCall("555 1014 555"),
                new IncomingPhoneCall("555 1014 666"),
                new OutgoingPhoneCall("+1 1011 101 222", 20),
                new OutgoingPhoneCall("+1 1011 101 666", 40),
                new OutgoingPhoneCall("+1 1011 101 888", 60),
                new OutgoingPhoneCall("+1 1011 101 111", 120),
                new IncomingPhoneCall("555 1014 777"),
                new IncomingPhoneCall("555 1014 888"),
                new IncomingPhoneCall("555 1014 999"),
                new IncomingPhoneCall("555 1014 111")
        };

        for (PhoneCall phoneCall : phoneCalls) {
            phoneCall.getCallInformation();
        }

    }
}
