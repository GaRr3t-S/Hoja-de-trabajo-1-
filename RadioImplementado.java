public class RadioImplementado implements Radio {
    private boolean encendido;
    private String frecuencia;
    private double emisora;
    private double[] emisorasGuardadas;

    public RadioImplementado() {
        this.encendido = false;
        this.frecuencia = "AM";
        this.emisora = 530;
        this.emisorasGuardadas = new double[12];
    }

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    @Override
    public void cambiarFrecuencia() {
        if (this.frecuencia.equals("AM")) {
            this.frecuencia = "FM";
            this.emisora = 87.9;
        } else {
            this.frecuencia = "AM";
            this.emisora = 530;
        }
    }

    @Override
    public void avanzarEmisora() {
        if (this.frecuencia.equals("AM")) {
            this.emisora += 10;
            if (this.emisora > 1610) {
                this.emisora = 530;
            }
        } else {
            this.emisora += 0.2;
            if (this.emisora > 107.9) {
                this.emisora = 87.9;
            }
        }
    }

    @Override
    public void guardarEmisora(int boton) {
        this.emisorasGuardadas[boton - 1] = this.emisora;
    }

    @Override
    public void seleccionarEmisoraGuardada(int boton) {
        double emisoraGuardada = this.emisorasGuardadas[boton - 1];
        if (emisoraGuardada != 0) {
            this.emisora = emisoraGuardada;
            if (this.emisora < 108) {
                this.frecuencia = "FM";
            } else {
                this.frecuencia = "AM";
            }
        }
    }
}