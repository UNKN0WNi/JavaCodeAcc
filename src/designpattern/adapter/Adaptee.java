package designpattern.adapter;

/**
 * 需要适配的类
 * 
 * @author liu yuning
 *
 */
public class Adaptee {

    public void specificRequest() {
	System.out.println("客户所期待的请求！");
    }

}
