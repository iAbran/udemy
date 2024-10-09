

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var consola = new Scanner(System.in);
        var service = new Service();
//        System.out.print("proporcione en valor que este en el rango de 1 a 5: ";
//        var valor = Integer.parseInt(consola.nextLine());
//
//        if (valor >= 1 && valor <= 5)
//        {
//            System.out.println("el valor: " + valor + " que ingreso esta en el rango");
//        }
//        else
//        {
//            System.out.println("el valor: " + valor + " que ingro no esta en el rango");
//        }

//        var nombre1 = "abran";
//        var nombre2 = "abrahan";
//
//        System.out.print("escribe un nombre: ");
//        var nombre3 = consola.nextLine().toLowerCase();
//
//        if (nombre3.matches(nombre1)){
//            System.out.println("el primer nombre son iguales");
//        }
//        else if (nombre3.matches(nombre2)) {
//            System.out.println("el segundo nombre son iguales");
//        }
//        else {
//            System.out.println("los nombres no son iguales");
//        }


//        System.out.print("nombre de usuario: ");
//         var nombre_usuario = consola.nextLine();
//        System.out.print("password de la cuenta: ");
//        var password_usuario = consola.nextLine();
//
//        var usuario = "abran";
//        var password = "123";
//
//        if (nombre_usuario.matches(usuario)
//                && password_usuario.matches(password)){
//            System.out.println("""
//                    usuario: abran
//                    dinero: $00.00""");
//        }
//        else if (nombre_usuario.matches(usuario)
//                && !password_usuario.matches(password)) {
//            System.out.println("password incorrecta");
//        }
//        else {
//            System.out.println("El usuario con el nombre " + nombre_usuario + "no existe");
//        }

//        System.out.println("numero 1");
//        var numero1 = Integer.parseInt(consola.nextLine());
//        System.out.println("numero 2");
//        var numero2 = Integer.parseInt(consola.nextLine());
//
//         if (numero1 > numero2){
//             System.out.println("el nomero1: " + numero1 + " es mayor que " + numero2);
//         } else if (numero1 < numero2) {
//             System.out.println("el numero2: " + numero2 + " es mayor que " + numero1);
//         } else {
//             System.out.println("agregue un valor valido");
//         }

//        System.out.println(numero1 > numero2 ? numero1 : numero2);

//        System.out.print("proporcione el valor de un mes (numero entre 1/12): ");
//        var mes = Integer.parseInt(consola.nextLine());
//
//        switch (mes) {
//            case 1: case 2: case 12:
//                System.out.println("Invierno");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Primavera");
//                break;
//            case 6: case 7: case 8:
//                System.out.println("Verano");
//                break;
//            case 9: case 10: case 11:
//                System.out.println("Otoño");
//                break;
//            default:
//                System.out.println("Estacion Desconocida");
//                break;
//        }

//        if (mes == 1 || mes == 2 || mes == 12){
//            System.out.println("Invierno");
//        }
//        else if (mes >= 3 && mes <= 5) {
//            System.out.println("Primavera");
//        }
//        else if (mes >= 6 && mes <= 8){
//            System.out.println("Verano");
//        }
//        else if (mes >= 9 && mes <= 11) {
//            System.out.println("Otoño");
//        }
//        else {
//            System.out.println("Estacion Desconocida");
//        }

//        System.out.print("Proporcione el dia de la semana: ");
//        var dia = consola.nextInt();
//
//        switch (dia) {
//            case 1 -> System.out.println("Lunes");
//            case 2 -> System.out.println("Martes");
//            case 3 -> System.out.println("Miercoles");
//            case 4 -> System.out.println("Jueves");
//            case 5 -> System.out.println("Viernes");
//            case 6 -> System.out.println("Sabado");
//            case 7 -> System.out.println("Domingo");
//            default -> System.out.println("Opcion invalida");
//        }

//        System.out.println("Propocione de calificacion(1/10): ");
//        var calificaion = Integer.parseInt(consola.nextLine());
//
//        switch (calificaion) {
//            case 10: case 9:
//                System.out.println("Calificacion A");
//                break;
//            case 8: case 7:
//                System.out.println("Calificacion B");
//                break;
//            case 6: case 5:
//                System.out.println("Calificacion C");
//                break;
//            case 4: case 3: case 2: case 1:
//                System.out.println("Calificacion F");
//                break;
//            default:
//                System.out.println("No exite este rango de calificacion");
//                break;
//        }

//        var contador = 0;
//        while (contador!=9){
//            System.out.println("klk manito diga la opcion que quieres hacer");
//            System.out.println("""
//                    1 = ver carros""");
//            contador = Integer.parseInt(consola.nextLine());
//            switch (contador){
//                case 1:
//                    verCarros();
//                    salirProgamar();
//                    contador = Integer.parseInt(consola.nextLine());
//
//                    break;
//                default:
//                    System.out.println("opcion incorrecta");
//                    break;
//            }
//        }
//        final var MAXIMO = 5;
//        var acumuladorSuma = 0;
//
//        for (var numero = 1; numero <= MAXIMO; numero++){
//            acumuladorSuma += numero;
//        }
//        System.out.println(acumuladorSuma);



//        System.out.println("*** Cajero Automarico ***");
//        var salir = false;
//        while (!salir){
//            System.out.print(service.menu);
//            var opcion = consola.nextInt();
//
//            switch (opcion){
//                case 1 -> service.consultarSaldo();
//                case 2 -> service.retirarSaldo();
//                case 3 -> service.depositarSaldo();
//                case 4 -> {
//                    System.out.println("Saliendo del programa....");
//                    salir = true;
//                }
//                default -> System.out.println("Opcion invalidad: " + opcion);
//            }
//            System.out.println();
//        }

//        System.out.println("*** Calculadora en Java ***");
//        var salir = false;
//        while (!salir){
//            System.out.print(service.menuCaladora);
//            var opcion = consola.nextInt();
//
//            switch (opcion){
//                case 1 -> service.getSuma();
//                case 2 -> service.getResta();
//                case 3 -> service.getMultiplicar();
//                case 4 -> service.getDividir();
//                case 5 -> {
//                    System.out.println("Saliendo del Programa....");
//                    salir = true;
//                }
//                default -> System.out.println("Opcion: " + opcion + " invalida");
//            }
//            System.out.println();
//        }

//        System.out.println("*** Resultados de ArrayList<>(); ***");
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        System.out.println("dame un numero para guardar");
//        var array = consola.nextInt();
//        arrayList.add(23);
//        arrayList.add(54);
//        arrayList.add(array);
//        System.out.println("este es el valor que proporciono: " + arrayList);
//        System.out.println();
//
//        //*********** Funcion del Arreglo int[] enteros; *************
//        System.out.println("*** Resultados de int[] arreglo; ***");
//        System.out.println("Proporciona el largo del arreglo: ");
//        var arregloLargo = consola.nextInt();
//        int[] arreglo = new int[arregloLargo];
//
//        for (int i = 0; i < arregloLargo; i++) {
//            //Solicita los valores del arreglo
//            System.out.print("Proporciona enteros[" + i + "] = ");
//            arreglo[i] = consola.nextInt();
//        }
//
//        //Imprime los valores del arreglo
//        for (int i = 0; i < arregloLargo; i++) {
//            System.out.println("Impresion del Arreglo:");
//            System.out.println("enteros[" + i + "] = " + arreglo[i]);
//        }

//        int resultado = 0;
//        System.out.print("Cuantas Calificaciones deseas agregar?: ");
//        var arregloLargo = consola.nextInt();
//        int[] arreglo = new int[arregloLargo];
//
//        for (int i = 0; i < arregloLargo; i++) {
//            System.out.print("Calificasion[" + i + "] = ");
//            arreglo[i] = consola.nextInt();
//        }
//        //Saca un promedio y lo imprime
//        var sumaPromedio = 0;
//        for (int i = 0; i < arregloLargo; i++) {
//            sumaPromedio += arreglo[i];
//        }
//        var resultados = sumaPromedio / arregloLargo;
//        System.out.println("Promedio de Calificasiones: " + resultados);

        //********** Matrices en Java ************

//        //Imprimiendo la Matriz
//        int[][] matriz = {
//                {100, 200, 300},
//                {400, 500, 600}
//        };
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.println("Valor[" + i + "][" + j + "] = " + matriz[i][j]);
//            }
//        }

        System.out.print("Cuantas filas deseas en la matriz?: ");
        var matrizRows = consola.nextInt();
        System.out.print("Cuantas columnas deseas en la matriz?: ");
        var matrizColumns = consola.nextInt();

        int[][] matriz = new int[matrizRows][matrizColumns];

        for (int i = 0; i < matrizRows; i++) {
            for (int j = 0; j < matrizColumns; j++) {
                System.out.print("valor[" + i + "][" + j + "] = ");
                matriz[i][j] = consola.nextInt();

            }
        }
        System.out.println();

        var suma = 0;
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz[fil].length; col++) {
                if (fil == col) {
                    suma += matriz[fil][col];
                }
            }
        }
        System.out.println(suma);

    }
}