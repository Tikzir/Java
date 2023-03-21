public class temporal extends empleado{

    private double horas, total;
    public temporal(String codigo, String nombre, String apellido, double total, double horas) {
        super(codigo, nombre, apellido);
        this.horas = horas;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        int pagoHora = 7;
        this.total = total * pagoHora;
    }

    @Override
    public String toString() {
        return super.toString() + " // temporal: " + " horas laboradas " + horas + " Total " + getTotal() + "\n";
    }
}
