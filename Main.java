public class Main {

    public static void main(String[] args) {

        int numero = "10";

        if (numero > 5)
            System.out.println("Número maior que 5")
        else {
            System.out.println("Número menor ou igual a 5");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i)
        }

        String nome = null;
        System.out.println(nome.length());

    }
}