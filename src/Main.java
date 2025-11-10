public class Main {
    public static void main(String[] args) {
        // Creacion de objeto Vehiculo
        Vehiculo miVehiculo = new Vehiculo(1, "Toyota", "Corolla", "Rojo", 2020);
        miVehiculo.mostrarVehiculo();

         Motor motor1 = new Motor(2.0, 150, "Gasolina", 4);
        motor1.mostrarMotor();

        Transmision transmision1 = new Transmision("Automatica", 6, "Delantera", true);
        transmision1.mostrarTransmision();

    
    }
    
}
