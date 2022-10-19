package com.company;

public class Image implements Element {
    public String imageName;

    public Image(String in) {
        this.imageName = in;
    }

    public void print(){
        System.out.println(imageName);
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
