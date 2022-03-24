package Package;
//tripuladas
public class mannedSnows extends Spaceships {

    private int passengers;//pasajeros

    public mannedSnows(String name, String motor, String mission, int passengers) {
        super(name, motor, mission);
    }

    @Override
    public void target() {
        System.out.println("Mandar seres humanos para tareas de reparación, matenimiento e investigación");
    }

    
}
