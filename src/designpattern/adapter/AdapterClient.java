package designpattern.adapter;

/**
 * 适配器客户端
 * 
 * @author liu yuning
 *
 */
public class AdapterClient {

    public static void main(String[] args) {
	Target target;
//确保使用的target引用了想要执行的类
	target = new Adapter();
	target.request();
	target.send();
    }
}
