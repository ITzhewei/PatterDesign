package decorator;

/**
 * Created by john on 2016/10/20.
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        ISuperMarket superMarket = new SuperMarketImpl();
        superMarket.addGoods(new Coke(superMarket));
        superMarket.addGoods(new Bread(superMarket));
        superMarket.finalDo();
    }
}
