import java.util.Scanner;

public class Calculator {

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int substract(int number1, int number2) {
        return number1 - number2;
    }

    public int product(int number1, int number2) {
        return number1 * number2;
    }

    public int divide(int number1, int number2) throws ArithmeticException {
        return number1 / number2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 5) {
            System.out.println("Ingrese la operación que desea realizar:" +
                    "\n1. Sumar" +
                    "\n2. Restar" +
                    "\n3. Multiplicar" +
                    "\n4. Dividir" +
                    "\n5. Salir");

            option = Integer.parseInt(scanner.nextLine());
            if (option != 5) {
                System.out.println("Ingrese el primer número");
                int number1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Ingrese el segundo número");
                int number2 = Integer.parseInt(scanner.nextLine());
    
                switch (option) {
                    case 1:
                        System.out.println("El resultado de la suma es: " + calculator.sum(number1, number2));
                        break;
                    case 2:
                        System.out.println("El resultado de la resta es: " + calculator.substract(number1, number2));
                        break;
                    case 3:
                        System.out.println("El resultado de la multiplicación es: " + calculator.product(number1, number2));
                        break;
                    case 4:
                        try {
                            System.out.println("El resultado de la división es: " + calculator.divide(number1, number2));
                        } catch (Exception e) {
                            System.out.println("No es posible dividir por 0");
                        }
                        break;
                    default:
                        break;
                }
            } else{
                System.out.println("Hasta pronto!!");
            }

        }

        scanner.close();
    }
}
