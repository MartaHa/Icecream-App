package pl.marta.icecream;

import pl.marta.icecream.entity.Icecream;

import java.util.List;

public class IcecreamFlavourDecorator extends IcecreamDecorator {

    protected List<IcecreamFlavour> icecreamFlavours;

    public IcecreamFlavourDecorator(Icecream icecream, List <IcecreamFlavour>icecreamFlavours) {
        super(icecream);
        this.icecreamFlavours = icecreamFlavours;
    }

    @Override
    public void buy(int id, int numberOfSnoops) {
        super.buy(id, numberOfSnoops);
        System.out.println("The flavours: ");
        icecreamFlavours.forEach(extra -> System.out.println(icecreamFlavours));
    }
    

}
