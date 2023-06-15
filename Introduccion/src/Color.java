// ENUM
/*
 * Es una coleccion de valores constantes
 */
public enum Color {
    // Le pasamos valores al constructor
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    NARANJA("Naranja");

    // Asignamos una constante
    private final String color;

    // Este constructor se llama dentro del mismo enum
    Color(String color) {
        this.color = color;
    }

    // Nos permite mostrar el valor de la constante
    public String getColor() {
        return color;
    }

    // nos permite mostrar el valor de la constante
    @Override
    public String toString() {
        return this.color;
    }
}
