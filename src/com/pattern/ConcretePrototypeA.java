package com.pattern;

import java.util.List;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/16 10:41
 * @Description:
 */
public class ConcretePrototypeA implements Prototype {

    private int age;
    private String name;
    private List hobbis;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbis() {
        return hobbis;
    }

    public void setHobbis(List hobbis) {
        this.hobbis = hobbis;
    }

    @Override
    public Prototype clone() {

        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        concretePrototype.setHobbis(this.hobbis);
        return concretePrototype;
    }
}
