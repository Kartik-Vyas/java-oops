package pack2;
import pack1.A;
public class B {
    public static void m2()
    {
        System.out.println("stattic in b");
    }
    public static void m3()
    {
        m2();
        System.out.println("stat in b");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.m1();
        B.m3();
    }
}
