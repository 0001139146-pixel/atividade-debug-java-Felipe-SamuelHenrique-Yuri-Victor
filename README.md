# atividade-debug-java-Felipe-SamuelHenrique-Yuri-Victor

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

Esse código foi pensado como um exemplo básico de um programa em Java que trabalha com condições, laços de repetição e manipulação de texto.
Primeiro, ao iniciar a execução, o programa define um valor numérico e verifica se esse valor é maior que 5. Dependendo do resultado dessa verificação, ele imprime uma mensagem indicando se o número é maior que 5 ou menor ou igual.
Depois disso, o código entra em um laço de repetição (for), que percorre valores de 0 até 4. A cada repetição, ele exibe no console o valor atual da variável de controle do laço, mostrando uma sequência de números.
Por fim, o programa trabalha com uma variável de texto e tenta obter o tamanho desse texto, exibindo esse valor na tela.
Resumindo, a ideia do código é demonstrar o uso de decisões, repetição e manipulação básica de texto em Java.
