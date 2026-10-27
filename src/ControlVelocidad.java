public class ControlVelocidad {

    private double velocidadActual;
    private double velocidadMaximaPermitida;

    public ControlVelocidad(double velocidadMaximaPermitida) {
        this.velocidadActual = 0;
        this.velocidadMaximaPermitida = velocidadMaximaPermitida;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public double getVelocidadMaximaPermitida() {
        return velocidadMaximaPermitida;
    }

    public void acelerar(double incremento) {

        if (incremento <= 0) {
            System.out.println("Aceleración rechazada: el incremento debe ser mayor a cero (" + incremento + ").");
            return;
        }

        velocidadActual = velocidadActual + incremento;

        if (velocidadActual > velocidadMaximaPermitida) {
            velocidadActual = velocidadMaximaPermitida;
            System.out.println("Límite alcanzado: la velocidad se acota a " + velocidadActual + " km/h.");
        } else {
            System.out.println("Acelerando: " + velocidadActual + " km/h.");
        }
    }

    public void frenar(double decremento) {

        if (decremento <= 0) {
            System.out.println("Frenado rechazado: el decremento debe ser mayor a cero (" + decremento + ").");
            return;
        }

        velocidadActual = velocidadActual - decremento;

        if (velocidadActual < 0) {
            velocidadActual = 0;
            System.out.println("Vehículo detenido: la velocidad no puede ser negativa (0.0 km/h).");
        } else {
            System.out.println("Frenando: " + velocidadActual + " km/h.");
        }
    }
}