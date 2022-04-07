package com.jackcattanach.PokerTool.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BetDto {

    private Long betId;

    private Long handId;

    private BigDecimal betAmount;

    private Integer position;

    private boolean blindOrStraddle = false;

    private Boolean check;

    private Boolean fold;

}
