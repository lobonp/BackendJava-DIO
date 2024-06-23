package exercicios.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Pedro Lôbo Nascimento <br>
 * Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */
public class Desafio18 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Integer, List<Integer>> numerosAgrupados = numeros.stream().collect(Collectors.groupingBy(num -> num));
        System.out.println(numerosAgrupados);

        List<Integer> numerosRepetidos = numerosAgrupados.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println(numerosRepetidos);
    }
}
