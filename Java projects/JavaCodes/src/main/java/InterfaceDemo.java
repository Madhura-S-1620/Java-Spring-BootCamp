interface flyingObject{
    public void wings();
}

interface flyingvehicles{
    public void engine();
}
class Aeroplane implements flyingvehicles,flyingObject{


    @Override
    public void wings() {
        System.out.println("An aeroplane has 2 wings to fly");
    }

    @Override
    public void engine() {
        System.out.println("without engine aeroplane can't fly");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {


        Aeroplane aeroplane = new Aeroplane();
        aeroplane.wings();
        aeroplane.engine();

    }
}