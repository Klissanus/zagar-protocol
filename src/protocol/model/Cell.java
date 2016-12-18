package protocol.model;

import com.google.gson.annotations.Expose;

import java.awt.geom.Point2D;

/**
 * @author apomosov
 */
public abstract class Cell {
  @Expose
  private final int cellId;
  @Expose
  private final float size;
  @Expose
  private Point2D coordinate;

  public Cell(int cellId, float size, Point2D coordinate) {
    this.cellId = cellId;
    this.size = size;
    this.coordinate = coordinate;
  }

  public Point2D getCoordinate() {return coordinate;}

  public int getCellId() {
    return cellId;
  }

  public float getSize() {
    return size;
  }
}
