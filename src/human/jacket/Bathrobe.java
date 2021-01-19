package human.jacket;

public class Bathrobe implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Надеть халат");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять халат");
    }
}
