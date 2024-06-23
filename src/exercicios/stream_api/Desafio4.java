package exercicios.stream_api;

import java.util.List;
import java.util.Arrays;

/**
 * @author Pedro Lôbo Nascimento
 *
 * Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
 */
public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream().filter(num -> num % 2 == 0).toList();

        System.out.println(numerosPares);
    }
}
