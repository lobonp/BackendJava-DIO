package exercicios.stream_api;

import java.util.List;
import java.util.Arrays;
/**
 * @author Pedro Lôbo Nascimento
 *
 * Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
 */
public class Desafio12 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produtoNumeros = numeros.stream().map(num -> num * 2).reduce(0, Integer::sum);

        System.out.println(produtoNumeros);
    }
}
