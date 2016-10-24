package decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2016/10/20.
 */
public abstract class ISuperMarket {

    public ISuperMarket() {
        print();
    }

    private List<Receipts> receiptsList = new ArrayList<>();

    public abstract void print();

    public void addGoods(ISuperMarket iSuperMarket) {
        receiptsList.add((Receipts) iSuperMarket);
    }


    public void finalDo() {
        double price = Price.getmPrice().price;
        System.out.println("                    ");
        System.out.println("    总计:         " + price);
        addGoods(new Message(this));
    }
}
