interface interf
{
    public void m1();
    public void m2();
//    In interface the parent class is just used for declaring the method
//    the method declared inside parent class must be public and abstract
//    all the method provided in parent class its implementation must to be provided in child class
}
abstract class Service implements interf
{
 public void m1()
 {

 }
 public  abstract void m2();
}
class subService extends Service
{
    public void m2()
    {

    }
}
public class InterfaceDemo {
    public static void main(String[] args) {

    }
}
