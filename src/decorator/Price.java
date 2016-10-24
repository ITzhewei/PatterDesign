package decorator;

/**
 * Created by john on 2016/10/20.
 * 这是一个单例,用来保存总价格
 */
public class Price {
    private static Price mPrice;
    public double price;

    private Price() {

    }

    public static Price getmPrice() {
        if (mPrice == null) {
            mPrice = new Price();
        }
        return mPrice;
    }
}
