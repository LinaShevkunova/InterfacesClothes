package human.shoes;

public class Slippers implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надеть тапочки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять тапочки");
    }
}
