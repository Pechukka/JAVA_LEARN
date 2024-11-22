package EXAMEN_CLASES;

public class Coches {
    // ARGUMENTOS
    private String matricula;
    private String modelo;
    private double precio;
    private int fecha_matriculacion;


    // CONSTRUCTOR
    public Coches(String plate, String model, double price, int date) {
        this.matricula = plate;
        this.modelo = model;
        this.precio = price;
        this.fecha_matriculacion = date;
    }


    // GETTERS
    public String get_Matricula() {
        return matricula;
    }

    public String get_Modelo() {
        return modelo;
    }

    public double get_Precio() {
        return precio;
    }

    public int get_Fecha_Matriculacion() {
        return fecha_matriculacion;
    }


    // SETTERS
    public void set_Matricula(String matricula) {
        this.matricula = matricula;
    }

    public void set_Modelo(String modelo) {
        this.modelo = modelo;
    }

    public void set_Precio(double precio) {
        this.precio = precio;
    }

    public void set_Fecha_Matriculacion(int fecha_matriculacion) {
        this.fecha_matriculacion = fecha_matriculacion;
    }

    public double precio_futuro()
    {
        double  precio_actual = this.precio;
        
        for(int i = 0; i < 5; i++)
            precio_actual *= 0.93;
        return(precio_actual);
    }
}
