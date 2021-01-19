package human.trousers;

public class Pants implements ITrousers{
    @Override
    public void putOn() {
        System.out.println("Надеть брюки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять брюки");
    }
}
