public class q4 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        
        try {
            int resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }
}
