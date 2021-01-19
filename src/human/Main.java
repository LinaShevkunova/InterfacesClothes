package human;

import human.jacket.Coat;
import human.jacket.Parka;
import human.jacket.Bathrobe;
import human.shoes.Boots;
import human.shoes.Slippers;
import human.shoes.Sneakers;
import human.trousers.Jeans;
import human.trousers.Pants;
import human.trousers.Shorts;

public class Main {
    public static void main(String[] args) {
        Coat coatJacket = new Coat();
        Parka parkaJacket = new Parka();
        Bathrobe bathrobeJacket = new Bathrobe();

        Boots bootsShoes = new Boots();
        Slippers slippersShoes = new Slippers();
        Sneakers sneakersShoes = new Sneakers();

        Jeans jeansTrousers = new Jeans();
        Pants pantsTrousers = new Pants();
        Shorts shortsTrousers = new Shorts();

        Human[] human = {new Human("Daniel", parkaJacket, sneakersShoes, jeansTrousers),
                new Human("Martin", coatJacket, bootsShoes, pantsTrousers),
                new Human("Marius", bathrobeJacket, slippersShoes, shortsTrousers)
        };

        for (int i = 0; i < human.length; i++) {
            System.out.println(String.format("Действия для %s: ",human[i].toString()));
            human[i].putOnClothes();
            human[i].takeOffClothes();
            System.out.println();
        }
    }
}
