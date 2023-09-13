public class Gafa {
   
    String nombre;
    double precio;
   
    public Gafa(String n, double p){
            this.nombre = n;
            this.precio = p;
        }

    public String toString() {
        return "(" + this.nombre + "," + this.precio + ")";
    }
}
