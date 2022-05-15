package desafios.supera.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio2 {

    public Integer[] notas(double quantia, String tipo) {
        List<Integer> list = new ArrayList<>();
        list.clear();
        int d100 = 0, d50 = 0, d20 = 0, d25=0, d10 = 0, d5 = 0, d2 = 0, d1=0;
        if (quantia >= 100) {
            d100 = (int) quantia / 100;
            quantia -= 100 * d100;
            list.add(d100);
        } else list.add(0);
        if (quantia >= 50) {
            d50 = (int) quantia / 50;
            quantia -= 50 * d50;
            list.add(d50);
        } else list.add(0);
        if (quantia >= 25 && tipo.equals("moeda")) {
            d25 = (int) quantia / 25;
            quantia -= 25 * d25;
            list.add(d25);
        } else if(tipo.equals("moeda")) list.add(0);
        if (quantia >= 20 && tipo.equals("nota")) {
            d20 = (int) quantia / 20;
            quantia -= 20 * d20;
            list.add(d20);
        } else if(tipo.equals("nota")) list.add(0);
        if (quantia >= 10) {
            d10 = (int) quantia / 10;
            quantia -= 10 * d10;
            list.add(d10);
        } else list.add(0);
        if (quantia >= 5) {
            d5 = (int) quantia / 5;
            quantia -= 5 * d5;
            list.add(d5);
        } else list.add(0);
        if (quantia >= 2 && tipo.equals("nota")) {
            d2 = (int) quantia / 2;
            quantia -= 2 * d2;
            list.add(d2);
        } else if(tipo.equals("nota")) list.add(0);
        if (quantia >= 1 && tipo.equals("moeda")) {
            d1 = (int) quantia;
            quantia -= d1;
            list.add(d1);
        } else if(tipo.equals("moeda")) list.add(0);
        Integer[] qntd_notas = new Integer[list.size()];
        qntd_notas = list.toArray(qntd_notas);
        return qntd_notas;
    }


}
