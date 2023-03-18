import java.util.Scanner;

public class examples {
    public static void main(String[] args) {
        // Suma los primeros 100 numeros enteros
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("la suma de los primeros 100  numeros enteros es:" + suma);

        // Realiza la tabla del 5
        int tablaCinco = 0;
        for (int b = 1; b <= 10; b++) {
            tablaCinco = 5 * b;
            System.out.println("la tabla del cinco es: 5*" + b + "=" + tablaCinco);
        }

        // imprime el numero entero ingresado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = sc.nextInt();
        System.out.println("El numero ingresado es" + num);

        // calcula el promedio de 3 numeros ingresados por el usuario
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingresa 3 numeros:");
        double num1 = sca.nextDouble();
        double num2 = sca.nextDouble();
        double num3 = sca.nextDouble();
        double promedio = (num1 + num2 + num3) / 3.0;
        System.out.println("El promedio de los numeros es:" + promedio);

        //  ingresa un numero y te digo si es par o impar
        Scanner cr = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numeroIngresado = cr.nextInt();
        if(numeroIngresado % 2 == 0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }

        //Determinar si eres mayor de edad o no
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa tu edad:");
        int edad = scan.nextInt();
        if(edad > 18){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
        
    }
}