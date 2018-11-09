package pl.marta.icecream;

import pl.marta.icecream.entity.Icecream;

public class BasicIcecream implements Icecream {

    @Override
    public void buy(int id, int numberOfSnoops) {
        System.out.println("You have bought basic icecream: " + numberOfSnoops + " snoops " );
    }
}
