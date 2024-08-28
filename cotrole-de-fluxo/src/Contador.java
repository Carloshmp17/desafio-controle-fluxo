import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = sc.nextInt();

        try{

            if(parametroUm < parametroDois){
                throw new ParametrosInvalidosException();
            }else{
                int res = contar(parametroUm, parametroDois);
                for (int i = 0; i <= res; i++) {
                System.out.println("Imprimindo interação "+(i+1));
            }

            System.out.println("Numero de interações "+ res);
            }
            


        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }

    static int contar(int  parametroUm, int parametroDois) throws ParametrosInvalidosException{

        int contagem = parametroUm - parametroDois;

        return contagem;
    }
}
