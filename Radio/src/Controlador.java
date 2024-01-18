import java.util.Scanner;

public class Controlador{
    private Radio radio;
    private Scanner scanner;

    public Controlador() {
        this.radio = new RadioImplementado();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            System.out.println("1. Prender el radio");
            System.out.println("2. Cambiar de AM a FM a AM");
            System.out.println("3. Avanzar en el dial de las emisoras");
            System.out.println("4. Guardar una emisora en uno de los 12 botones");
            System.out.println("5. Seleccionar la emisora guardada en un botón");
            System.out.println("6. Apagar el radio");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    radio.encender();
                    break;
                case 2:
                    radio.cambiarFrecuencia();
                    break;
                case 3:
                    radio.avanzarEmisora();
                    break;
                case 4:
                    System.out.print("Ingrese el número del botón (1-12): ");
                    int botonGuardar = scanner.nextInt();
                    radio.guardarEmisora(botonGuardar);
                    break;
                case 5:
                    System.out.print("Ingrese el número del botón (1-12): ");
                    int botonSeleccionar = scanner.nextInt();
                    radio.seleccionarEmisoraGuardada(botonSeleccionar);
                    break;
                case 6:
                    radio.apagar();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
