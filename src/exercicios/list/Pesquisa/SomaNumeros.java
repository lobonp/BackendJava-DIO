package exercicios.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pedro Lôbo Nascimento
 */
public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero;

        if (!numeros.isEmpty()) {
            maiorNumero = numeros.get(0);
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("Lista de numeros vazia");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero;

        if (!numeros.isEmpty()) {
            menorNumero = numeros.get(0);
            for(Integer numero : numeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("Lista de numeros vazia");
        }
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(-10);
        somaNumeros.adicionarNumero(500);
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.exibirNumeros());
    }

}
