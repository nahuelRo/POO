import java.util.Date;

// Clase
public class EjemploAutomovil {
    // Metodo especial de java para ejecutar
    public static void main(String[] args) {

        // Instanciando un objeto.
        // Pasando parametros al constructor de la clase.
        Automovil subaru = new Automovil("Subaru", "Impreza");

        // Asignando valores - Asignando un estado
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));

        Automovil auto = new Automovil();
        Date fecha = new Date();

        System.out.println("son iguales? " + (nissan == nissan2)); // Compara las referencias
        System.out.println("son iguales? " + nissan.equals(nissan2)); // Compara el valor

        // Mostrando los atributos en consola
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(auto.equals(fecha));

        // Representa el objeto en una salida String
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        // Principio de encapsulamiento (Abstracción)
        /*
        * Esta clase no sabe como esta implementada
        * No le importa como esta implementada
        * Pero si le importa que puede hacer y con que.
        */
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.6F));
        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(300, 60));
        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300, 60));
    }
}
