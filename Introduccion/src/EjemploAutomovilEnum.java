// Clase
public class EjemploAutomovilEnum {
    // Metodo especial de java para ejecutar
    public static void main(String[] args) {

        // Instanciando un objeto.
        // Pasando parametros al constructor de la clase.
        Automovil subaru = new Automovil("Subaru", "Impreza");

        // Asignando valores - Asignando un estado
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);


        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);


        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil pequeñó de dos puertas y tipicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK -> System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automovil mediano");
            case STATION_WAGON -> System.out.println("Es un automovil más grande, con maleta grande...");
        }

        // Los enums son iterables
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos) {
            System.out.println(ta + " => " + ta.name() + ", " +
            ta.getNombre() + ", " +
            ta.getDescripcion() + ", " +
            ta.getNumeroPuertas());
        }
    }
}
