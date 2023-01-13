package com.dunky.generics;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        System.out.println("Num of players " + adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago clubs");
        baseballPlayerTeam.addPlayer(pat);
        System.out.println("Num of players " + baseballPlayerTeam.numPlayers());

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Liverpool");
        soccerPlayerTeam.addPlayer(beckham);
        System.out.println("Num of players " + soccerPlayerTeam.numPlayers());

    }
}
