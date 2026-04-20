package FuncionesGestion;

public class CatalogoObject {
   private String codigo,nombre,tipo, naturaleza;
   private double cantidad;
   
   public CatalogoObject(String codigo, String nombre, String tipo, String naturaleza, double cantidad) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.tipo = tipo;
       this.naturaleza = naturaleza;
       this.cantidad = cantidad;
   }
   
   public String getCodigo() { return codigo; }
   public String getNombre() { return nombre; }
   public String getTipo() { return tipo; }
   public String getNaturaleza() { return naturaleza; }
   public double getCantidad() { return cantidad; }
   
   public void setCodigo(String codigo) { this.codigo = codigo; }
   public void setNombre(String nombre) { this.nombre = nombre; }
   public void setTipo(String tipo) { this.tipo = tipo; }
   public void setNaturaleza(String naturaleza) { this.naturaleza = naturaleza; }
   public void setCantidad(double cantidad) { this.cantidad = cantidad; }
   
}
