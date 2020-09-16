public class TestaEscopoVariaveis {

    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 35;
        int quantidadePessoas = 3;
        boolean acompanhado;

        if(quantidadePessoas >=2){
           acompanhado = true;
        } else{
           acompanhado = false;
        }

        if (idade >= 35 && acompanhado) {
            System.out.println("você tá ficando velha");
        } else
            System.out.println("felizmente você é novinho");
    }
}
