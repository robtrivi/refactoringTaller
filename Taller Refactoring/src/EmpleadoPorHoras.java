public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento, genero);
        this.tarifaHora = tarifaHora;
        super.setSalarioBase(calcularSalario());
    }

    @Override
    public void imprimirDetalles(){
        super.imprimirDetalles();
    }

    @Override
    public double calcularSalario() {
        double salario = super.getHorasTrabajadas() * super.getTarifaHora();
        return salario;
    }

    // Más metodos

    public double getTarifaHora() {
        return tarifaHora;
    }
}