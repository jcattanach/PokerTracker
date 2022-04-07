package com.jackcattanach.PokerTool.Dtos;

import lombok.Data;

import java.util.List;

@Data
public class Hands {

    private List<HoleCards> heroHoleCards;

    private String flopCardOne;
    private String flopCardTwo;
    private String flopCardThree;

    private String turnCard;
    private String riverCard;

    private List<HoleCards> villainOneHoleCards;
    private List<HoleCards> villainTwoHoleCards;
    private List<HoleCards> villainThreeHoleCards;
    private List<HoleCards> villainFourHoleCards;
    private List<HoleCards> villainFiveHoleCards;
    private List<HoleCards> villainSixHoleCards;
    private List<HoleCards> villainSevenHoleCards;
    private List<HoleCards> villainEightHoleCards;

}

