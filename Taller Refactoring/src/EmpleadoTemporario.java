public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, String genero, int mesesContrato) {
		super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        this.mesesContrato = mesesContrato;
    }

    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
