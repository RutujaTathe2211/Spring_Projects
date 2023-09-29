package org.example;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {

    @Override
    public void assest() {
        System.out.println("Nurse is assisting");

    }
}
