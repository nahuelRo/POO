// Clase - Declarada igual que el nombre del archivo.
public class Automovil implements Comparable<Automovil>{

    // Atributos -> CamelCase
    // Principio de encapsulamiento
    /*
     *  No se pueden acceder, ni modificar los datos de forma directa
     *  Se necesitan unos metodos especiales llamados Getters y Setters
     */
    private final int id;
    private String fabricante;
    private String modelo;
    // Valor por defecto
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    private TipoAutomovil tipo;

    // Atributos Estaticos
    /*
     * Estos atributos no le pertenecen a la instancia sino a la clase en si
     * Es un atributo generico ya que se comparte para todas las instancias de la clase.
     */
    private static Color colorPatente = Color.NARANJA;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    /*
     * Final significa que es constante
     * Se le asigna un valor por defecto
     * y no se puede cambiar en la ejecución
     */
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris oscuro";


    // Constructores
    /*
     * Estos se llaman cuando se instancia un objeto,
     * Te permite inicializar atributos de la clase.
     * por defecto tiene un constructor sin parametros.
     */
    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    // Sobrecarga de constructores y polimorfismo
    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null) {
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda) {
        if (indiceRuedas < this.ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    // Metodos -> CamelCase
    // Existen dos tipos de metodos
    // Funciones -> Devuelve algo y Procedimientos -> No devuelve nada
    public String verDetalle() {
        /* Utilizar this es opcional.
           This hace referencia el objeto dentro de la clase.
           Si yo no pongo this puede haber un error ya que es posible
           Que me tome una variable del contexto que este.
        */

        String detalle = "id = " + this.id +
                "\nfabricante = " + this.fabricante +
                "\nmodelo = " + this.modelo;

        if (this.getTipo() != null) {
            detalle += "\ntipo = " + this.getTipo().getDescripcion();
        }

        detalle += "\ncolor = " + this.color +
                "\npatenteColor = " + Automovil.colorPatente;

        if (this.motor != null) {
            detalle += "\ncilindrada = " + this.motor.getCilindrada();
        }

        if (conductor == null) {
            detalle += "\nConductor subaru: " + this.getConductor();
        }

        if (this.getRuedas() != null) {
            detalle += "\nRuedas del automovil:";
            for (Rueda r : this.getRuedas()) {
                detalle += "\n" + r.getFabricante() + ", " + r.getAro() + ", " + r.getAncho();
            }
        }

        return detalle;
    }

    // Funciones con argumentos
    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    // Funcion basica
    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    // Utilizando funciones de la clase
    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    // Principio de polimorfismo
    /*
     * Diferente forma de hacer lo mismo
     * Implementamos dos metodos que devuelven exactamente lo mismo
     * pero implementados de diferentes formas
     */
    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (porcentajeBencina * this.getEstanque().getCapacidad());
    }

    // Sobrecarga de metodos
    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / ((porcentajeBencina / 100f) * this.getEstanque().getCapacidad());
    }

    // Metodo static
    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
        return km / ((porcentajeBencina / 100f) * Automovil.capacidadEstanqueEstatico);
    }


    // Este metodo se hereda de Object
    /*
     * Object es la clase principal en Java
     * Este metodo lo heredamos y le cambiamos la implementación
     * Para que compare si ambos objetos tienen el mismo fabricante y modelo.
     */
    @Override
    public boolean equals(Object obj) {
        // Si son el misma referencia no hace falta comparar!
        if (this == obj) {
            return true;
        }
        // El objeto que pasamos tiene que ser igual
        // Si no error de casteo
        if (!(obj instanceof Automovil)) {
            return false;
        }

        // Comparamos un objeto del mismo tipo
        Automovil a = (Automovil) obj;

        // Hay que validar que los atributos sea diferente de null
        return (this.fabricante != null &&
                this.modelo != null &&
                this.fabricante.equals(a.getFabricante()) &&
                this.modelo.equals(a.getModelo()));
    }


    // este metodo hereda de la clase Object
    /*
     * Este metodo por defecto nos muestra el nombre de la clase y la referencia
     * Podemos modificar este metodo para que nos muestre los valores de los atributos
     */
    @Override
    public String toString() {
        return this.id + " " + this.fabricante + " " + this.modelo;
    }

    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}
