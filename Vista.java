import java.util.Scanner;

public class Vista {
    private Controlador controlador;

    public Vista(Controlador controlador) {
        this.controlador = controlador;
    }

    public void iniciar() {
        while (true) {
            int opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    controlador.encender();
                    break;
                case 2:
                    controlador.cambiarFrecuencia();
                    break;
                case 3:
                    controlador.avanzarEmisora();
                    break;
                case 4:
                    int botonGuardar = solicitarBoton();
                    controlador.guardarEmisora(botonGuardar);
                    break;
                case 5:
                    int botonSeleccionar = solicitarBoton();
                    controlador.seleccionarEmisoraGuardada(botonSeleccionar);
                    break;
                case 6:
                    controlador.apagar();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }

    private int mostrarMenu() {
        System.out.println("1. Prender el radio");
        System.out.println("2. Cambiar de AM a FM a AM");
        System.out.println("3. Avanzar en el dial de las emisoras");
        System.out.println("4. Guardar una emisora en uno de los 12 botones");
        System.out.println("5. Seleccionar la emisora guardada en un botón");
        System.out.println("6. Apagar el radio");
        System.out.print("Seleccione una opción: ");
        return new Scanner(System.in).nextInt();
    }

    private int solicitarBoton() {
        System.out.print("Ingrese el número del botón (1-12): ");
        return new Scanner(System.in).nextInt();
    }
}
