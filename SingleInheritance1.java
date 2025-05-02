class Employee
{
void work()
{
    System.out.println("Workinggg");
}
}
class Manager extends Employee{
 void attentedMeeting()
 {
    System.out.println("Attened Meeting ");
 }
}
public class SingleInheritance1
 {
    public static void main(String[] args)
     {
      Manager obj = new Manager();

      obj.attentedMeeting();
      obj.work();
     }
}
