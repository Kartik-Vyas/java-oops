interface  parent
{
      void show();
}
class pen implements parent
{
    public void show()
    {
        System.out.println("in pen");
    }
}
class pencil implements parent
{
    public void show()
    {
        System.out.println("in pencil");
    }
}
class kit
{
    public void download(parent p)
    {
        p.show();
    }

//    public void download(pencil pc)
//    {
//        pc.show();
//    }
}
public class InterfaceMain {
    public static void main(String[] args) {
        parent obj = new pen();
        kit obj1 = new kit();
        parent obj2 = new pencil();
        obj1.download(obj);
        obj1.download(obj2);

    }
}
