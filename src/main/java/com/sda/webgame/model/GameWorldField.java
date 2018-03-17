package com.sda.webgame.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class GameWorldField {
    @Id
    @GeneratedValue
    private long id;
    private WorldFieldType fieldType;
    private int positionColumn;
    private int positionRow;

    @ManyToOne
    private GameWorld world;

    public GameWorldField() {
    }

    public GameWorldField(WorldFieldType fieldType, int positionRow, int positionColumn, GameWorld world) {
        this.fieldType = fieldType;
        this.positionColumn = positionColumn;
        this.positionRow = positionRow;
        this.world = world;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public WorldFieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(WorldFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public int getPositionColumn() {
        return positionColumn;
    }

    public void setPositionColumn(int positionColumn) {
        this.positionColumn = positionColumn;
    }

    public int getPositionRow() {
        return positionRow;
    }

    public void setPositionRow(int positionRow) {
        this.positionRow = positionRow;
    }

    public GameWorld getWorld() {
        return world;
    }

    public void setWorld(GameWorld world) {
        this.world = world;
    }
}
