package exercicios.stream_api;

import java.util.List;
import java.util.Arrays;
/**
 * @author Pedro Lôbo Nascimento
 *
 * Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 */
public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean contemMaiorQueDez = numeros.stream().anyMatch(num -> num > 10);

        System.out.println(contemMaiorQueDez);
    }
}
