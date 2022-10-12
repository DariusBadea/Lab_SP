package com.company;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    public String name;
    public List<SubChapter> contents = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String title){
        SubChapter sub = new SubChapter(title);
        contents.add(sub);
        return contents.indexOf(sub);
    }

    public SubChapter getSubChapter(int index){
        SubChapter subchapter = new SubChapter(contents.get(index).name);
        return subchapter;
    }

    public String print(){
        System.out.println("      " + name);
        for (SubChapter e:contents){
            System.out.println(e);
        }
        return " ";
    }

}
