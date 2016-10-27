package Builder;

import java.util.Scanner;

/**
 * Created by john on 2016/10/20.
 */
public class Client {
    public static void main(String[] args) {

        Builder build = new BuilderImpl();
        Director director = new Director(build);

        System.out.println("请输入要构建的满二叉树的深度");
        int depth = new Scanner(System.in).nextInt();
        //根据深度添加节点
        director.construct(depth);
        //对每个结点进行对齐操作
        director.createTree();
        //
        director.print();
    }
}
