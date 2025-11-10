public class Neumatico {
     public String marca;
    public String tipo;
    public String medida;
    public int indiceCarga;
    public int indiceVelocidad;

    // Constructor
    public Neumatico(String marca, String tipo, String medida, int indiceCarga, int indiceVelocidad) {
        this.marca = marca;
        this.tipo = tipo;
        this.medida = medida;
        this.indiceCarga = indiceCarga;
        this.indiceVelocidad = indiceVelocidad;
    }

    // Metodo
    public void mostrarNeumatico() {
        System.out.println("==Informacion del Neumatico== ");
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Medida: " + medida);
        System.out.println("Indice de Carga: " + indiceCarga);
        System.out.println("Indice de Velocidad: " + indiceVelocidad);
    }
}
