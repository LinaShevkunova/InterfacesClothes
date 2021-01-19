package human.trousers;

public class Jeans implements ITrousers{
    @Override
    public void putOn() {
        System.out.println("Надеть джинсы");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять джинсы");
    }
}
