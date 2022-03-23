package Package;

public abstract class Spaceships {
    private String motor;
    private String mission;
    private String name;


    protected Spaceships(String name, String motor, String mission) {
        this.name = name;
        this.motor = motor;
        this.mission = mission;
    }
}
