public class TestaCondicional2 {

    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 35;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas <= 2;
        if (idade >= 35 && acompanhado) {
            System.out.println("você tá ficando velha");
        } else
            System.out.println("felizmente você é novinho");
    }
}
