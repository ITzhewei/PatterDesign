package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2016/10/24.
 */
public class RootNode extends IRoot {
    //存储节点的容器
    private List<IRoot> roots = new ArrayList<>();


    public RootNode(String name) {
        super(name);
    }

    /**
     * 添加子节点
     */
    public void addChild(IRoot child) {
        roots.add(child);
    }

    /**
     * 移除子节点
     */
    public void removeChild(IRoot child) {
        roots.remove(child);
    }

    /**
     * 得到指定位置的子节点
     */
    public IRoot getChild(int index) {
        return roots.get(index);
    }


    @Override
    public void print() {
        System.out.println(name);
    }
}
