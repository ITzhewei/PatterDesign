package Builder;

/**
 * Created by john on 2016/10/20.
 */
public class NodeImpl extends Node {

    private String name;
    private Node parentNode = null;
    private Node leftNode = null;
    private Node rightNode = null;
    private boolean isRoot;
    private int level = 1;

    public NodeImpl(String name) {
        this.name = name;
    }

    @Override
    public boolean isRoot() {
        return isRoot;
    }

    @Override
    public void addParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    @Override
    public void removeParentNode() {
        this.parentNode = null;
    }

    @Override
    public Node getParentNode() {
        return this.parentNode;
    }

    @Override
    public Node addSubNode(Node node) {
        isRoot = true;
        if (this.leftNode == null) {
            this.leftNode = node;
            node.addParentNode(this);
            String name = this.getName();
            node.setName(name);
            String reName = node.reName(node);
            node.setLevel(level + 1);
            node.setName(reName + "_1");
        } else {
            this.rightNode = node;
            node.addParentNode(this);
            String name = this.getName();
            node.setName(name);
            String reName = node.reName(node);
            node.setLevel(level + 1);
            node.setName(reName + "_2");
        }
        return this;
    }

    @Override
    public void clearSubNodes() {
        if (isRoot) {
            this.rightNode.removeParentNode();
            this.leftNode.removeParentNode();
            this.rightNode = null;
            this.leftNode = null;
        }
        isRoot = false;
    }

    @Override
    public Node getLeftNode() {
        return this.leftNode;
    }

    @Override
    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    @Override
    public Node getRightNode() {
        return this.rightNode;
    }

    @Override
    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String reName(Node node) {
        String name = node.getName();
        int index = name.indexOf("_");
        char n = (char) ((int) name.charAt(index + 1) + 1);
        String str2 = String.valueOf(name.charAt(index + 1));
        String x = String.valueOf(n);
        name = name.replaceFirst(str2, x);
        this.setName(name);
        return name;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setLevel(int i) {
        this.level = i;
    }

    @Override
    public void operation() {
        this.getLevel();
        for (int j = 1; j < level; j++) {
            System.out.print("    ");
        }
        System.out.println(this.getName());
        if (isRoot) {
            for (int i = 1; i < this.getLeftNode().getLevel(); i++) {
                System.out.print("    ");
            }
            this.getLeftNode().operation();
            for (int i = 1; i < this.getRightNode().getLevel(); i++) {
                System.out.print("    ");
            }
            this.getRightNode().operation();

        }
    }
}
