package com.jackcattanach.PokerTool.dto;

import lombok.Data;

import java.util.List;

@Data
public class HandHistoryDto {

    private Long handId;

    private Long gameId;

    private List<HandDto> hands;

    private List<BetDto> bets;

    private String notes;
}
