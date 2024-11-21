package EJERCICIO03;


public class Cadenas
{
    //VARIABLE ATRIBUTO DE LA CADENA
    private String cadena;

    //ESTA FUNCION ES LO QUE LLAMAMOS CONSTRUCTOR Y CREAMOS EL OBJETO CADENA
    public Cadenas (String str)
    {
        this.cadena = str;
    }

    //GETTERS Y SETTERS
    public String getString ()
    {
        return(cadena);
    }

    public void setString (String str)
    {
        this.cadena=str;
    }

    //METODOS

    //CONVIERTE CADENA A UN ARRAY DE CARÁCTERES Y LO RETORNA
    public char[] ft_toCharArray ()
    {
        return this.cadena.toCharArray();
    }

    //CUENTA CUANTOS ESPACIOS SE ENCUENTRAN ES EN UN ARRAY DE CARACTERES
    public int numspaces (char arry[])
    {
        int nspaces = 0;

        for(int i = 0; i < arry.length; i++)
            if(arry[i] == ' ')
                nspaces++;
        return (nspaces);
    }

    //CUENTA CUANTAS VOCALES SE ENCUENTRAN ES EN UN ARRAY DE CARACTERES
    public int numvocals (char arry[])
    {
        int nvocals = 0;
        String find = "AEIOUaeiou";
    
        for(int i = 0; i < arry.length; i++)
            if(find.indexOf(arry[i]) != -1)
                nvocals++;
        return (nvocals);
    }

    //CONVIERTE LA PRIMERA LETRA O LA PRIMERA LETRA DE CADA PALABRA SEGUIDA DE UN ESPACIO EN MAYUCULA
    public void ft_first_toupper(char[] arry)
    {
        if(arry[0] >= 'a' && arry[0] <= 'z')
            arry[0] -= 32;
        for (int i = 1; i < arry.length; i++)
            if (arry[i] >= 'a' && arry[i] <= 'z' && arry[i - 1] == ' ')
                arry[i] -= 32;
    }
}