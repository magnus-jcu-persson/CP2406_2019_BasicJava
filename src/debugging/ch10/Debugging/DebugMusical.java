package debugging.ch10.Debugging;

public class DebugMusical extends DebugPlay
{
   protected String composer;
   
   DebugMusical(String title, String author, String comp)
   {
      super(title, author);
      this.composer = comp;
   }
   public void display()
   {
      System.out.println("The performance is " + this.title +
        " by " + author + "\nThe music for " + this.title +
        " is by " + composer);
   }
}