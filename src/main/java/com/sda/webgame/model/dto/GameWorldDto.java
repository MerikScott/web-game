package com.sda.webgame.model.dto;

public class GameWorldDto {
    private String name;
    private int SizeRowsColumns;

    public GameWorldDto() {
    }

    public GameWorldDto(String name, int sizeRowsColumns) {
        this.name = name;
        this.SizeRowsColumns = sizeRowsColumns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeRowsColumns() {
        return SizeRowsColumns;
    }

    public void setSizeRowsColumns(int sizeRowsColumns) {
        SizeRowsColumns = sizeRowsColumns;
    }
}
