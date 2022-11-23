package com.company;

import java.util.ArrayList;
import java.util.List;

public class An implements Element{
    public String name;
    public List<Element> grupe = new ArrayList<>();

    public An(String n){
        this.name = n;
    }


    @Override
    public Element add(Element e) {
        grupe.add(e);
        return e;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);


    }

    @Override
    public void print(){
        System.out.print(name);
    }


    public void visit(){

        for(Element e: grupe){
            System.out.println(e);
        }

    }


}
