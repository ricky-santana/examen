package robots.types;

public enum TractionType {
    ORUGA("oruga"),
    RUEDAS("ruedas");

    private final String description;

    TractionType(String description) {
        this.description = description;
    }

    public String toString(){
        return this.description;
    }
}
