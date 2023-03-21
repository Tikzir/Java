public class profe {
    private String nombre,
                    apellido,
                    numeroDi,
                    tipoDi;

    public profe(String nombre, String apellido, String numeroDi, String tipoDi) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDi = numeroDi;
        this.tipoDi = tipoDi;
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

    public String getNumeroDi() {
        return numeroDi;
    }

    public void setNumeroDi(String numeroDi) {
        this.numeroDi = numeroDi;
    }

    public String getTipoDi() {
        return tipoDi;
    }

    public void setTipoDi(String tipoDi) {
        this.tipoDi = tipoDi;
    }

    @Override
    public String toString(){
        return "nombre" + this.nombre + " apellido " + this.apellido +  " numero Di: " + this.numeroDi + "tipo Di: " + this.tipoDi;
    }
}
