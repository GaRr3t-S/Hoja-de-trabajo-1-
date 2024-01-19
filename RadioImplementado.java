public class RadioImplementado implements Radio{
    private boolean encendido;
    private boolean frecuenciaAM;
    private double emisora;
    private Frequency[] emisorasGuardadas;

    public RadioImplementado(){
        this.encendido = false;
        this.frecuenciaAM = true;
        this.emisora = 530;
        this.emisorasGuardadas = new Frequency[12];
    }

    @Override
    public void encender(){
        this.encendido = true;
    }

    @Override
    public void apagar(){
        this.encendido = false;
    }

    @Override
    public void cambiarFrecuencia(){
        this.frecuenciaAM = !this.frecuenciaAM;
        if(this.frecuenciaAM == true){
            this.emisora = 530;
        } else {
            this.emisora = 87.9;
            
        }
    }

    @Override
    public void avanzarEmisora(){
        if (this.frecuenciaAM == true) {
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
        this.emisorasGuardadas[boton - 1] = new Frequency(this.frecuenciaAM, this.emisora);
    }
    @Override
    public void seleccionarEmisoraGuardada(int boton) {
        Frequency savedFrequency = this.emisorasGuardadas[boton - 1];
        if (savedFrequency != null) {
            this.frecuenciaAM = savedFrequency.getFrequencyType();
            this.emisora = savedFrequency.getFrequencyValue();
        }
    }

    @Override
    public void cambiarEmisora() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cambiarEmisora'");
    }
}
    

