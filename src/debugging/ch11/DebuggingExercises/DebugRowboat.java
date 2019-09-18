package debugging.ch11.DebuggingExercises;

public class DebugRowboat extends DebugBoat
{
   DebugRowboat()
   {
      super("row");
   }
   public void setPassengers()
   {
      super.passengers = 2;
   }
   public void setPower()
   {
      super.power = "oars";
   }
}