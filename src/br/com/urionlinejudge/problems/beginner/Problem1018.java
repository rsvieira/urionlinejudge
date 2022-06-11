package br.com.urionlinejudge.problems.beginner;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author devrsvieira
 * @email devrsvieira@gmail.com
 * @date 10/06/22
 */
public class Problem1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorInicial = scanner.nextInt();
        int valor = valorInicial;
        Map<Integer, Integer> notas = new TreeMap<>(Collections.reverseOrder());
            while(valor > 0){
                int quantidadeNotas;
                if(valor > 100){
                    quantidadeNotas = valor/100;
                    notas.put(100, quantidadeNotas);
                    valor = valor - (100*quantidadeNotas);
                } else if (valor > 50) {
                    quantidadeNotas = valor/50;
                    notas.put(50, quantidadeNotas);
                    valor = valor - (50*quantidadeNotas);
                } else if (valor > 20) {
                    quantidadeNotas = valor/20;
                    notas.put(20, quantidadeNotas);
                    valor = valor - (20*quantidadeNotas);
                } else if (valor > 10) {
                    quantidadeNotas = valor/10;
                    notas.put(10, quantidadeNotas);
                    valor = valor - (10*quantidadeNotas);
                } else if (valor > 5) {
                    quantidadeNotas = valor/5;
                    notas.put(5, quantidadeNotas);
                    valor = valor - (5*quantidadeNotas);
                } else if (valor > 1) {
                    quantidadeNotas = valor/2;
                    notas.put(2, quantidadeNotas);
                    valor = valor - (2*quantidadeNotas);
                } else {
                    quantidadeNotas = valor;
                    notas.put(1, quantidadeNotas);
                    valor = 0;
                }
            }

            if(!notas.containsKey(100)){
                notas.put(100,0);
            }
            if(!notas.containsKey(50)){
                notas.put(50,0);
            }
            if(!notas.containsKey(20)){
                notas.put(20,0);
            }
            if(!notas.containsKey(10)){
                notas.put(10,0);
            }
            if(!notas.containsKey(5)){
                notas.put(5,0);
            }
            if(!notas.containsKey(2)){
                notas.put(2,0);
            }
            if(!notas.containsKey(1)){
                notas.put(1,0);
            }
            System.out.println(valorInicial);
            notas.forEach((key, value)-> System.out.println(value + " nota(s) de R$ " + key + ",00" ));
    }
}
