package com.company;

public class Main {

    public static void main(String[] args) {

        Element info3 = new An("Informatica 3")
                .add(new Grupa("Grupa 1"))
                    .add(new Semigrupa("Semigrupa 1.1"))
                         .add(new Student("Popescu I", "pop@gmail.com"))
                         .add(new Student("Popescu D", "pop@gmail.com"))
                    .add(new Semigrupa("Semigrupa 1.2"))
                         .add(new Student("Popescu M", "pop@gmail.com"))
                         .add(new Student("Popescu C", "pop@gmail.com"))
                .add(new Grupa("Grupa 2"));


        Visitor printVisitor = new PrintVisitor();

        info3.accept(printVisitor);



    }
}
