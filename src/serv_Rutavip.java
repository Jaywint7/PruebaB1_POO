class serv_Rutavip extends rutVip {
    String tipoServicio;
    double costotipoServicio;
    String sevicioExtra;
    double costoservEctra;

    public serv_Rutavip(int maleta, boolean maletaAdd, double costoMaletaext, double costoVip, String nombre, int idcliente, String fechaviaje, String fecharet, String tipoviaje, String ruta, String tipoServicio, double costotipoServicio,String sevicioExtra,double costoservEctra){
        super(maleta, maletaAdd, costoMaletaext, costoVip, nombre, idcliente, fechaviaje, fecharet, tipoviaje, ruta);
        this.tipoServicio = tipoServicio;
        this.costotipoServicio = costotipoServicio;
        this.sevicioExtra = sevicioExtra;
        this.costoservEctra = costoservEctra;
    }

    @Override
    public void costoPasaje(){
        monto = 0+ (costoVip*0.3)+costoVip +costoMaletaext+ costotipoServicio+costoservEctra;
        System.out.println("La cantidad total del viaje VIP es de: "+getMonto());
    }

    @Override
    public void datosCLiente() {
        System.out.println("Los datos del viaje VIP son: ");
        super.datosCLiente();
        System.out.println("Tipo Servicio: "+tipoServicio+"\n"+"Costo Tipo Servicio: "+ costotipoServicio+"\n"+"Tipo Servicio Extra: "+sevicioExtra+"\n"+"Costo Tipo Servicio Extra: "+ costoservEctra);
        System.out.println("________________________________");
        costoPasaje();
        System.out.println("\n");
    }

}
