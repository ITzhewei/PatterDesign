package decorator;

/**
 * Created by john on 2016/10/20.
 */
public class Message extends Receipts {


    public Message(ISuperMarket superMarket) {
        super(superMarket);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("**********************");
        System.out.println("  14天购物保证。货真价实");
        System.out.println("   东大超市电话83688888");
        System.out.println("**********************");
        System.out.println("   货物售出概不退款 ");
        System.out.println("   保护环境，请勿随意丢");
    }
}
