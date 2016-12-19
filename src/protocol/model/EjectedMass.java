package protocol.model;

import java.awt.geom.Point2D;

/**
 * Created by xakep666 on 18.12.16.
 */
public final class EjectedMass extends Cell {
    protected EjectedMass() {
    }

    public EjectedMass(double mass, Point2D coordinate, double radius) {
        super(mass, coordinate, radius);
    }
}
