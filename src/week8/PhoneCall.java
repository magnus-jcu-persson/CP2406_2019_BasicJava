package week8;

public abstract class PhoneCall {
    protected String phoneNumber;
    protected Double callPrice;

    PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        setCallPrice(0.00);
    }

    protected void setCallPrice(Double callPrice) {
        this.callPrice = callPrice;
    }

    public abstract String getPhoneNumber();

    public abstract Double getCallPrice();

    public abstract void getCallInformation();

}
