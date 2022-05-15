package desafios.supera.teste;

import desafios.supera.classes.Desafio2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class testeDesafio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);
        double dinheiro = ler.nextDouble();
        int quantia=0;
        int cedulas = (int) dinheiro;

        //System.out.println(moedas);
        Desafio2 desafio = new Desafio2();
        Integer[] cedula = desafio.notas(cedulas, "nota");
        quantia = cedula[0]*100+cedula[1]*50+cedula[2]*20+cedula[3]*10+cedula[4]*5+cedula[5]*2;
        int moedas = (int)((dinheiro-quantia)*100);
        System.out.println("quantia:"+ quantia);
        Integer[] moeda = desafio.notas(moedas, "moeda");
        int[] nota = {100, 50, 20, 10, 5, 2};
        String[] moedass = {"1.00", "0.50", "0.25", "0.10", "0.05", "0.01"};
        System.out.println("Notas:");
        for (int n=0; n<nota.length; n++) {
            System.out.println(cedula[n] + " nota(s) de R$ " + nota[n]);
        }
        System.out.println("Moedas:");
        for (int m=0; m<nota.length; m++) {
            System.out.println(moeda[m] + " moeda(s) de R$ " + moedass[m]);
        }

    }
}
