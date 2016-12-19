package protocol.model;

import java.awt.geom.Point2D;

/**
 * @author apomosov
 */
public final class Food extends Cell {
    protected Food() {
    }

    public Food(double mass, Point2D coordinate, double radius) {
        super(mass, coordinate, radius);
    }
}
