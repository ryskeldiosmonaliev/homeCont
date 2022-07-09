package com.company;


public class Class {
    private long number;
    private String word;
    private int [] array;

    public long getNumber() {
        return number;
    }


    public String getWord() {
        return word;

    }
    public Class(long number, String wort, int [] array){
        this.number=number;
        this.word=wort;
        for (int a: array) {
            System.out.print(a+ " ");
        }

        }

    }


