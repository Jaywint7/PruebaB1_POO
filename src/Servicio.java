class Servicio extends Cliente {
    String tipoviaje;

    public Servicio(String nombre, int idcliente, String fechaviaje, String fecharet, String tipoviaje){
        super(nombre, idcliente, fechaviaje, fecharet);
        this.tipoviaje = tipoviaje;
    }

    public String getTipoviaje() {
        return tipoviaje;
    }

    double monto;

    public double getMonto() {
        return monto;
    }

    public void costoPasaje(){
        monto = 0;
    }

    @Override
    public void datosCLiente(){
        super.datosCLiente();
        System.out.println("Su tipo de Servicio es: "+tipoviaje);
    }
}
