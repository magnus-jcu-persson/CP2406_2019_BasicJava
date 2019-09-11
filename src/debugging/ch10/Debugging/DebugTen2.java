package debugging.ch10.Debugging;

// A Vacation is 10 days
// but an ExtendedVacation is 30 days
public class DebugTen2
{
   public static void main(String args[]) 
   {
      DebugVacation debugVacation = new DebugVacation();
      DebugExtendedVacation debugExtendedVacation = new DebugExtendedVacation();
      System.out.println("My vacation is for " +
              debugVacation.getDays() + " days");
      System.out.println("Your vacation is for " +
              debugExtendedVacation.getDays() + " days");
   }
}
