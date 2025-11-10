public class Main {
    public static void main(String[] args) {
        // Creacion de objeto Vehiculo
        Vehiculo miVehiculo = new Vehiculo(1, "Toyota", "Corolla", "Rojo", 2020);
        miVehiculo.mostrarVehiculo();

         Motor motor1 = new Motor(2.0, 150, "Gasolina", 4);
        motor1.mostrarMotor();

        Transmision transmision1 = new Transmision("Automatica", 6, "Delantera", true);
        transmision1.mostrarTransmision();

        Chasis chasis1 = new Chasis("Monocasco", "Acero reforzado", 320.5, 4.55, 1.78, 1.45);
        chasis1.mostrarChasis();

        Neumatico neumatico1 = new Neumatico("Michelin", "All-Terrain", "225/65 R17", 102, 72 );
        neumatico1.mostrarNeumatico();

    
    }
    
}
