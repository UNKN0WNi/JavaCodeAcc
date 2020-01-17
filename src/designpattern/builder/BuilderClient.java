package designpattern.builder;

/**
 * 建造客户端
 * 传入建造者，生产出对应类型产品，
 * @author liu yuning
 *
 */
public class BuilderClient {

    public static void main(String[] args) {
	Director director = new Director();
	Builder builder1 = new ConcreteBuilder1();
	Builder builder2 = new ConcreteBuilder2();

	//建造一个builder1
	director.construct(builder1);
	//获取建造的产品
	Product product1 = builder1.getBuildResult();
	product1.show();

	director.construct(builder2);
	Product product2 = builder2.getBuildResult();
	product2.show();

    }

}
