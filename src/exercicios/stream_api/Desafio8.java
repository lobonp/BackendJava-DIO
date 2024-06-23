package exercicios.stream_api;

import java.util.List;
import java.util.Arrays;

/**
 * @author Pedro Lôbo Nascimento
 *
 * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 */
public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream().reduce(0, Integer::sum);

        System.out.println(somaDigitos);

    }
}
