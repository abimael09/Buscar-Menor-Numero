
package Buscar_Menor_Numero;

import javax.swing.JOptionPane;

public class Buscar_Menor_Numero {
    
    public static void main(String[] args) {
        
        System.out.println("Qual opção tem o menor número?\n");
        
        String entrada1 = JOptionPane.showInputDialog("Digite um Número");
        int num1 = Integer.parseInt(entrada1);
        System.out.println("A = "+num1);
        
        String entrada2 = JOptionPane.showInputDialog("Digite mais um Número");
        int num2 = Integer.parseInt(entrada2);
        System.out.println("B = "+num2);
        
        String entrada3 = JOptionPane.showInputDialog("Digite outro Número");
        int num3 = Integer.parseInt(entrada3);
        System.out.println("C = "+num3+"\n");
        
        if(num1<num2 && num1<num3){
            System.out.println("Opçao A = "+num1 + " tem o menor número.\n");
        }else{
            if(num2<num1 && num2<num3){
                System.out.println("Opçao B = "+num2 + " tem o menor número.\n");
            }else{
                System.out.println("Opçao C = "+num3 + " tem o menor número.\n");
            }
        }
        
    }
            
            
}

