class rutNormal extends Servicio {
    public String tipoAsiento;
    public int maleta;
    public boolean maletaAdd;
    public double costoMaletaext;
    public double costoNormal;
    public String ruta;

    public rutNormal(String tipoAsiento, int maleta, boolean maletaAdd, double costoMaletaext, double costoNormal, String nombre, int idcliente, String fechaviaje, String fecharet, String tipoviaje, String ruta){
        super(nombre, idcliente, fechaviaje, fecharet, tipoviaje);
        this.tipoAsiento =tipoAsiento;
        this.maleta = maleta;
        this.maletaAdd = maletaAdd;
        this.costoMaletaext = costoMaletaext;
        this.costoNormal = costoNormal;
        this.ruta = ruta;
    }


    @Override
    public void costoPasaje(){
        monto = 0+costoNormal+costoMaletaext;
        System.out.println("La cantidad total del viaje Normal es de: "+getMonto());
    }

    @Override
    public void datosCLiente() {
        System.out.println("Los datos del viaje Normal son: ");
        super.datosCLiente();
        System.out.println("Tipo Asiento: "+tipoAsiento+"\n"+"Num Maletas: "+maleta+"\n"+"Maleta Adicional: "+ maletaAdd+"\n"+"Costo Maleta Adicional: "+costoMaletaext+"\n"+"Costo Viaje Normal: "+costoNormal+"\n"+"Ruta: "+ruta);
        System.out.println("________________________________");
        costoPasaje();
        System.out.println("\n");
    }
}
