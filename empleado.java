public class empleado {
   private String codigoEmpleado, nombre, apellido;

    public empleado(String codigo, String nombre, String apellido) {
        this.codigoEmpleado = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return ("Informacion de empleado " + "\n " + " codigo empleado: "  + codigoEmpleado + " //  nombre: " + nombre +
                " //  apellido: " + apellido);
    }
}
