package protocol.model;

import com.google.gson.annotations.Expose;

import java.awt.geom.Point2D;

/**
 * Created by xakep666 on 18.12.16.
 */
public final class PlayerCell extends Cell {
    @Expose
    private final int cellId;
    @Expose
    private final int playerId;

    public PlayerCell(int cellId, float size, Point2D coordinate, int playerId) {
        super(size, coordinate);
        this.playerId = playerId;
        this.cellId = cellId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getCellId() {
        return cellId;
    }
}
