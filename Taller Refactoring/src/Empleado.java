public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private Departamento departamento;
    private String genero;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.genero = genero;
    }


    public double calcularSalario() {
        validarEntradas();
    
        double salarioTotal = salarioBase;
    
        calcularPagoHorasExtra(salarioTotal); // Actualizar salarioTotal con el pago por horas extra
        calcularBonificacionDepartamento(salarioTotal); // Actualizar salarioTotal con el bono de departamento
    
        return salarioTotal;
    }
    
    private void validarEntradas() {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
    
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
    }
    
    private void calcularPagoHorasExtra(double salarioTotal) {
        if (horasTrabajadas > 40) {
            salarioTotal += (horasTrabajadas - 40) * 50; // Pago de horas extra
        }
    }


    private void calcularBonificacionDepartamento(double salarioTotal) {
                salarioTotal += departamento.getExtraBonifacion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // Más metodos

    public void imprimirDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Genero: " + getGenero());
        System.out.println("Salario: " + getSalarioBase());
        System.out.println("Horas trabajadas: " + getHorasTrabajadas());
        System.out.println("Departamento: " + getDepartamento());
    }

}
