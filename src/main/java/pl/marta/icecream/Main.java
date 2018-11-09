package pl.marta.icecream;

import pl.marta.icecream.entity.Icecream;

import java.util.ArrayList;
import java.util.List;

import static pl.marta.icecream.IcecreamFlavour.CARMEL;
import static pl.marta.icecream.IcecreamFlavour.CHOCOLATE;
import static pl.marta.icecream.IcecreamFlavour.VANILLA;

public class Main {
    public static void main(String[] args) {

        List<IcecreamFlavour> icecreamFlavours = new ArrayList<>();
        icecreamFlavours.add(VANILLA);
        icecreamFlavours.add(CARMEL);
        icecreamFlavours.add(CHOCOLATE);


        Icecream icecreamOrder1 = new IcecreamFlavourDecorator( new BasicIcecream(), icecreamFlavours );
        icecreamOrder1.buy(1,3);
    }
}