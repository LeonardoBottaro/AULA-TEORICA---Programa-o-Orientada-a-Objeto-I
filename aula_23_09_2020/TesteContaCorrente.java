package aula_23_09_2020;

import java.util.ArrayList;
import java.util.Scanner;


public class TesteContaCorrente {

    public static ArrayList<ContaCorrente> contasCadastradas = new ArrayList<ContaCorrente>();
    public static void main(String[] args) {

        int op;

        Scanner s = new Scanner(System.in);
        int i=0;
        do{
    
            System.out.println("\n[1]Cadastrar Conta\n[2]Depositar\n[3]Saque\n[4]Verificar Saldo\n[5]Somatorio\n[6]Sair");    
            op = Integer.parseInt(s.nextLine());
            int vc;
    
            switch(op){
                case 1:
                    double x, y;
                    
    
                    ContaCorrente c = new ContaCorrente();;
                    c.setNconta(i++);
        
                    System.out.println("Digite seu nome: ");    
                    c.setCliente(s.nextLine());
                
                    do{
                        System.out.println("Digite o Limite Especial: ");
                        y = Double.parseDouble(s.nextLine());
                        if(y < 0){
                            System.out.println("Valor Invalido!");
                        }
                        c.setLimiteEspecial(y);
                    }while(y < 0);
                
                    do{
                        System.out.println("Digite seu saldo: ");
                        x = Double.parseDouble(s.nextLine());
                        if(x < y){
                        System.out.println("Valor Invalido!");
                        }
                        c.setSaldo(x);
                    }while(x < y);
                    contasCadastradas.add(c);
                    break;
                case 2:
                    int f=0;
                    System.out.println("Digite o numero da Conta Corrente: ");
                    vc = Integer.parseInt(s.nextLine());
                    do{
                        double d;
                        c=contasCadastradas.get(f);
                        if(vc == c.getNconta()){
                            System.out.println("Valor do Deposito R$ = ");
                            d = Double.parseDouble(s.nextLine());
                            if(d<0){
                                System.out.println("Valor do deposito invalido!\n");
                                break; 
                            }else{
                                c.depositar(d);
                                break; 
                            }
                        }
                        f++;
                    }while(f < contasCadastradas.size());
                    if(vc != c.getNconta()){
                        System.out.println("Conta não existente!\n");
                        break;
                    }
                    break;
                case 3:
                    int g=0;
                    System.out.println("Digite o numero da Conta Corrente: ");
                    vc = Integer.parseInt(s.nextLine());
                    do{
                        double d;
                        c=contasCadastradas.get(g);
                        if(vc == c.getNconta()){
                            System.out.println("Valor do Saque R$ = ");
                            d = Double.parseDouble(s.nextLine());
                            if(d<0){
                                System.out.println("Valor do saque invalido!\n");
                                break; 
                            }
                            if(c.getSaldo() == - c.getLimiteEspecial()){
                                System.out.println("Limite de saque atingido!\n");
                                break; 
                            }
                            else{
                                c.sacar(d);
                                break; 
                            }
                        }
                        g++;
                    }while(g < contasCadastradas.size());
                    if(vc != c.getNconta()){
                        System.out.println("Conta não existente!\n");
                        break;
                    }
                break;
                case 4:
                    int q=0;
                    System.out.println("Digite o numero da Conta Corrente: ");
                    vc = Integer.parseInt(s.nextLine());
                    do{
                        c=contasCadastradas.get(q);
                        if(vc == c.getNconta()){
                            System.out.println("Cliente - " + c.getCliente());
                            System.out.println("N° da Conta - " + c.getNconta());
                            System.out.println("Saldo = R$ " + c.getSaldo() + "\n");
                            break; 
                        }
                        q++;
                    }while(q < contasCadastradas.size());
                    if(q == contasCadastradas.size()){
                        System.out.println("Conta não existente!\n");
                    }
                }
                    
        }while(op!=6);

        s.close();
        
    }
}
