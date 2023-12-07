package shivajava;

 abstract class Vehicles
{
    abstract public void price();
    abstract public void noOfWheels();
}

 class AbstractionAB
{

    public static void main(String[] args) {




        RoyalEnfield r = new RoyalEnfield();
        r.noOfWheels();
        r.price();
    } }
class  RoyalEnfield extends Vehicles {
public void price() {
    System.out.println("1.6 Lakhs");}

    public void noOfWheels ()
    {
        System.out.println("Two wheels");
    }

}