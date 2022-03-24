package Package;

public abstract class Spaceships {
    private String motor;
    private String mission;
    private String name;

    public Spaceships(String name, String motor, String mission) {
        this.name = name;
        this.mission = mission;
        this.motor = motor;
    }

    public abstract void target();

    public String getMotor() {
        return motor;
    }

    public String getMission() {
        return mission;
    }

    public String getName() {
        return name;
    }
}
