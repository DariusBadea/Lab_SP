package com.company;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    public String name;
    public Image image;
    public Paragraph paragraph;
    public Table table;
    public List<String> contents=  new ArrayList<>();

    public SubChapter(String name){
        this.name = name;
    }

    public void createNewParagraph(String pn){
        this.contents.add(pn);
    }
    public void createNewImage(String in){
        this.contents.add(in);
    }
    public void createNewTable(String tn){
        this.contents.add(tn);
    }

    public String print(){
        System.out.println("      " + name);
        for (String e:contents){
            System.out.println(e);
        }
        return " ";
    }

}
