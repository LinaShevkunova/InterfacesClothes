package human.shoes;

public class Sneakers implements IShoes{
    @Override
    public void putOn() {
            System.out.println("Надеть кроссовки");
        }

    @Override
    public void takeOff() {
            System.out.println("Снять кроссовки");
        }
}

