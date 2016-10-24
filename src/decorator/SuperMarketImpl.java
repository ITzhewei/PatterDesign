package decorator;

/**
 * Created by john on 2016/10/20.
 */
public class SuperMarketImpl extends ISuperMarket {


    @Override
    public void print() {
        System.out.println("     东北大学超市                             ");
        System.out.println("-----------------------");
    }

    @Override
    public void addGoods(ISuperMarket iSuperMarket) {

    }
}
