package protocol.model;

import com.google.gson.annotations.Expose;

import java.awt.geom.Point2D;

/**
 * @author apomosov
 */
public abstract class Cell {
  @Expose
  private final float size;
  @Expose
  private final double x,y;

  protected Cell() {
    size=0;
    x=0;
    y=0;
  }

  public Cell(float size, Point2D coordinate) {
    this.size = size;
    this.x=coordinate.getX();
    this.y=coordinate.getY();
  }

  public Point2D getCoordinate() {return new Point2D.Double(x,y);}

  public float getSize() {
    return size;
  }
}
