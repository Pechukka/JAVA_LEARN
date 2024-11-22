package EXAMEN_CLASES;

public class Main
{
    public static void main(String[] args)
    {
        // CREACIÓN DE OBJETO MICOCHE PARA CLASE COCHES
        Coches miCoche = new Coches("1234ABC", "Toyota", 20000.0, 2021);

        // USO DE LOS METODOS GET DE LA CLASE
        System.out.println("Matrícula: " + miCoche.get_Matricula());
        System.out.println("Modelo: " + miCoche.get_Modelo());
        System.out.println("Precio: " + miCoche.get_Precio());
        System.out.println("Fecha de matriculación: " + miCoche.get_Fecha_Matriculacion());

        // USO DE LOS METODOS SET DE LA CLASE
        miCoche.set_Precio(20000.0);
        System.out.println("Nuevo precio: " + miCoche.get_Precio());

        // PRECIO FUTURO
        double precioOriginal = miCoche.get_Precio();
        double precioFuturo = miCoche.precio_futuro();
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Precio futuro en 5 años: " + precioFuturo);
    
    }
}
