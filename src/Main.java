public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("A soma é: " + somar(a, b));
        System.out.println("A subtração é: " + subtrair(a, b));
        System.out.println("A multiplicação é: " + multiplicar(a, b));
        System.out.println("A divisão é: " + dividir(a, b));
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Não pode divisão por zero");
            return 0;
        }
    }
}
