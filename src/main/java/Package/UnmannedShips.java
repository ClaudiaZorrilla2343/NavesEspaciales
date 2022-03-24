package Package;
//NOtripuladas
public abstract class UnmannedShips extends Spaceships{

    private String celestialBodyStudied;//cuerpo celeste estudiado

    public UnmannedShips(String name, String motor, String mission) {
        super(name, motor, mission);
        this.celestialBodyStudied = celestialBodyStudied;
    }

    @Override
    public void target() {
        System.out.println("Abastecer, limpiar y regular periódicamente la elevación \n"
                            +"de la Estación Espacial Internacional.\n"
                            + "Estudiar otros cuerpos celestes");
    }

    public void SaturnoAndLunas(){
        
    }


}
