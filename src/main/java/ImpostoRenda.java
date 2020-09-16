public class ImpostoRenda {

    public static void main(String[] args) {
        double salario = 4664.01;
        if (salario < 1900.0) {
            System.out.println("seu salario é menor");
        } else if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("e pode deduzir na declaração o valor de R$ 142");
        } else if (salario >= 2800.1 && salario <= 3751.0) {
            System.out.println("o IR é de 15% e pode deduzir R$ 350");
        } else if (salario >= 3751.01 && salario <= 4664.00) {
            System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
        } else if (salario > 4664.00) {
            System.out.println("seu salario é maior");
        }
    }
}
