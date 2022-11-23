package com.company;

public class PrintVisitor implements Visitor {


    @Override
    public void visit(Student s) {
        System.out.println(s.nume+ " "+s.email);
    }

    @Override
    public void visit(Semigrupa sg) {
    System.out.println("     " + sg.nume);
    }

    @Override
    public void visit(Grupa g) {

        System.out.println("  " + g.nume_grupa);
    }

    @Override
    public void visit(An a) {

        for (Element e : a.grupe) {
            e.print();
        }
    }


}
