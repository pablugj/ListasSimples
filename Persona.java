package sistema;
public class Persona 
{
    private String nombre;
    private int edad;
    private double dinero;
    private String escuela;
    
    //Constructor Publico -> Inicializar
    public Persona(String _nombre,int _edad, double _pago,String _escuela)
    {
        this.nombre = _nombre;
        this.edad = _edad;
        this.dinero = _pago;
        this.escuela = _escuela;
    }
    
     public String getNombre() {
        return nombre;
    }
     
     public int getEdad() {
        return edad;
    }

    public double getDinero() {
        return dinero;
    }

    public String getEscuela() {
        return escuela;
    }
    
    public String ImprimirDatos()
    {
        return nombre + " " + edad + " " + escuela;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDinero(double _newdinero)
    {
        this.dinero = _newdinero;
    }
    
    
    
    
}
