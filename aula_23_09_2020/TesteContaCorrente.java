package aula_23_09_2020;

import java.util.ArrayList;
import java.util.Scanner;


public class TesteContaCorrente {

    public static ArrayList<ContaCorrente> contasCadastradas = new ArrayList<ContaCorrente>();
    public static void main(String[] args) {

        int op;

        Scanner s = new Scanner(System.in);
        do{
    
            System.out.println("[1]Cadastrar Conta\n[2]Depositar\n[3]Saque\n[4]Verificar Saldo\n[5]Somatorio\n[6]Sair");    
            op = Integer.parseInt(s.nextLine());
    
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
                        if(x < y){
                        System.out.println("Valor incorreto!");
                        }
                    }while(x < y);
                    contasCadastradas.add(c);
                    break;
                case 2:
                    int vc;
                    System.out.println("DIgite o numero da Conta Corrente: ");
                    vc = Integer.parseInt(s.nextLine());
                    for(ContaCorrente cc: contasCadastradas){
                        if(vc != cc.getNconta()){
                            System.out.println("Conta não existente!");
                        }
                    }
            }
        }while(op!=6);

        s.close();
        
    }
}
