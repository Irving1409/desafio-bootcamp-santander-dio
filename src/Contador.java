import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametro2 = terminal.nextInt();

        try{
            //chamando o método contendo a lógica de contagem
            contar(parametro1, parametro2);
        }
        catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        // Validar se o parâmetro1 é MAIOR que o parâmetro2 e lançar a exeção
        if(parametro1 >= parametro2){
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametro2 - parametro1;
        //realizar o for para imprimir os números com base na variavel contagem
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
