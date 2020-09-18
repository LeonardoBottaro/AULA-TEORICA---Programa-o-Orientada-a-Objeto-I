package aula_09_09_2020;

public class Carro {
    private int codigo;
    private double velocidadeKmPorHora;     
    private double distanciaPercorridaEmMetros;

    public double mover(int segundos){
        double dist =  (((velocidadeKmPorHora / 60) / 60 ) * segundos) * 1000; // pra sair em metros
        distanciaPercorridaEmMetros += dist;
        return dist;
    }




    @Override
    public String toString() {
        return "Carro [codigo=" + codigo + ", distanciaPercorrida=" + distanciaPercorridaEmMetros + ", velocidade=" + velocidadeKmPorHora
                + "]";
    }

    public double getDistanciaPercorridaEmMetros() {
        return distanciaPercorridaEmMetros;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getVelocidadeKmPorHora() {
        return velocidadeKmPorHora;
    }

    public void setVelocidadeKmPorHora(double velocidadeKmPorHora) {
        this.velocidadeKmPorHora = velocidadeKmPorHora;
    }



    
}
