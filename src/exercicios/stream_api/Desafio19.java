package exercicios.stream_api;

import java.util.Arrays;
import java.util.List;

/**
 * @author Pedro Lôbo Nascimento <br>
 * Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o
 * resultado no console.
 */
public class Desafio19 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDivisiveisPorTresECinco = numeros.stream()
                .filter(num -> (num % 3 == 0 || num % 5 == 0))
                .reduce(0, Integer::sum);

        System.out.println(somaDivisiveisPorTresECinco);
    }
}
