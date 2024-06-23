package exercicios.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * @author Pedro Lôbo Nascimento
 *
 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */
public class Desafio7 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int segundoMaior = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .mapToInt(Integer::intValue)
                .limit(1)
                .sum();

        System.out.println(segundoMaior);
    }
}
