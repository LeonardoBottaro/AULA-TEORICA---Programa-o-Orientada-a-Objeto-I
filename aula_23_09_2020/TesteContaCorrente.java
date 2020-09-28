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
            int vc;
    
            switch(op){
                case 1:
                    double x, y;
                    int i=0;
    
                    ContaCorrente c = new ContaCorrente();;
                    c.setNconta(i+=1);
        
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
                    do{
                        double d;
                        int g=0;
                        c=contasCadastradas.get(g);
                        System.out.println("Digite o numero da Conta Corrente: ");
                        vc = Integer.parseInt(s.nextLine());
                        for(int f=0;f<contasCadastradas.size();f++){
                            c=contasCadastradas.get(f);
                            if(vc == c.getNconta()){
                                do{
                                    System.out.println("Valor do Deposito R$ = ");
                                    d = Double.parseDouble(s.nextLine());
                                    if(d<0){
                                        System.out.println("Valor Invalido!");
                                    }
                                }while(d<0);
                                c.depositar(d);
                            }else{
                                System.out.println("Conta não existente!");
                            }
                        }
                    }while(vc!= c.getNconta());
                    break;
                case 3:
                    do{
                        double d;
                        int g=0;
                        c=contasCadastradas.get(g);
                        System.out.println("Digite o numero da Conta Corrente: ");
                        vc = Integer.parseInt(s.nextLine());
                        for(int f=0;f<contasCadastradas.size();f++){
                            c=contasCadastradas.get(f);
                            if(vc == c.getNconta()){
                                do{
                                    System.out.println("Valor do Saque R$ = ");
                                    d = Double.parseDouble(s.nextLine());
                                    if(d<0){
                                    System.out.println("Valor Invalido!");
                                    }
                                }while(d<0);
                                c.sacar(d);
                            }else{
                                System.out.println("Conta não existente!");
                            }
                        }
                    }while(vc!= c.getNconta());
                break;
                case 4:
                    do{
                        System.out.println("Digite o numero da Conta Corrente: ");
                        vc = Integer.parseInt(s.nextLine());
                        int f=0;
                        c=contasCadastradas.get(f);
                        if(vc == c.getNconta()){
                            System.out.println("Cliente - " + c.getCliente());
                            System.out.println("N° da Conta - " + c.getNconta());
                            System.out.println("Saldo = R$ " + c.getSaldo() + "\n");
                                
                        }else{
                            System.out.println("Conta não existente!");
                        }
                        f++;
                    }while(vc != c.getNconta());
            }
        }while(op!=6);

        s.close();
        
    }
}
