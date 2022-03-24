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
    private int puissance;
    private boolean takenOff;


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
        this.puissance = 0;
        this.takenOff = false;
    }

    public Double exhaustSpeed(){
        double massPlanet = 5.98 * Math.pow(10,24);
        double radioPlanet = 6.38 * Math.pow(10, 24);
        double gravitación = 6.67 * Math.pow(10, -11);
        double veloEscape = (2*gravitación*massPlanet)/radioPlanet;
        veloEscape = Math.sqrt(veloEscape);
        return veloEscape;
    }
    //despegue
    public void takeoff(){
        this.puissance += puissance;
    }

    public boolean condition(){
        if (puissance == 0){
            this.takenOff = false;
        }else{
            this.takenOff = true;
        }
        return takenOff;
    }

    public Boolean takenOff(){
        return takenOff;
    }

    public String getName() {
        return name;
    }

    public String getPropellant() {
        return propellant;
    }

    public int getWeight() {
        return weight;
    }

    public int getPush() {
        return push;
    }

    public boolean isSelfPropelled() {
        return selfPropelled;
    }

    public String getUsefulLoad() {
        return usefulLoad;
    }

    public int getFuel() {
        return fuel;
    }

    public String getMotor() {
        return motor;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public int getPuissance() {
        return puissance;
    }

    public boolean isTakenOff() {
        return takenOff;
    }

    public void setTakenOff(boolean takenOff) {
        this.takenOff = takenOff;
    }


}
