# Sistema de Control de Velocidad

## Descripción

Este proyecto desarrolla una clase `ControlVelocidad` en Java que permite simular el control de velocidad de un vehículo mediante operaciones de aceleración y frenado. El sistema utiliza atributos privados y validaciones para mantener la velocidad dentro de los límites establecidos.

## Funcionamiento

El programa crea un controlador con una velocidad máxima permitida de 120 km/h y una velocidad inicial de cero. Luego realiza diferentes pruebas de aceleración y frenado para comprobar el comportamiento del sistema.

* **Inicialización:** establece la velocidad actual en cero y define la velocidad máxima permitida.
* **Aceleración:** incrementa la velocidad cuando el valor ingresado es mayor que cero.
* **Control del límite máximo:** si la velocidad supera el máximo permitido, se ajusta automáticamente al límite establecido.
* **Frenado:** disminuye la velocidad cuando el decremento es válido.
* **Control de velocidad mínima:** si el frenado produce una velocidad negativa, el sistema establece la velocidad en cero.
* **Validación de operaciones:** rechaza incrementos y decrementos iguales o inferiores a cero.

## Clases principales

### `ControlVelocidad`

Representa un controlador que administra la velocidad actual de un vehículo y su límite máximo permitido.

**Atributos:**

* `velocidadActual`: almacena la velocidad actual del vehículo.
* `velocidadMaximaPermitida`: establece el límite máximo de velocidad.

**Métodos principales:**

* `getVelocidadActual()`: devuelve la velocidad actual.
* `getVelocidadMaximaPermitida()`: devuelve el límite máximo permitido.
* `acelerar(double incremento)`: aumenta la velocidad sin superar el máximo establecido.
* `frenar(double decremento)`: disminuye la velocidad sin permitir valores negativos.

### `Main`

Contiene el método `main`, crea un objeto `ControlVelocidad` y ejecuta pruebas para verificar las aceleraciones, los frenados y las restricciones del sistema.

## Conceptos de programación utilizados

* **Programación orientada a objetos (POO):** representación del control de velocidad mediante una clase.
* **Encapsulamiento:** uso de atributos privados para impedir modificaciones directas.
* **Métodos de acceso (getters):** permiten consultar los valores sin modificarlos.
* **Validación de datos:** rechaza incrementos y decrementos no válidos.
* **Estructuras condicionales:** utilizan `if` para comprobar los límites de velocidad.
* **Control de límites:** evita que la velocidad supere el máximo o sea inferior a cero.
* **Modificación controlada de atributos:** la velocidad solo cambia mediante los métodos `acelerar()` y `frenar()`.

## Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git y GitHub

## Ejecución

<img width="712" height="400" alt="image" src="https://github.com/user-attachments/assets/5d68de41-673b-40a6-b90c-b1d3570403c7" />

## Resultado esperado

El controlador comienza en `0.0 km/h`. Las aceleraciones llevan la velocidad hasta el límite de `120.0 km/h`, sin permitir que se supere. Los incrementos negativos son rechazados.

Durante los frenados, la velocidad disminuye hasta llegar a cero. Si el decremento supera la velocidad actual, el sistema establece la velocidad en `0.0 km/h`. Los decrementos iguales o inferiores a cero son rechazados.

La velocidad final esperada es de `0.0 km/h`.

## Objetivo del ejercicio

Aplicar los principios de encapsulamiento, validación y control de límites en Java mediante una clase que permita modificar la velocidad de forma segura, evitando valores inválidos y manteniendo la integridad de los datos.
