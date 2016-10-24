package Composite;

/**
 * Created by john on 2016/10/24.
 */
public class Client {

    public static void main(String[] args) {
        RootNode root = new RootNode("Level_1");

        RootNode brance1 = new RootNode("Level_2_1");
        RootNode brance2 = new RootNode("Level_2_2");

        Node level_3_1_1 = new Node("Level_3_1_1");
        Node level_3_1_2 = new Node("Level_3_1_2");
        Node level_3_2_1 = new Node("Level_3_2_1");
        Node level_3_2_2 = new Node("Level_3_2_2");

        root.addChild(brance1);
        root.addChild(brance2);

        brance1.addChild(level_3_1_1);
        brance1.addChild(level_3_1_2);

        brance2.addChild(level_3_2_1);
        brance2.addChild(level_3_2_2);
    }
}
