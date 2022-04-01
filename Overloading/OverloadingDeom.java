class test
{
    public void m1()
    {
        System.out.println("in m1 default");
    }
    public void m1(int i)
    {
        System.out.println("in int m1 having input of " + i);
    }
    public void m1(double i)
    {
        System.out.println("in double m1 having the input of " + i);
    }
}
public class OverloadingDemo {
    public static void main(String[] args) {
        test t = new test();
        t.m1();
        t.m1(10);
        t.m1(5.5);
        t.m1('a');
        // here we have put a char type which is checked by compiler and its giving the output of next higher order type in which it 
        //can have the value. here int can have the value of char hence int is applicable
        t.m1(10.5f);
        // similarly float can take its next value which is double
        
    }
}
