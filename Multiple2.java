interface A
{
   void display();
}
interface B
{
    void display();
}
class Demo implements A,B
{
   public void display()
   {
    System.out.println("Hello....");
   }
}
public class Multiple2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}
