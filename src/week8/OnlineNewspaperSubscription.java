package week8;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setSubscriberAddress(String subscriberAddress) {
        if (subscriberAddress.contains("@")) {
            super.subscriberAddress = subscriberAddress;
            super.rate = 9.00;
        } else{
            System.out.println("ERROR: Invalid Address. Address reset");
            super.subscriberAddress = "";
            super.rate = 0.00;
        }
    }
}
