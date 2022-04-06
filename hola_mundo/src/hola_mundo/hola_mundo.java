package hola_mundo;

public class hola_mundo {
    public static void main(String[] args) {

        //crear variable de tipo string llamada nombre.
        String nombre = "";
        //crear variable de tipo string llamada primer apellido.
        String primer_apellido = "";
        //crear variable de tipo string llamada segundo apellido.
        String segundo_apellido = "";

        int opcion = 0;

        //Imprimir mensaje en pantalla que diga "Introduzca su nombre" para que el usuario introduzca su nombre.
        System.out.println("Introduzca su nombre");

        //Leer el nombre del usuario.
        nombre = System.console().readLine();

        System.out.println("Introduzca su primer apellido");

        //Leer el primer apellido del usuario.
        primer_apellido = System.console().readLine();

        System.out.println("Introduzca su segundo apellido");

        segundo_apellido = System.console().readLine();

        do{
            System.out.println("");
            System.out.println("****************Menú****************");
            System.out.println("");
            System.out.println("Escoge una de las siguienes opciones. Teclea 0 para salir.");
            System.out.println("");
            System.out.println("Opción 1: Mostrar el nombre completo");
            System.out.println("Opción 2: Mostrar sólamente el nombre");
            System.out.println("Opción 3: Mostrar sólamente el primer apellido");
            System.out.println("Opción 4: Mostrar sólamente el segundo apellido");
            System.out.println("");
            System.out.println("Opción 5: Mostrar número de letras del nombre");
            System.out.println("Opción 6: Mostrar número de letras del primer apellido");
            System.out.println("Opción 7: Mostrar número de letras del segundo apellido");
            System.out.println("");

        

            //Leer la opción del usuario.
            opcion = Integer.parseInt(System.console().readLine());

            //Crear un switch llamado menú, que tenga 7 casos.
            switch (opcion) {
                case 1:
                    //En el caso 1, mostrar el nombre completo.
                    System.out.println("");
                    System.out.println("Su nombre completo es: " + nombre + " " + primer_apellido + " " + segundo_apellido);
                    System.out.println("");
                    break;
                case 2:
                    //En el caso 2, mostrar sólamente el nombre.
                    System.out.println("");
                    System.out.println("Su nombre es: " + nombre);
                    System.out.println("");
                    break;
                case 3:
                    //En el caso 3, mostrar sólamente el primer apellido.
                    System.out.println("");
                    System.out.println("Su primer apellido es: " + primer_apellido);
                    System.out.println("");
                    break;
                case 4:
                    //En el caso 4, mostrar sólamente el segundo apellido.
                    System.out.println("");
                    System.out.println("Su segundo apellido es: " + segundo_apellido);
                    System.out.println("");
                    break;
                case 5:
                    //En el caso 5, mostrar número de letras del nombre.
                    System.out.println("");
                    System.out.println("El número de letras del nombre es: " + nombre.length());
                    System.out.println("");
                    break;
                case 6:
                    //En el caso 6, mostrar número de letras del primer apellido.
                    System.out.println("");
                    System.out.println("El número de letras del primer apellido es: " + primer_apellido.length());
                    System.out.println("");
                    break;
                case 7:
                    //En el caso 7, mostrar número de letras del segundo apellido.
                    System.out.println("");
                    System.out.println("El número de letras del segundo apellido es: " + segundo_apellido.length());
                    System.out.println("");
                    break;
                default:
                    //En el caso por defecto, mostrar mensaje de error.
                    System.out.println("");
                    System.out.println("Opción incorrecta");
                    System.out.println("");
                    break;
            }
        } while (opcion != 0);
    }
}