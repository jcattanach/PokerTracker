package com.jackcattanach.PokerTool.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class GameInfoDto {

    private Long gameId;

    private Long userId;

    private String gameType; // cash or tournament

    private Date date;

    private BigDecimal buyInAmount;

    private BlindStructureDto blindStructure;

    private Integer numberOfPlayers;

    private BigDecimal winLossAmount;

    private List<HandDto> memorableHands;
}
