package aula_02_09_2020;

public class Corrida {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.setCodigo(1);
        c2.setCodigo(2);

        double distanciaPistaMetros = 10000; 

        do{
            c1.setVelocidadeKmPorHora(Math.random() * 200);
            c1.mover(1);
    
            c2.setVelocidadeKmPorHora(Math.random() * 200);
            c2.mover(1);
    
            if(c1.getDistanciaPercorridaEmMetros() > c2.getDistanciaPercorridaEmMetros())
            {
                System.out.println("c1 em primeiro");
            }
            else{
                System.out.println("c2 em primeiro");
            }
            System.out.println(c1);
            System.out.println(c2);
        }while(c1.getDistanciaPercorridaEmMetros() <distanciaPistaMetros && c2.getDistanciaPercorridaEmMetros()<distanciaPistaMetros);

        if(c1.getDistanciaPercorridaEmMetros() > c2.getDistanciaPercorridaEmMetros()){
                System.out.println("C1 foi o grande Vencedor");
        }
        else{
                System.out.println("C2 foi o grande Vencedor");
        }

        







    }

}
