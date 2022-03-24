package Package;


//tripuladas
public class mannedSnows extends Spaceships {

    private int passengers;//pasajeros
    private String porposeShip;//finalidadNave

    public mannedSnows(String name, String motor, String mission, int passengers) {
        super(name, motor, mission);
    }

    @Override
    public void target() {
        System.out.println("Su objetivo era mandar seres humanos para tareas de reparación, matenimiento e investigación");
    }


    public void porposeShipp() {

        String porpuse [] = {"Mision Lunar","Experimentación y estudio del comportamiento humano en condiciones ingrávidas " +
                "y en el exterior de la cápsula", "Mantenimiento de satélites, probar acoplamientos con otras naves y equipos electrónicos"};

        for(int i = 0; i < porpuse.length; i++){
            System.out.println("La misión número "+i+" es una "+porpuse[i]);
            this.porposeShip = porpuse[i];
        }
    }

}
