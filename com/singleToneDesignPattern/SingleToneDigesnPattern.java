package com.singleToneDesignPattern;

public class SingleToneDigesnPattern {

    private static SingleToneDigesnPattern instance;
    private   SingleToneDigesnPattern()
    {

    }

    public static SingleToneDigesnPattern getInstance()
    {
        if (instance == null) {
            instance = new SingleToneDigesnPattern();
        }
        return instance;
    }
}
