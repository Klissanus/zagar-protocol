package protocol.model;

import com.google.gson.annotations.Expose;

import java.awt.geom.Point2D;

/**
 * Created by xakep666 on 18.12.16.
 */
public final class PlayerCell extends Cell {
    @Expose
    private int playerId;

    public PlayerCell(int cellId, float size, Point2D coordinate, int playerId) {
        super(cellId, size, coordinate);
        this.playerId = playerId;
    }

    public int getPlayerId() {
        return playerId;
    }
}
