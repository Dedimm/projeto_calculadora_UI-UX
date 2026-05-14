package projeto_calculadora;

/**
 * Classe de testes da classe Calculadora.
 * Realiza testes manuais das operações matemáticas básicas.
 *
 * @author marci
 * @version 1.0
 */
public class TesteCalculadorea {

    /**
     * Método principal que executa os testes da calculadora.
     * Testa todas as operações disponíveis, incluindo casos de erro.
     *
     * @param args Argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // 1 = Adição, 2 = Subtração, 3 = Multiplicação, 4 = Divisão

        System.out.println(calc.calc(2, 3, 1)); // Esperado: 5
        System.out.println(calc.calc(6, 3, 2)); // Esperado: 3
        System.out.println(calc.calc(8, 3, 3)); // Esperado: 24
        System.out.println(calc.calc(8, 2, 4)); // Esperado: 4
        System.out.println(calc.calc(2, 0, 4)); // Esperado: erro de divisão por 0
        System.out.println(calc.calc(2, 5, 8)); // Esperado: operação inválida
    }

}