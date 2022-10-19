package com.company;

public class Paragraph implements Element{
    public String text;

    public Paragraph(String pn){
        this.text = pn;
    }

    public void print(){
        System.out.println("Paragraph: "+ text);
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
