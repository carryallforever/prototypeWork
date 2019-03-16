package com.pattern;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/16 10:25
 * @Description:
 */
public class PersonVO {

    String name;

    String comeFrom;

    String provinces;

    String city;

    String age;

    String sex;

    String education;

    String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
    }

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "PersonVO{" +
                "name='" + name + '\'' +
                ", comeFrom='" + comeFrom + '\'' +
                ", provinces='" + provinces + '\'' +
                ", city='" + city + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", education='" + education + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
