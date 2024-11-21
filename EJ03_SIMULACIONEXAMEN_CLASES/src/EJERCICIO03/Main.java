package EJERCICIO03;

import java.util.Scanner;  //IMPORTAMOS LA HERRAMIENTA SCANNER

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //DECLARAMOS EL SCANNER
        //PEDIMOS AL USUARIO UNA CADENA Y LA TRANSFORMAMOS DE STRING A UN ARRAY DE CHARS
        System.out.println("Introduce una cadena:");
        Cadenas cadena = new Cadenas(scanner.nextLine());

        char[] arr_cadena = cadena.ft_toCharArray(); //TRANSFORMACIÓN A ARRAY DE CHARS

        //GUARDO EN SPACES EL RESULTADO DEL METODO "NUMSPACES" Y MUESTRO POR PANTALLA
        int nspaces = cadena.numspaces(arr_cadena);
        System.out.println("La cadena contiene " + nspaces + " espacios");

        //GUARDO EN VOCALS EL RESULTADO DEL METODO "NUMVOCALS" Y MUESTRO POR PANTALLA
        int vocals = cadena.numvocals(arr_cadena);
        System.out.println("La cadena contiene " + vocals + " vocales");

        //MUESTRO LA CADENA ANTES DE LA CONVERSIÓN, EJECUTO "FT_FIRST_TOUPPER" PARA HACER LA CONVERSIÓN Y MUESTRO LA CADENA CONVERTIDA
        System.out.println("Cadena antes de la conversión: " + new String(arr_cadena)); //convierto el array a string para mostrarlo
        cadena.ft_first_toupper(arr_cadena);
        System.out.println("Cadena despues de la conversión: " + new String(arr_cadena));//convierto el array a string para mostrarlo

        //CERRAMOS EL SCANNER
        scanner.close();
    }
}