package exercicios.stream_api;

import java.util.Arrays;
import java.util.List;

/**
 * @author Pedro Lôbo Nascimento <br>
 * Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 */
public class Desafio17 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream().filter(Desafio14::isPrimo).toList();

        System.out.println(numerosPrimos);
    }
}
