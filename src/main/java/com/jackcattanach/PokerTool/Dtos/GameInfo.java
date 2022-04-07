package com.jackcattanach.PokerTool.Dtos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class GameInfo {

    private long gameId;

    private String gameType; // cash or tournament

    private Date date;

    private BigDecimal buyInAmount;

    private BlindStructure blindStructure;

    private Integer numberOfPlayers;

    private BigDecimal winLossAmount;

    private List<Hands> memorableHands;
}
