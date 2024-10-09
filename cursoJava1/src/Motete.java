
class Motete
{

    static Boolean suma(Integer numero1)
    {
        return (numero1 % 2 == 0)? true: false;
    }

    static void funcion(Integer numero)
    {
        if (numero == 1) {
            System.out.print(numero + " ");
        }
        else {
            System.out.print(numero + " ");
            funcion(numero - 1);
        }
    }
}

class Demo
{
    void main()
    {
//        System.out.print("ingres un numero: ");
//        var numero = new Scanner(System.in).nextInt();
//        System.out.println("el numero es par?: " + suma(numero));

        Motete.funcion(7);
        String name = "Motete";
        Integer age = 29;

        String message = STR."hola, my name \{name}, i am \{age} years old";

        System.out.println(message);

    }
}
