package lista1.atividade1;

/**
 * verificaNumeroPrimo
 */
public class verificaNumeroPrimo {

    public static int verificadorNP(Integer n) {
        if (n <= 1) {
            return 0; // Números menores ou iguais a 1 não são primos
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; // Números divisíveis por algum valor entre 2 e a raiz quadrada não são primos
            }
        }
        
        return 1; // Se o número não foi divisível por nenhum valor entre 2 e a raiz quadrada, é primo
    }

    public static void main(String[] args) {
        Integer numero = 17; // Número que você deseja verificar
        
        int resultado = verificadorNP(numero);
        
        if (resultado == 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
