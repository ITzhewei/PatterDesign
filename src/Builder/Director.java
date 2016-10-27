package Builder;

/**
 * Created by john on 2016/10/20.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //构建节点
    public void construct(int depth) {
        //根据 2*深度 -1  来求 满二叉树 的 节点个数,并创建所有的节点
        for (int i = 0; i < Math.pow(2, depth) - 1; i++) {
            builder.buildNode();
        }
    }

    //构建树
    public void createTree() {
        builder.retrieveTree();
    }

    //得到根节点,并进行打印操作
    public void print() {
        builder.getRoot().operation();
    }


}
