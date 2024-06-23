package exercicios.stream_api;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.List;

/**
 * @author Pedro Lôbo Nascimento <br>
 *
 * Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra
 * contendo os números ímpares da lista original, e exiba os resultados no console.
 */
public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream().filter(num -> num % 2 == 0).toList();
        List<Integer> numerosImpares = numeros.stream().filter(num -> num % 2 == 1).toList();

        System.out.println(numerosPares);
        System.out.println(numerosImpares);
    }
}
