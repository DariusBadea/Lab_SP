package models;

import Services.Visitor;

public interface Element {
    void print();
    void add(Element a);
    void remove(Element x);
    Element get(int i);
    void accept(Visitor v);

}
