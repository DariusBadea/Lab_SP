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

    public void createNewParagraph(Paragraph pn){
        this.contents.add(pn.text);
    }
    public void createNewImage(Image in){
        this.contents.add(in.imageName);
    }
    public void createNewTable(Table tn){
        this.contents.add(tn.title);
    }

    public String print(Book carte){
        System.out.println("      " + name);
        for (String e:contents){
            System.out.println(e);
        }
        return " ";
    }

}
