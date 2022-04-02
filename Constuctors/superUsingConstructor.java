class a
{
    public a()
    {
        System.out.println("in a");
    }
    public a(int i)
    {
        System.out.println("in a int");
    }
}
class b extends a
{
    public b()
    {
        super(5);
        System.out.println("in b");
    }
    public b(int i)
    {
        System.out.println("in b int");
    }
}
public class superUsingConstructor {
    public static void main(String[] args) {
        b obj = new b();
        // when we make object of child class having constructor it will automatically call the constructor of parent
        // hence the out will be "in a"  and "in b"
    }
}
