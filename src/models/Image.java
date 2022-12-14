package models;

import Services.Visitor;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    public String imageName;
    public String url;
    public PictureContent content;


    public Image(String in) {
        this.imageName = in;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
