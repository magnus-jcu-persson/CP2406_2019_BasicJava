package week8;

public class OutgoingPhoneCall extends PhoneCall {
    private Integer callMinutes;

    OutgoingPhoneCall(String phoneNumber, Integer callMinutes) {
        super(phoneNumber);
        setCallPrice(0.04);
        this.callMinutes = callMinutes;
    }

    public Integer getCallMinutes() {
        return this.callMinutes;
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
                + ", Call Minutes: " + getCallMinutes()
                + ", Call Price: " + (getCallPrice() * getCallMinutes())
        );
    }
}
