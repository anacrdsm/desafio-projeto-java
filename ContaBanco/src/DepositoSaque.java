public class DepositoSaque {
    public double depositarValor (double novoValor, double saldo){
        double valor = novoValor + saldo;
        return valor;
    }

    public double sacarValor(double valorSaque, double saldo){
        double valor = saldo - valorSaque;
        return valor;
    }


    
}
