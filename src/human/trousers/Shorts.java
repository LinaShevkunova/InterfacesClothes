package human.trousers;

public class Shorts implements ITrousers{
    @Override
    public void putOn() {
        System.out.println("Надеть шорты");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять шорты");
    }
}
