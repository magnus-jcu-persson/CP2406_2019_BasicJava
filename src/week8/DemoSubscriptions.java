package week8;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physicalNewspaperSubscription = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onlineNewspaperSubscription = new OnlineNewspaperSubscription();

        physicalNewspaperSubscription.setSubscriberAddress("Test Address");
        onlineNewspaperSubscription.setSubscriberAddress("Test@Address");

        System.out.println("Physical");
        System.out.println("Address: " + physicalNewspaperSubscription.getSubscriberAddress());
        System.out.println("Rate: " + physicalNewspaperSubscription.getRate());

        System.out.println("Online");
        System.out.println("Address: " + onlineNewspaperSubscription.getSubscriberAddress());
        System.out.println("Rate: " + onlineNewspaperSubscription.getRate());
    }
}
