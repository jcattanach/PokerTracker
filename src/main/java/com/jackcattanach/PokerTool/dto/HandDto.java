package com.jackcattanach.PokerTool.dto;

import lombok.Data;

import java.util.List;

@Data
public class HandDto {

    private Long userId;

    private List<HoleCardDto> heroHoleCards;

    private String flopCardOne;
    private String flopCardTwo;
    private String flopCardThree;

    private String turnCard;
    private String riverCard;

    private List<HoleCardDto> villainOneHoleCards;
    private List<HoleCardDto> villainTwoHoleCards;
    private List<HoleCardDto> villainThreeHoleCards;
    private List<HoleCardDto> villainFourHoleCards;
    private List<HoleCardDto> villainFiveHoleCards;
    private List<HoleCardDto> villainSixHoleCards;
    private List<HoleCardDto> villainSevenHoleCards;
    private List<HoleCardDto> villainEightHoleCards;

}

