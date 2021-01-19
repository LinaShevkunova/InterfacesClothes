package human.jacket;

public class Parka implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Надеть парку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять парку");
    }
}
