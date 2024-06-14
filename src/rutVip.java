class rutVip extends Servicio {
    public int maleta;
    public boolean maletaAdd;
    public double costoMaletaext;
    public double costoVip;
    public String ruta;

    public rutVip(int maleta, boolean maletaAdd, double costoMaletaext, double costoVip, String nombre, int idcliente, String fechaviaje, String fecharet, String tipoviaje, String ruta){
        super(nombre, idcliente, fechaviaje, fecharet, tipoviaje);
        this.maleta = maleta;
        this.maletaAdd = maletaAdd;
        this.costoMaletaext = costoMaletaext;
        this.costoVip = costoVip;
        this.ruta = ruta;
    }


    @Override
    public void costoPasaje(){
        monto = 0+ (costoVip*0.3)+costoVip +costoMaletaext+ costoVip;
        System.out.println("La cantidad total del viaje VIP es de: "+getMonto());
    }

    @Override
    public void datosCLiente() {
        System.out.println("Los datos del viaje VIP son: ");
        super.datosCLiente();
        System.out.println("Num Maletas: "+maleta+"\n"+"Maleta Adicional: "+ maletaAdd+"\n"+"Costo Maleta Adicional: "+costoMaletaext+"\n"+"Costo Viaje Normal: "+ costoVip +"\n"+"Ruta: "+ruta);
        System.out.println("________________________________");
        costoPasaje();
        System.out.println("\n");
    }
}
