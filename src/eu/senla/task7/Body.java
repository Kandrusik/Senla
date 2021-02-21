package eu.senla.task7;

public enum Body {
    ALUMINIUM ("Алюминий"),
    CARBON ("Карбон"),
    COPPER ("Медь");

    private String bodyName;
    Body(String bodyName) {
        this.bodyName = bodyName;
    }

    public String getBodyName() {
        return bodyName;
    }
}