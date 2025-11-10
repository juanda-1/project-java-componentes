Nombre del proyecto

Registro Vehicular

Descripción general

Este proyecto implementa un sistema orientado a objetos en Java que modela distintos componentes de un vehículo, tales como motor, chasis, transmisión, frenos, neumáticos, sensores, sistema eléctrico, registro vehicular y mantenimiento.
Cada clase representa una parte importante del vehículo y contiene atributos y métodos esenciales para su funcionamiento.
Además, se crean objetos en el método main y se muestran sus datos en consola.

Diagrama o descripción de las clases y sus relaciones
Clases principales

Vehiculo
Atributos generales de cualquier vehículo: marca, modelo, año, color, peso, etc.

Motor
Tipo de motor, cilindrada, caballos de fuerza, consumo, etc.

Transmision
Tipo de transmisión, número de marchas y relación.

Chasis
Material, dimensiones, peso estructural.

Neumatico
Tipo de caucho, tamaño, presión recomendada.

SistemaFrenos
Tipo de frenos y eficiencia.

SistemaElectrico
Voltaje, capacidad, tipo de batería.

Sensor
Modela sensores individuales del vehículo (velocidad, temperatura, presión, etc).

Mantenimiento
Historial y programación de mantenimientos realizados.

RegistroVehicular
Matrícula, propietario y fecha de registro.

Relación general entre clases
                     Vehiculo
        -------------------------------------------------
        |                |             |                |
      Motor         Transmision     Chasis         SistemaElectrico
        |                |             |                |
        -------------------------------------------------
        |                |             |                |
    SistemaFrenos     Neumatico     Sensor         Mantenimiento

![Captura de la salida 1](./capturas/salida1.png)
![Captura de la salida 2](./capturas/salida2.png)