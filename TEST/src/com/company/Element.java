package com.company;


public interface Element {

    Element add(Element e);
    void accept(Visitor v);


    void print();
}
