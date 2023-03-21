public class persona {

    private String nombre;
    private String apellido;



    public persona (String nombre, String apellido){
        this.nombre="juan";
        this.apellido="padilla";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }


@Override
    public String toString(){
        return "nombre: " + this.nombre + "," + " apellido: " + this.apellido;
    }

}
