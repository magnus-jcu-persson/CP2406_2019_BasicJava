package week8;

public abstract class NewspaperSubscription {
    private String subscriberName;
    String subscriberAddress;
    Double rate;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberAddress() {
        return subscriberAddress;
    }

    public abstract void setSubscriberAddress(String subscriberAddress);

    public Double getRate() {
        return rate;
    }
}
