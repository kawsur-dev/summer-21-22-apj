package app;

public enum DAY {

    SUNDAY(1, "JAVA, C#"),
    MONDAY(2, "Database, Python"),
    TUESDAY(3, "JAVA, C#"),
    WEDNESDAY(4, "Database, Python, CAD"),
    THURSDAY(5, "None"),
    FRIDAY(6, "None"),
    SATURDAY(7, "None");
    private int id;
    private String label;
    DAY(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }
}
