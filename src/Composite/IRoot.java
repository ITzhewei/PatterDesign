package Composite;

/**
 * Created by john on 2016/10/24.
 * 根节点
 */
public abstract class IRoot {
    protected String name; //节点的名称

    public IRoot(String name) {
        this.name = name;
        print();
    }

    /**
     * 输出任务
     */
    public abstract void print();
}
