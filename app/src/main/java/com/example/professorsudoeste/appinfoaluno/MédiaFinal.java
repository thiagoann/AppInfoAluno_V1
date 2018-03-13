package com.example.professorsudoeste.appinfoaluno;

/**
 * Created by thiag on 13/03/2018.
 */

public class MédiaFinal {

    float grade1;
    float grade2;
    float grade3;
    float grade4;
    String status;
    float media;
    boolean recu;

    public void sumMedia() {
        media = (grade1 + grade2 + grade3 + grade4) / 4;
    }

    public void Status() {
        if (media > 5) {
            status = " Aprovado ";

        }
        if (media < 5)
            status = " Reprovado ";
    }

    public boolean recu(){


        if (grade1 == 0 ) {
            recu = true;
        if(grade2 == 0){
            recu = false;
            }
        }
        return recu;
    }

}
