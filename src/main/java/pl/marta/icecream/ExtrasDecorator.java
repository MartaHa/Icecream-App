package pl.marta.icecream;

import pl.marta.icecream.entity.Icecream;

import java.util.List;

public class ExtrasDecorator extends IcecreamDecorator {
protected List<Extra> extras;

    public ExtrasDecorator(Extra fruits, Icecream icecream) {
        super(icecream);
    }

    @Override
    public void buy(int id, int numberOfSnoops) {
        super.buy(id, numberOfSnoops);
        System.out.println("The extras: ");
        extras.forEach(extra -> System.out.println(extra));
    }
}