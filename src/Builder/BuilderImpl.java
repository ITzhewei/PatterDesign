package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2016/10/20.
 */
public class BuilderImpl extends Builder {

    private List<Node> nodes = new ArrayList<>();

    @Override
    public void buildNode() {
        Node root = new NodeImpl("Level_1");
        nodes.add(root);
    }

    @Override
    public void retrieveTree() {
        //遍历所有的节点
        for (int i = 0; i < nodes.size(); i++) {
            //判断节点是否含有子节点
            if (i * 2 + 2 < nodes.size()) {
                //如果当前节点含有子节点,将其的的两个子节点添加上
                nodes.get(i).addSubNode(nodes.get(i * 2 + 1));
                nodes.get(i).addSubNode(nodes.get(i * 2 + 2));
            }
        }
    }

    @Override
    public Node getRoot() {
        //得到根节点
        Node node = nodes.get(0);
        //返回根节点
        return node;
    }
}
