package Package;

import java.util.HashMap;

public class UnmannedShips extends Spaceships{

    private String celestialBodyToStudy;//cuerpo celeste para estudiar
    private String informationSatellites;

    public UnmannedShips(String name, String motor, String mission) {
        super(name, motor, mission);
        this.informationSatellites = informationSatellites;
    }

    @Override
    public void target() {
        System.out.println("Su objetivo es abastecer, limpiar y regular periódicamente la elevación \n"
                            +"de la Estación Espacial Internacional.\n"
                            + "Estudiar otros cuerpos celestes");
    }

    public void setInformationSatellites(String planet) {

        System.out.println("Para estudiar este planeta debe conocer la cifra de satelites allí");

        HashMap<String, Integer> satellites = new HashMap<>();
        satellites.put("Jupiter", 67);
        satellites.put("Mercurio", 0);
        satellites.put("Venus", 0);
        satellites.put("Tierra", 1);
        satellites.put("Saturno", 67);
        satellites.put("Urano", 27);
        satellites.put("Neptuno", 13);
        satellites.put("Marte", 2);

        informationSatellites = String.valueOf(satellites.get(planet));
        this.informationSatellites = informationSatellites;
        System.out.println("Este planeta tiene el siguiente número de satelites: "+informationSatellites);

    }

    public String getInformation() {
        return informationSatellites;
    }

}
