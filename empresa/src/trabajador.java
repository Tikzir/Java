public class trabajador extends empleado{

    private double sueldo;

    public trabajador(String codigo, String nombre, String apellido, double sueldo) {
        super(codigo, nombre, apellido);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " // Trabajador: " + " total " + getSueldo() + "\n";
    }
}
