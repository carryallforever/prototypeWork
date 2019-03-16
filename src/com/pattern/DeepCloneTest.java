package com.pattern;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/16 11:45
 * @Description:
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        QiTiangDaSheng qiTiangDaSheng = new QiTiangDaSheng();

        QiTiangDaSheng clone = (QiTiangDaSheng) qiTiangDaSheng.clone();

        System.out.println("深克隆："+(qiTiangDaSheng.jinGuBang==clone.jinGuBang));

        QiTiangDaSheng q = new QiTiangDaSheng();
        QiTiangDaSheng n = q.shallowClone(q);
        System.out.println("浅克隆："+(q.jinGuBang == n.jinGuBang));
    }
}
