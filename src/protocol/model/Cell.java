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
  private final Point2D coordinate;

  protected Cell() {
    size=0;
    coordinate=new Point2D.Double(0,0);
  }

  public Cell(float size, Point2D coordinate) {
    this.size = size;
    this.coordinate = coordinate;
  }

  public Point2D getCoordinate() {return coordinate;}

  public float getSize() {
    return size;
  }
}
