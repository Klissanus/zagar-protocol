package protocol.model;

import java.awt.geom.Point2D;

/**
 * Created by xakep666 on 18.12.16.
 */
public final class Virus extends Cell {
    public Virus(int cellId, int playerId, float size, Point2D coordinate) {
        super(cellId, size, coordinate);
    }
}
