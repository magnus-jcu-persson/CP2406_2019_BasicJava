package week8;

public class IncomingPhoneCall extends PhoneCall {

    IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setCallPrice(0.02);
    }

    @Override
    public String getPhoneNumber() {
        return super.phoneNumber;
    }

    @Override
    public Double getCallPrice() {
        return super.callPrice;
    }

    @Override
    public void getCallInformation() {
        System.out.println("Phone: " + getPhoneNumber()
                + ", Rate: " + getCallPrice()
                + ", Call Price: " + getCallPrice()
        );
    }
}
