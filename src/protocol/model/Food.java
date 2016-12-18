package protocol.model;

import java.awt.geom.Point2D;

/**
 * @author apomosov
 */
public final class Food extends Cell{
  protected Food() {}
  public Food(float size, Point2D coordinate) {
    super(size, coordinate);
  }
}
