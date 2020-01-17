package designpattern.adapter;

/**
 * 客户所期待的接口
 * 必须可继承才能修改其行为
 * @author liu yuning
 *
 */
public abstract class Target {
    public void request() {
	System.out.println("原本的请求！");
    }

    public void send() {
        System.out.println("send！");
    }
}
