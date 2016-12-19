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
    private final String playerName;

    protected PlayerCell() {
        cellId=0;
        playerName="";
    }

    public PlayerCell(int cellId, float mass, Point2D coordinate, String playerName) {
        super(mass, coordinate);
        this.playerName=playerName;
        this.cellId = cellId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getCellId() {
        return cellId;
    }
}
