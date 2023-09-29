package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.PrimitiveIterator;
//@Component //class has component to beans of spring
@Scope(scopeName = "singleton") //used to define scope for object
public class Doctor implements Staff , BeanNameAware {
    private String qualification;
    private Nurse nurse;
//    Doctor(String qualification){
//        this.qualification=qualification;
//    }
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }

    //we need to create loose coupling for object//we create another class for qualification-for unit testing
    //loose coupling -for unit testing in separately and together
    //Qualification qualification;
    @Override
    public void assest() {
        System.out.println("Doctor is assesting.");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("set bean name method is called");
    }
@PostConstruct
    public void postConstruct(){
        System.out.println("post construct method is called.");
    }

}
