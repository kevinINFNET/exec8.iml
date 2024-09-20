import java.util.Arrays;

public class VetorOperacoes {

    public int[] somarVetor(int[] vetor, int numero) {
        int[] resultado = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            resultado[i] = vetor[i] + numero;
        }
        return resultado;
    }

    public int[] ordenarVetor(int[] vetor) {
        int[] ordenado = Arrays.copyOf(vetor, vetor.length);
        Arrays.sort(ordenado);
        return ordenado;
    }

    public int[] somarVetores(int[] vetor1, int[] vetor2) {
        if (vetor1.length != vetor2.length) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho.");
        }

        int[] resultado = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            resultado[i] = vetor1[i] + vetor2[i];
        }
        return resultado;
    }
}
