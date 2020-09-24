package aula_23_09_2020;

import java.util.ArrayList;
import java.util.Scanner;


public class TesteContaCorrente {
    public static void main(String[] args) {

        ArrayList<ContaCorrente> contasCadastradas = new ArrayList<ContaCorrente>();

        int op;
        do{
            Scanner s = new Scanner(System.in);
    
            System.out.println("[1]Cadastra Conta\n[2]Depositar\n[3]Saque\n[4]Verificar Saldo\n[5]Somatorio\n[6]Sair");    
            op = s.nextInt();
    
            switch(op){
                case 1:
                    double x, y;
    
                    ContaCorrente c = new ContaCorrente();
                    int i=0;
                    c.setNconta(i++);
        
                    System.out.println("Digite seu nome: ");    
                    c.setCliente(s.nextLine());
                
                    do{
                        System.out.println("Digite o Limite Especial: ");
                        y = Double.parseDouble(s.nextLine());
                        if(y < 0){
                            System.out.println("Valor incorreto!");
                        }
                    }while(y < 0);
                
                    do{
                        System.out.println("Digite seu saldo: ");
                        x = Double.parseDouble(s.nextLine());
                        if(x < (y * -1)){
                        System.out.println("Valor incorreto!");
                        }
                    }while(x < y);
                    s.close();
                    break;
                case 2:
            }
        }while(op!=6);
        
    }
}
