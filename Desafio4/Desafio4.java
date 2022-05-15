package desafios.supera.classes;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        int n = ler.nextInt();
        String[] frase = new String[n];
        String[] fraseCorrigida = new String[n];
        String lixo = ler.nextLine();
        int h = 0;

        for(int i = 0; i < n; i++){
            frase[i] = ler.nextLine();
            char[] fraseChar = frase[i].toCharArray();
            fraseCorrigida[h] = "";
            for(int j=(frase[i].length()/2)-1; j>=0; j--){
                fraseCorrigida[h] += fraseChar[j];
            }
            for(int k = frase[i].length()-1; k >= (frase[i].length()/2); k--){
                fraseCorrigida[h] += fraseChar[k];
            }
            System.out.println(fraseCorrigida[h]);
            h++;
        }

    }
}
