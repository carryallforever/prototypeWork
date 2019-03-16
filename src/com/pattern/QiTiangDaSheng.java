package com.pattern;

import sun.plugin.PluginURLJarFileCallBack;

import java.io.*;
import java.util.Date;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/16 11:37
 * @Description:
 */
public class QiTiangDaSheng extends Monkey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;

    public QiTiangDaSheng(){
        //只是初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone(){
        return this.deepClone();
    }

    private Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
//            oos.flush();
//            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTiangDaSheng copy = (QiTiangDaSheng)ois.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public QiTiangDaSheng shallowClone(QiTiangDaSheng target){
        QiTiangDaSheng qiTiangDaSheng = new QiTiangDaSheng();
        qiTiangDaSheng.height = target.height;
        qiTiangDaSheng.weight = target.weight;
        qiTiangDaSheng.jinGuBang = target.jinGuBang;
        qiTiangDaSheng.birthday = target.birthday;
        return qiTiangDaSheng;

    }
}
