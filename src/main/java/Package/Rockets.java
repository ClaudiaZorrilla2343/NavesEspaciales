package Package;

public class Rockets {
    private String name;
    private String propellant;
    //prepolente
    private int weight;
    //peso
    private int push;
    //empuje
    private boolean selfPropelled;
    //autopropulsado
    private String usefulLoad;
    //carga util


    public Rockets(String name, String propellant, int weight, int push) {
        this.name = name;
        this.propellant = propellant;
        this.weight = weight;
        this.push = push;
        this.selfPropelled = selfPropelled;
        this.usefulLoad = usefulLoad;
    }
}
