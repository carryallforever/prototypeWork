package com.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/16 10:46
 * @Description:
 */
public class PrototypeTest {

    public static void main(String[] args) {
        //创建一个需要克隆的对象
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        //填充属性
        concretePrototypeA.setName("prototype");
        concretePrototypeA.setAge(13);
        List<String> hobbis = new ArrayList<>();
        hobbis.add("运动");
        hobbis.add("游戏");
        concretePrototypeA.setHobbis(hobbis);
        System.out.println(concretePrototypeA);
        //创建client对象
        Client client = new Client(concretePrototypeA);
        ConcretePrototypeA concretePrototypeAClone = (ConcretePrototypeA)client.startClone(concretePrototypeA);
        System.out.println(concretePrototypeAClone);

        System.out.println("克隆对象中的引用类型地址值："+concretePrototypeAClone.getHobbis());
        System.out.println("原对象中的引用类型地址值："+concretePrototypeA.getHobbis());
        System.out.println("对象地址比较："+(concretePrototypeA.getHobbis()==concretePrototypeAClone.getHobbis()));


    }
}
