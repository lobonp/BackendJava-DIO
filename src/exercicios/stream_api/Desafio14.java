package exercicios.stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

/**
 * @author Pedro Lôbo Nascimento
 *
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimo = numeros.stream()
                .filter(Desafio14::isPrimo)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(numerosPrimo.get(0));
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) return false;

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

}
