abstract class vehicle
{
    public abstract int getNoOfWheels();
}
class bus extends vehicle{
    public int getNoOfWheels()
    {
        return 4;
    }
}
class bike extends vehicle{
    public int getNoOfWheels()
    {
        return 2;
    }
}
public class VehicleAbstract {
    public static void main(String[] args) {
        bus b = new bus();
        System.out.println(b.getNoOfWheels());
        bike b1 = new bike();
        System.out.println(b1.getNoOfWheels());
    }
}
