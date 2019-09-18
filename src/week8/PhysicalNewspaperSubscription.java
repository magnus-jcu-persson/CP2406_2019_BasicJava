package week8;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setSubscriberAddress(String subscriberAddress) {
        if (subscriberAddress.length() > 0) {
            super.subscriberAddress = subscriberAddress;
            super.rate = 15.00;
        } else{
            System.out.println("ERROR: Invalid Address. Address reset");
            super.subscriberAddress = "";
            super.rate = 0.00;
        }
    }
}
