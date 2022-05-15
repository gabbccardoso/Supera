package desafios.supera.classes;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tam_array = ler.nextInt();
        int alvo = ler.nextInt();
        int[] array = new int[tam_array];
        for(int i=0; i<tam_array; i++){
            array[i] = ler.nextInt();
        }
        int a = 0;
        int count=0;
        for(int i=0; i<tam_array; i++){
            for(int j=a; j<tam_array; j++){
                if(Math.abs(array[i] - array[j]) == alvo){
                    count++;
                }
            }
            a++;
        }
        System.out.println(count);

    }
}
