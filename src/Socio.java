public class Socio {

    private String Nombre, direccion;
    private int No_identificacion, telefono, fecha_alta;

    protected void realizarprestamos(){

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNo_identificacion() {
        return No_identificacion;
    }

    public void setNo_identificacion(int no_identificacion) {
        No_identificacion = no_identificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(int fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
}
