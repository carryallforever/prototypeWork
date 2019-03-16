package com.pattern;

import java.io.Serializable;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/16 11:35
 * @Description:
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;
    public void big(){
        this.d *=2;
        this.h *=2;
    }

    public void small(){
        this.d /=2;
        this.h /=2;
    }
}
