public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(500.00);

        try {
            double valorSaque = 600.00; // Valor maior que o saldo
            System.out.println("Tentando sacar R$ " + valorSaque);
            minhaConta.sacar(valorSaque);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
