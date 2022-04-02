interface house
{
    void show();
    // from 1.8 version of java we can define method in interface using default keyword
    default void m1()
    {
        System.out.println("default method in abstract");
    }
}
class chawl implements house
{
    public void show()
    {
        System.out.println("abstract method in interface");
    }
}
public class DefaultInInterface {
    public static void main(String[] args) {
        chawl c = new chawl();
        c.show();
        c.m1();
    }
}
