package protocol.commands;

import com.google.gson.annotations.Expose;
import org.jetbrains.annotations.NotNull;
import protocol.model.Cell;

import java.util.List;

/**
 * @author apomosov
 */
public final class CommandReplicate extends Command {
    @NotNull
    public static final String NAME = "cells";
    @Expose
    private final List<Cell> cells;

    public CommandReplicate(@NotNull List<Cell> cells) {
        super(NAME);
        this.cells = cells;
    }

    @NotNull
    public List<Cell> getCells() {
        return cells;
    }
}
