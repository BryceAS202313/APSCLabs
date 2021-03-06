package ca.thenetworknerds.APCS.lab10.language.c;

import java.awt.*;

public class ObjectiveC extends C {
    public ObjectiveC() {
        extension = "m";
    }

    @Override
    public void paintIcon(Graphics2D g2d, int startX, int startY) {
        super.paintIcon(g2d, startX, startY);
        g2d.drawString("*", startX + 25 - (int) (3 * g2d.getFontMetrics().getStringBounds("C", g2d).getWidth() / 2),
                startY + 20 + g2d.getFontMetrics().getHeight() / 2);
    }
}
