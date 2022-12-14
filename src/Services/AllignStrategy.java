package Services;

import models.Context;
import models.Paragraph;

public interface AllignStrategy {
    void render(Paragraph p, Context c);
}
