package decorator;

/**
 * Created by john on 2016/10/20.
 * 可乐商品
 */
public class Coke extends Receipts {
    public Coke(ISuperMarket superMarket) {
        super(superMarket);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("    可乐330ml     2.5");
        Price.getmPrice().price += 2.5;
    }
}

