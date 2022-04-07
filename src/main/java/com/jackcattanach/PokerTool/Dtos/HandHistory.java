package com.jackcattanach.PokerTool.Dtos;

import lombok.Data;

import java.util.List;

@Data
public class HandHistory {

    private Long handId;

    private Long gameId;

    private List<Hands> hands;

    private List<Bets> bets;

    private String notes;
}
