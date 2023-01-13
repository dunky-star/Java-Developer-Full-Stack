package com.dunky.generics;

/**Create a generic class to implement a league table for a sport.
 * The class should allow teams to be added to the list, and store
 * a list of teams that belong to the league.
 * Your class should have a method to print out the teams in order,
 * with the team at the top of the league printed first.
 * Only teams of the same type should be added to any particular
 * instance of the league class - the program should fail to compile
 * if an attempt is made to add an incompatible team
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Liverpool");

        adelaideCrows.addPlayer(joe);
        System.out.println("Num of players " + adelaideCrows.numPlayers());

        baseballTeam.addPlayer(pat);
        System.out.println("Num of players " + baseballTeam.numPlayers());

        soccerPlayerTeam.addPlayer(beckham);
        System.out.println("Num of players " + soccerPlayerTeam.numPlayers());

        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);
        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);


        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        ArrayList<Team> teams = new ArrayList<>();
        Collections.sort(teams);

    }
}
