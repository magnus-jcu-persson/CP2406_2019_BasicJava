package debugging.ch10.Debugging;

public class DebugCustomerMakingPurchase extends DebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;
    public DebugCustomerMakingPurchase(int id, String name, double credit, double purchAmount)
    {
        super(id, name, credit);
        amountOfPurchase = purchAmount;
        overLimit = amountOfPurchase > creditLimit;
    }
    @Override
    public void display()
    {
       display();
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
