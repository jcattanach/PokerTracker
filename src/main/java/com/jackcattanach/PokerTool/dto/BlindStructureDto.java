package com.jackcattanach.PokerTool.dto;

import lombok.Data;

@Data
public class BlindStructureDto {

    private Long handId;

    private Double smallBlind;

    private Double bigBlind;

    private Double thirdBlind = null;

    private Integer blindLevels;

}
