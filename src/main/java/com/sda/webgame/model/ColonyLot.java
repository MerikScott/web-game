package com.sda.webgame.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ColonyLot {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private BuildingType buildingType;

    private int level;

    private LocalDateTime upgradeFinishTime;

    @ManyToOne
    @JsonIgnore
    private Colony colony; //do której kolonii należy

    public ColonyLot() {
    }

    public ColonyLot(BuildingType buildingType, int level, LocalDateTime upgradeFinishTime, Colony colony) {
        this.buildingType = buildingType;
        this.level = level;
        this.upgradeFinishTime = upgradeFinishTime;
        this.colony = colony;
    }

    public ColonyLot(BuildingType buildingType, int level, Colony colony) {
        this.buildingType = buildingType;
        this.level = level;
        this.colony = colony;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Colony getColony() {
        return colony;
    }

    public void setColony(Colony colony) {
        this.colony = colony;
    }

    public LocalDateTime getUpgradeFinishTime() {
        return upgradeFinishTime;
    }

    public void setUpgradeFinishTime(LocalDateTime upgradeFinishTime) {
        this.upgradeFinishTime = upgradeFinishTime;
    }
}
