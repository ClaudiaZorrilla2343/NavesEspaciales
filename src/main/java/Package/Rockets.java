package Package;

public class Rockets {
    private String name;
    private String propellant;//prepolente
    private int weight;//peso
    private int push;//empuje
    private boolean selfPropelled;//autopropulsado
    private String usefulLoad;//carga util
    private int fuel; //combustible
    private String motor;
    private int numMotor;


    public Rockets(String usefulLoad) {
        this.name = "Saturno V";
        this.propellant = "combustible líquido";
        this.weight = 3817;//ton
        this.push = 3864000;//kg
        this.selfPropelled = true;
        this.usefulLoad = usefulLoad;
        this.fuel = 3500;//ton
        this.motor ="J2";
        this.numMotor = 6;
    }

    public Double exhaustSpeed(){
        double massPlanet = 5.98 * Math.pow(10,24);
        double radioPlanet = 6.38 * Math.pow(10, 24);
        double gravitación = 6.67 * Math.pow(10, -11);
        double veloEscape = (2*gravitación*massPlanet)/radioPlanet;
        veloEscape = Math.sqrt(veloEscape);
        return veloEscape;
    }
}
