package Builder;

/**
 * Created by john on 2016/10/20.
 */
public abstract class Node {

    //是否为
    public abstract boolean isRoot();

    //父节点
    public abstract void addParentNode(Node parentNode);
    public abstract void removeParentNode();
    public abstract Node getParentNode();

    //子节点
    public abstract Node addSubNode(Node node);
    public abstract void clearSubNodes();

    //左叶子
    public abstract Node getLeftNode();
    public abstract void setLeftNode(Node leftNode);

    //右叶子
    public abstract Node getRightNode();
    public abstract void setRightNode(Node rightNode);

    //name
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String reName(Node node);

    //level
    public abstract int getLevel();
    public abstract void setLevel(int i);
    public abstract void operation();
}
