public enum TipoAutomovil {
    SEDAN("Sedan", "Auto normal", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 5),
    HATCHBACK("Hatchback", "Auto compacto", 5),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 3),
    SUV("Suv", "Todo terreno deportivo", 5);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;


    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
