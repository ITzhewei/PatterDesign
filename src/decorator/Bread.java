package decorator;

/**
 * Created by john on 2016/10/20.
 */
public class Bread extends Receipts {
    public Bread(ISuperMarket superMarket) {
        super(superMarket);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("    面包 230g     4.0");
        Price.getmPrice().price += 4.0;
    }
}
