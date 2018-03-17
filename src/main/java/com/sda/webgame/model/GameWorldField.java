package com.sda.webgame.model;

import com.sun.deploy.xml.GeneralEntity;

import javax.persistence.*;

@Entity
public class GameWorldField {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private WorldFieldType fieldType;
    private int positionColumn;
    private int positionRow;

    @ManyToOne
    private GameWorld gameWorld;

    public GameWorldField() {
    }

    public GameWorldField(WorldFieldType fieldType, int positionColumn, int positionRow, GameWorld gameWorld) {
        this.fieldType = fieldType;
        this.positionColumn = positionColumn;
        this.positionRow = positionRow;
        this.gameWorld = gameWorld;
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

    public GameWorld getGameWorld() {
        return gameWorld;
    }

    public void setGameWorld(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
    }
}
