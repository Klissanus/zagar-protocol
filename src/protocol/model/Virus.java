package protocol.model;

import java.awt.geom.Point2D;

/**
 * Created by xakep666 on 18.12.16.
 */
public final class Virus extends Cell {
    protected Virus() {
    }

    public Virus(double mass, Point2D coordinate) {
        super(mass, coordinate);
    }
}
