package com.company;

import java.util.ArrayList;
import java.util.List;

public class Grupa implements Element {
    public String nume_grupa;
    public List<Element> semigrupe = new ArrayList<>();


    public Grupa(String name){
        this.nume_grupa = name;
    }


    @Override
    public Element add(Element e) {
        semigrupe.add(e);
        return e;

    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }


    @Override
    public void print() {
        System.out.println("  " + nume_grupa);
    }
}
