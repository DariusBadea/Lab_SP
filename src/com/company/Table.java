package com.company;

public class Table implements Element{
    public String title;

    public Table(String tn) {
    this.title = tn;
    }

    public void print(){
        System.out.println(title);
    }

    @Override
    public void add(Element a) {

    }

    @Override
    public void remove(Element x) {

    }

    @Override
    public Element get(int i) {
        return null;
    }
}
