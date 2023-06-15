import java.util.Arrays;

// Clase
public class EjemploAutomovilArreglo {
    // Metodo especial de java para ejecutar
    public static void main(String[] args) {

        Rueda[] ruedasSub = new Rueda[5];

        Persona conductorSubaru = new Persona("Luci", "Dominguez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);


        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,
                new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);

        Persona bea = new Persona("Bea", "Gonzales");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil susuki = new Automovil("Suzuki", "Vitara", Color.GRIS,
                new Motor(1.6, TipoMotor.BENCINA), new Estanque(50));
        susuki.setConductor(lalo);
        susuki.setColor(Color.AMARILLO);
        susuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Perez"));


        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = susuki;
        autos[4] = audi;

        Arrays.sort(autos);

        for (Automovil auto : autos) {
            System.out.println(auto);
        }
    }
}
