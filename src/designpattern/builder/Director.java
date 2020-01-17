package designpattern.builder;

/**
 * 指挥者类，用来指挥建造过程
 *
 * @author liu yuning
 */
public class Director {
    //建造指挥者需要了解建造过程。而建造的不一定是对象，可能是实现一个完成的动作
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
