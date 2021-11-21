package com.TWTrainingDay3;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating;
    Movie(String title, String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title, String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    public static Movie[] getPg(Movie[] array){
        Movie[] newArray=new Movie[array.length];
        int newArrayIndex=0;
        for(Movie i:array){
            if(i.rating.equals("PG")){
                newArray[newArrayIndex]=i;
                newArrayIndex++;
            }
        }
        return newArray;
    }

}
