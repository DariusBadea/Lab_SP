package models;

import Services.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    public String name;
    public String author;

    public List<Element> contents = new ArrayList<Element>();

    public Book(String nume){
        super(nume);
        this.name = nume;
    }

    public void addAuthor(Author autor){
        this.author = autor.name;
    }

    public void print(){
        System.out.println("      " + name);
        System.out.println(author);
        System.out.println(" ");
        for (Element e:contents){
            e.print();
        }
    }

    public void addContent(Element x) {
    contents.add(x);
    }


    @Override
    public void accept(Visitor v) {
        v.visit(this);
        for(Element e:contents){
            e.accept(v);}
    }
}
