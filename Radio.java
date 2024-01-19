public interface Radio {
    void encender();
    void apagar();
    void cambiarFrecuencia();
    void avanzarEmisora();
    void guardarEmisora(int boton);
    void seleccionarEmisoraGuardada(int boton);
}