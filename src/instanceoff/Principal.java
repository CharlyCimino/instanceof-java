package instanceoff;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {

        Concesionaria c = new Concesionaria();
        Auto a = new Auto(true, "MarcaFalsa", "XYZ", "ABC123");

        c.agregarVehiculo(a);
        c.agregarVehiculo(new Moto(20, "OtraMarca", "XHT", "BCD234"));
    }

}
