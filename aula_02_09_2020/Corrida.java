package aula_02_09_2020;

public class Corrida {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        double distanciaPistaMetros = 10000; 

        do{
            c1.velocidadeKmPorHora = Math.random() * 200;
            c1.mover(1);
    
            c2.velocidadeKmPorHora = Math.random() * 200;
            c2.mover(1);
    
            if(c1.distanciaPercorridaEmMetros > c2.distanciaPercorridaEmMetros)
            {
                System.out.println("c1 em primeiro");
            }
            else{
                System.out.println("c2 em primeiro");
            }
            System.out.println(c1);
            System.out.println(c2);
        }while(c1.distanciaPercorridaEmMetros<distanciaPistaMetros && c2.distanciaPercorridaEmMetros<distanciaPistaMetros);

        if(c1.distanciaPercorridaEmMetros > c2.distanciaPercorridaEmMetros){
                System.out.println("C1 foi o grande Vencedor");
        }
        else{
                System.out.println("C2 foi o grande Vencedor");
        }

        







    }

}
