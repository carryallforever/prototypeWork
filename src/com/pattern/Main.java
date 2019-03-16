package com.pattern;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //原型模式
        PersonDTO dto = new PersonDTO();
        dto.setName("tom");
        dto.setAge("22");
        dto.setSex("男");
        dto.setComeFrom("河南");
        dto.setCity("河南");
        dto.setProvinces("河南");
        dto.setEducation("大学");
        dto.setHobby("运动");
        PersonVO vo = new PersonVO();
        vo.setAge(dto.getAge());
        vo.setName(dto.getName());
        vo.setSex(dto.getSex());
        vo.setCity(dto.getCity());
        vo.setComeFrom(dto.getComeFrom());
        vo.setProvinces(dto.getProvinces());
        vo.setEducation(dto.getEducation());
        vo.setHobby(dto.getHobby());
        System.out.println(vo.toString());

        //原型模式之后
        PersonVO  vo2 = dto.getPersonVO(dto);
        System.out.println(vo2);


    }
}
