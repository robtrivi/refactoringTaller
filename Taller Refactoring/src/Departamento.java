public class Departamento {
    private double extraBonificacion;
    private String nombre;

    public Departamento(double extraBonificacion, String nombreString){
        this.extraBonificacion=extraBonificacion;
        this.nombre=nombreString;
    }

    public double getExtraBonifacion(){
        return this.extraBonificacion;
    }

    public String getNombre(){
        return this.nombre;
    }

}
