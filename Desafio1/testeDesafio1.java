package desafios.supera.teste;

import desafios.supera.classes.Desafio1;

import java.util.Scanner;

public class testeDesafio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = ler.nextInt();
        }

        Desafio1 desafio = new Desafio1(num, n);
        Integer[] num_ordenado;
        num_ordenado = desafio.ordena();

        for(int i=0; i<n; i++){
            System.out.println(num_ordenado[i]);;
        }

    }
}
