package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String name;
    public List<String> pagina = new ArrayList<String>();

    public Book(String nume){
        this.name = nume;
    }

    public void createNewParagraph(String Title_paragraph){
        pagina.add(Title_paragraph);}

    public void createNewImage(String link_image){
        pagina.add(link_image);}

    public void createNewTable(String table_link){ pagina.add(table_link);}

    public String print(Book carte){
        System.out.println("      " + name);
        for (String e:pagina){
            System.out.println(e);
        }
        return " ";
    }
}
