package com.company;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    public String sectionTitle;

    List<Element> contents = new ArrayList<Element>();

    public Section (String text){
    this.sectionTitle = text;
    }

    @Override
    public void print() {
        System.out.println(sectionTitle);
    for (Element e: contents){
        e.print();
    }
    }

    @Override
    public void add(Element a) {
    contents.add(a);
    }

    @Override
    public void remove(Element x) {

    }

    @Override
    public Element get(int i) {
        return null;
    }
}
