public class TestaCondicional {

    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 35;
        int quantidadePessoas = 2;
        if (idade >=35) {
            System.out.println("você tá ficando velha");
        } else {
            if (quantidadePessoas >= 3)
                System.out.println("você pode entrar");
                else
                    System.out.println("felizmente você é novinho");
        }
    }
}
