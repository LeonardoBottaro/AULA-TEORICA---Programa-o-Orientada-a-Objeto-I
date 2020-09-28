package aula_23_09_2020;

public class ContaCorrente {
    private int nconta;
    private double saldo;
    private double limiteEspecial;
    private String cliente;


    public double depositar (double deposito){
        this.saldo += deposito;
        return saldo;
    }

    public double sacar (double saque){
        this.saldo -= saque;
        return saldo;
    }



    public void setNconta(int nconta) {
        this.nconta = nconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ContaCorrente [cliente=" + cliente + ", limiteEspecial=" + limiteEspecial + ", nconta=" + nconta
                + ", saldo=" + saldo + "]";
    }


    public int getNconta() {
        return nconta;
    }

    
}
