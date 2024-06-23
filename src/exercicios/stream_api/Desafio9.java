package exercicios.stream_api;

import java.util.Arrays;
import java.util.List;

/**
 * @author Pedro Lôbo Nascimento
 *
 * Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console
 */
public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosDistintos = numeros.stream().distinct().toList();

        System.out.println(numerosDistintos.size() == numeros.size());
    }
}
