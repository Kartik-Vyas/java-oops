package vyas.kartik.oops;
 abstract class Vehicle
{
    public abstract int getNoOfWheels();
}
public class AbstractDemo {
     // here since we have declared class and method abstract hence object creation is not possible,hence for implementation child class
//   is required
    Vehicle v = new Vehicle();
    v.getNoOfWheels();
}
