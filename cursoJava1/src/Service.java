import java.util.Scanner;

public class Service {
    Scanner consola = new Scanner(System.in);

//    Sistema de cajero automatico
    Double saldo = 2000.0;
    String menu = """     
                Menu:
                1. Consultar Saldo
                2. Retirar
                3. Depositar
                4. Salir
                Escoge una opcion:\s""";

    public void consultarSaldo() {
        System.out.println("Tu saldo actual es de: $" + saldo);
    }

    public void retirarSaldo() {
        System.out.print("Ingresa el monto a retirar: ");
        var retirarSaldo = consola.nextDouble();

        if (retirarSaldo <= saldo) {
            saldo -= retirarSaldo;
            System.out.println("Tu nuevo saldo es: $" + saldo);
        }
        else {System.out.println("No tienes saldo suficiente");}
    }

    public void depositarSaldo() {
        System.out.print("Ingrese el monto a depositar: ");
        var depositarSaldo = consola.nextDouble();

        saldo += depositarSaldo;
        System.out.println("Tu nuevo saldo es de: $" + saldo);
    }

//    Sistema de Calculadora
     String menuCaladora = """     
                Menu:
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir
                Escoge una opcion:\s""";
    Double resultado = 0.0;

    public void getSuma(){
        System.out.print("Dame el valor 1: ");
        var valor1 = consola.nextDouble();
        System.out.print("Dame el valor 2: ");
        var valor2 = consola.nextDouble();

        resultado = valor1 + valor2;
        System.out.println("Resultado sumar: " + resultado);
    }

    public void getResta(){
        System.out.print("Dame el valor 1: ");
        var valor1 = consola.nextDouble();
        System.out.print("Dame el valor 2: ");
        var valor2 = consola.nextDouble();

        resultado = valor1 - valor2;
        System.out.println("Resultado restar: " + resultado);
    }

    public void getMultiplicar(){
        System.out.print("Dame el valor 1: ");
        var valor1 = consola.nextDouble();
        System.out.print("Dame el valor 2: ");
        var valor2 = consola.nextDouble();

        resultado = valor1 * valor2;
        System.out.println("Resultado multiplicar: " + resultado);
    }

    public void getDividir(){
        System.out.print("Dame el valor 1: ");
        var valor1 = consola.nextDouble();
        System.out.print("Dame el valor 2: ");
        var valor2 = consola.nextDouble();

        resultado = valor1 / valor2;
        System.out.println("Resultado dividir: " + resultado);
    }
}
