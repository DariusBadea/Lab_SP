package com.company;

import java.util.ArrayList;
import java.util.List;

public class Semigrupa implements Element {

    String nume;

    public Semigrupa(String name){
        this.nume = name;
    }

    public List<Element> contents = new ArrayList<>();



    public Element add(Element e) {
    contents.add(e);
    return e;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }



    @Override
    public void print() {
        System.out.println("     " + nume);
    }

}
