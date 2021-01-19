package human;

import human.jacket.*;
import human.shoes.*;
import human.trousers.*;

public class Human implements IHuman {

    private IJacket jacket;
    private IShoes shoes;
    private ITrousers trousers;
    private String name;

    public Human(String name, IJacket jacket, IShoes shoes, ITrousers trousers) {
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
        this.name = name;
    }

    public Human() {
    }

    @Override
    public void putOnClothes() {
        jacket.putOn();
        shoes.putOn();
        trousers.putOn();
    }

    @Override
    public void takeOffClothes() {
        jacket.takeOff();
        shoes.takeOff();
        trousers.takeOff();
    }

    @Override
    public String toString() {
        return name;
    }
}
