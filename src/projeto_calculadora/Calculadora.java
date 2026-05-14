package projeto_calculadora;

public class Calculadora {

    public int calc(int n1, int n2, int operacao) {
        switch (operacao) {
            case 1: return n1 + n2;
            case 2: return n1 - n2;
            case 3: return n1 * n2;
            case 4:
                if (n2 == 0) {
                    System.out.println("Erro: nao pode dividir por 0");
                    return 0;
                }
                return n1 / n2;
        }
        return 0;
    }
}