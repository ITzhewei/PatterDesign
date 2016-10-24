package decorator;

/**
 * Created by john on 2016/10/20.
 */
public class Receipts extends ISuperMarket {

    private ISuperMarket superMarket;

    public Receipts(ISuperMarket superMarket) {
        this.superMarket = superMarket;

    }

    @Override
    public void print() {
    }

//    @Override
//    public void addGoods(ISuperMarket iSuperMarket) {
//        receiptsList.add((Receipts) iSuperMarket);
//    }
//
//    @Override
//    public void finalDo() {
//
//    }
}
