package ru.netology.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Player {

    private int id;

    private String name;
    private int strength;

    public static void main(String[] args) {
        HashMap<Integer, String> player = new HashMap<>();

    }
}
