import java.util.Scanner;

public class Controlador {
    private Radio radio;
    private Scanner scanner;

    public Controlador() {
        this.radio = new RadioImplementado();
        this.scanner = new Scanner(System.in);
    }

    public void encender() {
        radio.encender();
    }

    public void apagar() {
        radio.apagar();
    }

    public void cambiarFrecuencia() {
        radio.cambiarFrecuencia();
    }

    public void avanzarEmisora() {
        radio.avanzarEmisora();
    }

    public void guardarEmisora(int boton) {
        radio.guardarEmisora(boton);
    }

    public void seleccionarEmisoraGuardada(int boton) {
        radio.seleccionarEmisoraGuardada(boton);
    }
}
