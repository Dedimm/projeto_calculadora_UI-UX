/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_calculadora;

/**
 *
 * @author marci
 */
public class Calculadora {
    public int r=0;

    
    public int calc(int n1, int n2, int operacao){
        if(operacao == 1){
            r = n1 + n2;
        }
        else if(operacao == 2){
            r = n1 - n2;
        }
        else if(operacao == 3){
            r = n1 * n2;
        }
        else if(operacao == 4){
            if(n2 != 0){
                r = n1 / n2;
            }else{
                System.out.println("Erro, nao pode dividir por 0");
                r = 0;
            }
        }
   
        return r;
    }
}
