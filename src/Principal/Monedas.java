package Principal;

import java.util.Scanner;

public class Monedas {

    private double cantidadAConvertir;
    private double monedaConvertida;
    private String prefijoOrigen;
    private String prefijoDestino;
    private double valorActual;
    private double valorUnitario;


    public double getCantidadAConvertir() {
        return cantidadAConvertir;
    }

    public void setCantidadAConvertir(double cantidadAConvertir) {
        this.cantidadAConvertir = cantidadAConvertir;
    }

    public Monedas(catching miCatching){
        this.valorActual = miCatching.conversion_result();
        prefijoOrigen = miCatching.base_code();
        prefijoDestino = miCatching.target_code();
        valorUnitario = miCatching.conversion_rate();
    }



    public void imprime()
        {
            System.out.println("Valor Unitario: " + valorUnitario + prefijoDestino);
            System.out.println("Valor Convertido: " + valorActual +" " +prefijoDestino);
            System.out.println("*****************************************");
        }
}
