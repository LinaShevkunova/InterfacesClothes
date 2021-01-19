package human.shoes;

public class Boots implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надеть сапоги");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять сапоги");
    }
}
