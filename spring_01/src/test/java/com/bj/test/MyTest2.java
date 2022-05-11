package com.bj.test;

import com.bj.pojo2.School;
import com.bj.pojo2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
//    @Test
//    public void testSchool(){
//        School school = new School();
//        System.out.println(school);
//    }
    @Test
    public void testSchoolSpring(){
        //由spring容器进行对象的创建
        //如果想从spring容器中取出对象,则要先创建容器对象,并启动才可以取对象.
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        //取出对象
        School school = (School) ac.getBean("school");
        System.out.println(school);
    }
    @Test
    public void testSchoolSpring2(){
        //由spring容器进行对象的创建
        //如果想从spring容器中取出对象,则要先创建容器对象,并启动才可以取对象.
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        //取出对象
        Student stu= (Student) ac.getBean("stu");
        System.out.println(stu);
    }
}
