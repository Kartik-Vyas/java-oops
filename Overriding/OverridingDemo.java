 class P1 {
     public void property() {
         System.out.println("cash and property");
     }

     public void marry() {
         System.out.println("any girl");
     }
 }
   class C1 extends P1
   {
    public void marry()
    {
       System.out.println("Specific girl");
    }
   }
public class OverridingDemo
{
    public static void main(String[] args) {
        P1 obj = new P1();
        obj.marry();
        C1 obj1 = new C1();
        obj1.marry();
        P1 obj2 = new C1();
        obj2.marry();
        // parent refence can be used to hold child object
        // in overriding method resolution is taken care by JVM based on runtime object
        // hence the output of the object in case of method overrind is determined by runtime object
    }
}
