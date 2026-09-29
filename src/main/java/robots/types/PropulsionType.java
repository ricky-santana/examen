package robots.types;

public enum PropulsionType {
    HELICE("hélice"),
    CHORRO("chorro");

    private final String description;

    PropulsionType(String description) {
        this.description = description;
    }

    public String toString(){
        return this.description;
    }
}
