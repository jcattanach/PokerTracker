package com.jackcattanach.PokerTool.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PlayerDto {

    private Boolean isUser;

    private BigDecimal stackSize;


}
