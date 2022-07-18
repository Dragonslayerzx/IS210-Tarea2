package tarea2;
import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Ingrese la operacion deseada con espacios ");
    String op = scan.nextLine();
    
    String array[] = op.split(" ");
    double valor1 = Double.parseDouble(array[0]);
    double valor2 = Double.parseDouble(array[2]);
    double resultado = 0;
    
    switch(array[1]){
        case "+" -> resultado = valor1 + valor2;
        case "-" -> resultado = valor1 - valor2;
        case "/" -> resultado = valor1 / valor2;
        case "*" -> resultado = valor1 * valor2;           
    }
    System.out.println("El resultado es " + resultado);
    }
  }    

