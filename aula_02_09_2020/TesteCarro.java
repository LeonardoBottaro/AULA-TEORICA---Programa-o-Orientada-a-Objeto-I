package aula_02_09_2020;

public class TesteCarro {
    
    public static void main(String[] args) {
        Carro c1 = new Carro();
        
        c1.codigo = 1;

        c1.velocidadeKmPorHora = 100;
        System.out.println("O carro moveu " + c1.mover(10) + " metros em 10 segundos");
        System.out.println(c1);
        

        c1.velocidadeKmPorHora = 50;
        System.out.println("O carro moveu " + c1.mover(5) + " metros em 5 segundos");
        System.out.println(c1);

        c1.velocidadeKmPorHora = 80;
        System.out.println("O carro moveu " + c1.mover(4) + " metros em 4 segundos");
        System.out.println(c1);
      
        /*
        System.out.println(c1.toString());
        System.out.println(c1.getClass().getName());
        System.out.println(c1.getClass().getSimpleName());

        System.out.println(c1.hashCode());
        System.out.println(Integer.toHexString(c1.hashCode()));
        
        
*/
    }
}
