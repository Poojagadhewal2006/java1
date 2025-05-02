class Person
{
     void displayName()
    {
      System.out.println("Manoj");
    }
}
class Student extends Person
{
    void displayClass()
    {
        System.out.println("Class");
    }
}
class Moniter extends Student
{
    void checkDicipline()
    {
        System.out.println("Disipline");
    }
}
public class Multilevel1 {
    public static void main(String[] args) {
        Moniter m = new Moniter();
        m.checkDicipline();
        m.displayClass();
        m.displayName();
    }
}
