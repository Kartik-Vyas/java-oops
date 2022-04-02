class student
{
    private int rollno;
    private String name;
    public int getRollno()
    {
        return rollno ;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String s)
    {
        name = s;
    }
    public void setRollno(int r)
    {
        rollno = r;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        student obj = new student();
        obj.setRollno(5);
        obj.setName("kartik");
        System.out.println(obj.getRollno());
        System.out.println(obj.getName());
    }
}
