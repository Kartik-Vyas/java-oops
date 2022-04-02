interface  K
{
    public void m1();
}

public class Anonymous {
    public static void main(String[] args) {
    K obj = new K()
    {
        public void m1()
        {
            System.out.println("i m best");
        }
    };
    obj.m1();
    //hence by using anonymous class method we dont need to provide implementation of interface method in child class
    }
}
