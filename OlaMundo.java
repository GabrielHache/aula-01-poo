import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite seu peso");
        float peso= entrada.nextFloat();

        System.out.println("Digite sua altura");
        float altura= entrada.nextFloat();
        float imc= peso/(altura*altura);

        System.out.println("seu imc é" + imc);

        if (imc < 18.5){
            System.out.println("A Baixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("peso normal");
        } else if (imc >= 25 && imc <= 29.9){
            System.out.println("Sobre Peso");
        }
        else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade 1");
        }
        else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade 2");
        }else if (imc < 40){
            System.out.println("Obesidade Morbida");
        }

        

        



    }

}