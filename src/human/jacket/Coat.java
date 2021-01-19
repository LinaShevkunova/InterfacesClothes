package human.jacket;

public class Coat implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Надеть пальто");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять пальто");
    }
}
