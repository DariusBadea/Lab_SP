package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String name;
    public String author;

    public List<String> contents = new ArrayList<String>();

    public Book(String nume){
        this.name = nume;
    }

    public void addAuthor(Author autor){
        this.author = autor.name;
    }

    public int createChapter(String nameOfChapter){
        contents.add(nameOfChapter);
        return contents.indexOf(nameOfChapter);
    }

    public Chapter getChapter(int index){
        Chapter chapter = new Chapter(contents.get(index));
        return chapter;
    }


    public String print(Book carte){
        System.out.println("      " + name);
        for (String e:contents){
            System.out.println(e);
        }
        return " ";
    }
}
