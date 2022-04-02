class Animal
{
    public void show()
    {
        System.out.println("in a show");
    }
}
class Bat extends Animal
{
    public void show()
    {
        super.show();
        // super is used to call parent method whenever bat method is called 
        System.out.println("in b show");
    }
}
public class SuperInOverloading {
    public static void main(String[] args) {
        Bat obj = new Bat();
        obj.show();
    }
}
