public class supervisor extends empleado {
    private double sueldo, comision, total;


    public supervisor(String codigo, String nombre, String apellido, double sueldo, double comision) {
        super(codigo, nombre, apellido);
        this.sueldo = sueldo;
        this.comision = comision;
        setTotal(sueldo, comision);


    }

    public void setTotal(double sueldo, double comision){
        this.sueldo = sueldo;
        this.comision = comision;
        total = this.sueldo + this.comision;
    }

    public double getSueldo(){
        return total;
    }

    public double getComision() {
        return comision;
    }

    public double getTotal(){
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + " // Supervisor: " + " sueldo " + sueldo + " comision " + comision + " total " + getTotal() + "\n";
    }
}
