package tiposprimitivos;

/*
 * Notas de estudo sobre os tipos primitivos do Java.
 * Tipos primitivos são providos pela linguagem nativamente.
 */

 public class TiposPrimitivosNotasEstudos {
    public static void main(String[] args) {
        // Caracteres ou Characters
        char primeiraLetraDoNome = 'J';
        char primeiraLetraDoNomeASCII = 74;

        System.out.println(primeiraLetraDoNome);
        System.out.println(primeiraLetraDoNomeASCII);

        // Inteiros ou Integers
        byte nota = 10; // -128 até 127
        short itensComprados = 2; // -32768 até 32767
        int quantidadeEstoque = 23366; // -2_147_483_648 até 2_147_483_647
        long numeroMuitoGrande = 47647862378462378L; // 19 dígitos

        // Tipos Decimais
        float peso = 1.5f; // 6 - 7 casas decimais
        double preco = 24.99; // ~ 15 casas decimais

        //Booleanos ou Booleans
        boolean verdadeiro = true;
        boolean falso = false;

    }
}

