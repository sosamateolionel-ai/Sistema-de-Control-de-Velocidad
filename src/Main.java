//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ControlVelocidad control = new ControlVelocidad(120.0);

    System.out.println("Velocidad inicial: " + control.getVelocidadActual() + " km/h");

    System.out.println("\n--- Aceleraciones ---");
    control.acelerar(50);
    control.acelerar(40);
    control.acelerar(100);   // extremo: supera el máximo
    control.acelerar(-10);   // inválido

    System.out.println("\n--- Frenados ---");
    control.frenar(30);
    control.frenar(500);     // extremo: baja de cero
    control.frenar(0);       // inválido

    System.out.println("\nVelocidad final: " + control.getVelocidadActual() + " km/h");

}
