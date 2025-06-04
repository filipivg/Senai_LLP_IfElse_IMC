package Senai_LLP_IfElse_IMC;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double altura;
        double peso;
        double IMC;

        System.out.print("Digite sua altura: ");
        altura = leia.nextDouble();
        System.out.print("Digite seu peso: ");
        peso = leia.nextDouble();

        altura = altura * altura;

        IMC = peso / altura;

        if(IMC < 18.25){
            System.out.println("Abaixo do peso!");
        }else if(IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Peso normal");
        }else if(IMC >= 25 && IMC <= 29.9){
            System.out.println("Sobpeso!!");
        }else{
            System.out.println("Obesidade!!!");
        }
    }
}
