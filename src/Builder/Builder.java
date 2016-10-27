package Builder;

/**
 * Created by john on 2016/10/20.
 */
public abstract class Builder {

    //创建节点
    public abstract void buildNode();

    //创建树
    public abstract void retrieveTree();

    //得到树的根节点
    public abstract Node getRoot();
}
