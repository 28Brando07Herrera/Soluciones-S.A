package proyecto.patrones.dominio;

public class Equipo 
{
    private String marca;
    private String modelo;
    private String serie;
    private int cantidadMemoriaRam;
    private int cantidadDiscoDuro;
    private String color;
    private String estadoBase;
    private String estadoPantalla;
    private boolean cargador;


    public Equipo(String marca, String modelo, String serie, int cantidadMemoriaRam, int cantidadDiscoDuro,
            String color, String estadoBase, String estadoPantalla, boolean cargador) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.cantidadMemoriaRam = cantidadMemoriaRam;
        this.cantidadDiscoDuro = cantidadDiscoDuro;
        this.color = color;
        this.estadoBase = estadoBase;
        this.estadoPantalla = estadoPantalla;
        this.cargador = cargador;
    }

    

}
