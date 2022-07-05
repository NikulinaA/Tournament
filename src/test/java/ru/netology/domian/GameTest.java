package ru.netology.domian;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameTest {

    Player playerName1 = new Player(1, "Витя Иванов", 5);
    Player playerName2 = new Player(2, "Оля Тукина", 7);
    Player playerName3 = new Player(3, "Ира Иванова", 9);
    Player playerName4 = new Player(4, "Ульяна Варова", 56);
    Player playerName5 = new Player(5, "Лида Мясова", 58);
    Player playerName6 = new Player(6, "Николай Коляков", 12);
    Player playerName7 = new Player(7, "Александр Пушкин", 11);
    Player playerName8 = new Player(8, "Юрий Гагарин", 11);
    Player playerName9 = new Player(9, "Ляпис Трубов", 10);
    Player playerName10 = new Player(10, "Шура Сидоров", 6);
    Player playerName11 = new Player(11, "Михаил Мишин", 98);
    Player playerName12 = new Player(12, "Тимур Попов", 568);
    Player playerName13 = new Player(13, "Алексей Щукин", 23);
    Player playerName14 = new Player(14, "Юрий Гагарин", 11);
    Game games = new Game();

    @Test
    public void winnerOne() {


        games.register(playerName1);
        games.register(playerName2);
        games.register(playerName3);
        games.register(playerName4);
        games.register(playerName5);
        games.register(playerName6);
        games.register(playerName7);
        games.register(playerName8);
        games.register(playerName9);
        games.register(playerName10);
        games.register(playerName11);
        games.register(playerName12);
        games.register(playerName13);
        games.register(playerName14);

        int actual = games.round("Михаил Мишин", "Ира Иванова");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void winnerTwo() {


        games.register(playerName1);
        games.register(playerName2);
        games.register(playerName3);
        games.register(playerName4);
        games.register(playerName5);
        games.register(playerName6);
        games.register(playerName7);
        games.register(playerName8);
        games.register(playerName9);
        games.register(playerName10);
        games.register(playerName11);
        games.register(playerName12);
        games.register(playerName13);
        games.register(playerName14);

        int actual = games.round("Шура Сидоров", "Юрий Гагарин");
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void equalValues() {


        games.register(playerName1);
        games.register(playerName2);
        games.register(playerName3);
        games.register(playerName4);
        games.register(playerName5);
        games.register(playerName6);
        games.register(playerName7);
        games.register(playerName8);
        games.register(playerName9);
        games.register(playerName10);
        games.register(playerName11);
        games.register(playerName12);
        games.register(playerName13);
        games.register(playerName14);

        int actual = games.round("Александр Пушкин", "Юрий Гагарин");
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void noRegisteredOne() {


        games.register(playerName1);
        games.register(playerName2);
        games.register(playerName3);
        games.register(playerName4);
        games.register(playerName5);
        games.register(playerName6);
        games.register(playerName7);
        games.register(playerName8);
        games.register(playerName9);
        games.register(playerName10);
        games.register(playerName11);
        games.register(playerName12);
        games.register(playerName13);
        games.register(playerName14);


        assertThrows(NotRegisteredException.class, () -> {
            games.round("Кукуруза Смехова", "Ира Иванова");
        });

    }

    @Test
    public void noRegisteredTwo() {


        games.register(playerName1);
        games.register(playerName2);
        games.register(playerName3);
        games.register(playerName4);
        games.register(playerName5);
        games.register(playerName6);
        games.register(playerName7);
        games.register(playerName8);
        games.register(playerName9);
        games.register(playerName10);
        games.register(playerName11);
        games.register(playerName12);
        games.register(playerName13);
        games.register(playerName14);


        assertThrows(NotRegisteredException.class, () -> {
            games.round("Ира Иванова", "Кукуруза Смехова");
        });

    }
}