package exercicios.stream_api;

import java.util.List;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * @author Pedro Lôbo Nascimento
 *
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */
public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double mediaMaiorQueCinco = numeros.stream()
                .filter(num -> num > 5)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElseThrow(() -> new NoSuchElementException("Não foi possível encontrar a média."));

        System.out.println(mediaMaiorQueCinco);
    }

}
