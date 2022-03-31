class P
{
    public void m1()
    {
        System.out.println("parent method");
    }
}
class C extends P
{
    public void m2()
    {
        System.out.println("child method");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        P obj = new P();
        obj.m1();
       // obj.m2(); child object is not implemented by using parent reference
        // as child is not by default available to parent.
        C obj1 = new C();
        obj1.m1();
        obj1.m2();
        // here child can use method in own class as well as parent class methods
        P obj2 = new C();
        // parent reference can be use to hold child class
        obj2.m1();
       //  obj2.m2(); not possible compiler error
        //C obj3 = new P(); incompatible types here p cannot be converted to C
    }
}
