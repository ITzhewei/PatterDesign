package Composite;

/**
 * Created by john on 2016/10/24.
 */
public class Node extends IRoot {
    public Node(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
