package Services;

import models.*;

public interface Visitor {
    void visit(Section s);
    void visit(Paragraph p);
    void visit(Table t);
    void visit(Image i);
    void visit(Book b);
    void visit(TableOfContents tc);
}
