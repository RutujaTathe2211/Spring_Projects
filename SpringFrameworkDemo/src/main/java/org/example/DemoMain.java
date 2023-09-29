package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

        //for annotation based configuration
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);

       // get value by defining class name //we get same object
        Doctor d=context.getBean(Doctor.class);
        d.assest();
        d.setQualification("MBBS");
        //System.out.println(d);

        Doctor d1=context.getBean(Doctor.class);
        System.out.println(d1);
//
//        //get value by using id from spring xml//type casting are required
//        Nurse n= (Nurse) context.getBean("nurse");
//        n.asset();

        Staff s=context.getBean(Doctor.class);
        s.assest();

        Staff s2=context.getBean(Nurse.class);
        s2.assest();

            }
}
