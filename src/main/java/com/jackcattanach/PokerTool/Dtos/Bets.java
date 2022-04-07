package com.jackcattanach.PokerTool.Dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Bets {

    private BigDecimal betAmount;

    private Integer position;

    private boolean blindOrStraddle = false;

    private Boolean check;

    private Boolean fold;

}
