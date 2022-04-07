package com.jackcattanach.PokerTool.Dtos;

import lombok.Data;

@Data
public class BlindStructure {

    private Double smallBlind;

    private Double bigBlind;

    private Double thirdBlind = null;

    private Integer blindLevels;

}
