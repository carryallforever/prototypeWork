package com.pattern;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/16 10:44
 * @Description:
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype){
        return (Prototype) concretePrototype.clone();
    }
}
