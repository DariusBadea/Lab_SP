package com.company;

public class Student implements Element {
    public String nume;
    public String email;

    public Student(String n, String m){
        this.nume = n;
        this.email = m;
    }


    @Override
    public Element add(Element e) {
        return e;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }



    @Override
    public void print() {
        System.out.println("          " + nume + ", " + email);
    }


}
