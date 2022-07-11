package ru.netology.domian;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players = new ArrayList<>();


    public void register(Player player) {

        players.add(player);

    }

    public int round(String playerName1, String playerName2) {

        int j = 0;
        int i = search(playerName1);
        if (i != -1) {
            int t = search(playerName2);
            if (t != -1) {
                Player[] player1 = new Player[1];
                Player[] player2 = new Player[1];

                for (Player player : players
                ) {
                    if (player.getId() == i + 1) {
                        player1[0] = player;

                    }
                    if (player.getId() == t + 1) {
                        player2[0] = player;
                    }
                }
                int result1 = player1[0].getStrength();
                int result2 = player2[0].getStrength();
                if (result1 > result2) {
                    j = 1;
                } else if (result2 > result1) {
                    j = 2;
                } else {
                    j = 0;
                }


            } else {
                throw new NotRegisteredException("Игрок " + playerName2 + " не зарегистрирован.");
            }
        } else {
            throw new NotRegisteredException("Игрок " + playerName1 + " не зарегистрирован.");
        }

        return j;

    }

    public int search(String playerName) {

        for (int i = 0; i < players.size(); i++) {

            Player player = players.get(i);
            if (player.getName().equals(playerName)) {
                return i;
            }

        }
        return -1;
    }
}
