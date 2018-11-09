package pl.marta.icecream;

import pl.marta.icecream.entity.Icecream;

public class IcecreamDecorator implements Icecream {

    protected Icecream icecream;

    public IcecreamDecorator(Icecream icecream) {
        this.icecream = icecream;
    }


    @Override
    public void buy(int id, int numberOfSnoops) {
        this.icecream.buy(id,numberOfSnoops);
    }
}
