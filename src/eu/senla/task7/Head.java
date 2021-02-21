package eu.senla.task7;

public enum Head {
    GOLD ("Золото"),
    TITAN ("Титан"),
    PLATINUM ("Платина");

    private String headName;

    Head(String headName) {
        this.headName = headName;
    }

    public String getHeadName() {
        return headName;
    }
}
