package pl.marta.icecream;

import pl.marta.icecream.entity.Icecream;

public class IcingDecorator extends IcecreamDecorator {

    protected Icing icing;



    public IcingDecorator(Icecream icecream, Icing icing) {
        super(icecream);
    }

    @Override
    public void buy(int id, int numberOfSnoops) {
        super.buy(id, numberOfSnoops);
        System.out.println("The icing: " + icing);
    }


}