package protocol.commands;

import com.google.gson.annotations.Expose;
import org.jetbrains.annotations.NotNull;
import protocol.model.Cell;
import protocol.model.Food;

/**
 * @author apomosov
 */
public final class CommandReplicate extends Command {
  @NotNull
  public static final String NAME = "cells";
  @NotNull
  @Expose
  private final Food[] food;
  @NotNull
  @Expose
  private final Cell[] cells;
  public CommandReplicate(@NotNull Food[] food, @NotNull Cell[] cells) {
    super(NAME);
    this.food = food;
    this.cells = cells;
  }

  @NotNull
  public protocol.model.Cell[] getCells() {
    return cells;
  }

  @NotNull
  public Food[] getFood() {
    return food;
  }
}
