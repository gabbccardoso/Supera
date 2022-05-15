package desafios.supera.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    public int n;
    public int [] num = new int[n];
    public Desafio1(int[] num1, int n1){
        num = num1;
        n = n1;
    }

    public Integer[] ordena(){
        List<Integer> list = new ArrayList<>();
        List<Integer> numeros_pares = new ArrayList<Integer>();
        List<Integer> numeros_impares = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            Arrays.sort(num);
            if ((num[i] % 2) == 0){

                numeros_pares.add(num[i]);
            }
            else{
                numeros_impares.add(num[i]);
            }
        }
        for (Integer numero_par : numeros_pares) {
            list.add(numero_par);
            System.out.println(numero_par);
        }
        for(int i=numeros_impares.size()-1; i>=0; i--){
            //System.out.println(i);
            System.out.println(numeros_impares.get(i));
            list.add(numeros_impares.get(i));
        }
        Integer[] num_ordenado = new Integer[list.size()];
        num_ordenado = list.toArray(num_ordenado);

        return  num_ordenado;

    }
}