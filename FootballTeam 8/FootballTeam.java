package com.company;

public class FootballTeam {
    public String name;
    public String country;
    public String [] listOfPlayers = new String[11];
    public int groupRating;

    public void changeRating(int rating){
        groupRating = rating;
    }

    public void replacePlayer (String currentPlayer, String newPlayer){
        for (int i = 0; i < listOfPlayers.length; i++){
            if (listOfPlayers[i].equals(currentPlayer)){
                listOfPlayers[i] = newPlayer;
            }
        }
    }
}
