public class Cliente {
    String nombre;
    int idcliente;
    String fechaviaje;
    String fecharet;

    public Cliente(String nombre, int idcliente, String fechaviaje, String fecharet){
        this.nombre = nombre;
        this.idcliente = idcliente;
        this.fechaviaje = fechaviaje;
        this.fecharet = fecharet;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaviaje() {
        return fechaviaje;
    }

    public String getFecharet() {
        return fecharet;
    }

    public void datosCLiente(){
        System.out.println("-----Datos Cliente-------");
        System.out.println("Nombre: "+nombre+"\n"+"Id: "+idcliente+"\n"+"Fecha Viaje: "+ fechaviaje+"\n"+"Fecha Retorno: "+ fecharet);
    }
}
