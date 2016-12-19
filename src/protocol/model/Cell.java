package protocol.model;

import com.google.gson.annotations.Expose;

import java.awt.geom.Point2D;

/**
 * @author apomosov
 */
public abstract class Cell {
    @Expose
    private final double mass;
    @Expose
    private final double radius;
    @Expose
    private final double x, y;

    protected Cell() {
        mass = 0;
        x = 0;
        y = 0;
        radius = 0;
    }

    public Cell(double mass, Point2D coordinate, double radius) {
        this.mass = mass;
        this.x = coordinate.getX();
        this.y = coordinate.getY();
        this.radius = radius;
    }

    public Point2D getCoordinate() {
        return new Point2D.Double(x, y);
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
