import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        rutNormal rutN1 = new rutNormal("Ventana", 1, true, 1.50, 20, "Juan Diaz", 2132546587, "21/02/2024","30/02/2024","Normal", "Quito-Guayaquil ");
        rutNormal rutN2 = new rutNormal("Pasillo", 1, false, 0, 15, "Juanito Caras", 123435435, "01/02/2024","05/02/2024","Normal", "Quito-Puyo ");

        serv_Rutavip srutV1 = new serv_Rutavip(1, true, 3.50, 20, "Roman Perez", 1752463289, "17/02/2024","18/02/2024","VIP", "Quito-Guayaquil", "Internet",10, "Nada", 0);
        serv_Rutavip srutV2 = new serv_Rutavip(1, true, 3.50, 17.5, "Leonel Messi", 1782465464, "17/02/2024","18/02/2024","VIP", "Quito-Riobamba", "Internet",10, "Television", 50.5);

        rutN1.datosCLiente();
        rutN2.datosCLiente();
        srutV1.datosCLiente();
        srutV2.datosCLiente();
    }
}