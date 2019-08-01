package ordenamiento;
public class Persona {
    private String nombre;
    private String apellidop;
    private String apellidom;
    private int anio;
    private int telefono;
    public Persona(String nombre, String apellidop, String apellidom, int anio, int telefono) {
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.anio = anio;
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + nombre + ", Apellidos=" + apellidop + " "+ apellidom + ", anio=" + anio + ", telefono=" + telefono + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    } 
  } 
//control flechas te mueves rapido