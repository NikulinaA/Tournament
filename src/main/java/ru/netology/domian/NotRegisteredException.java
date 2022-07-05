package ru.netology.domian;

public class NotRegisteredException extends RuntimeException {

    public NotRegisteredException(String text) {
        super(text);
    }
}
