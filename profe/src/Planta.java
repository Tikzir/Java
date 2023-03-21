public class Planta extends profe{
    private int horasClase, horasInvestigacion, horasAdmin;

    public Planta(String nombre,String apellido,String numeroDi,String tipoDi, int horasClase, int horasInvestigacion, int horasAdmin) {
        super(nombre, apellido, numeroDi, tipoDi);
        this.horasClase = horasClase;
        this.horasInvestigacion = horasInvestigacion;
        this.horasAdmin = horasAdmin;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public int getHorasInvestigacion() {
        return horasInvestigacion;
    }

    public void setHorasInvestigacion(int horasInvestigacion) {
        this.horasInvestigacion = horasInvestigacion;
    }

    public int getHorasAdmin() {
        return horasAdmin;
    }

    public void setHorasAdmin(int horasAdmin) {
        this.horasAdmin = horasAdmin;
    }

    @Override
    public String toString() {
        return "profesor planta [" + super.toString() + " horas clase=" + horasClase + " horas administrativas=" + horasAdmin;
    }
}
