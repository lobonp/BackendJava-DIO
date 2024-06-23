package exercicios.stream_api;

import java.util.Arrays;
import java.util.List;
/**
 * @author Pedro Lôbo Nascimento
 *
 * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
 */
public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> multiplosTresOuCinco = numeros.stream().filter(num -> num % 3 == 0 || num % 5 == 0).toList();

        System.out.println(multiplosTresOuCinco);
    }
}
