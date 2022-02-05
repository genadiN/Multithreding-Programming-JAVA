package lib;

public enum ProductCategory {
    A("Drugs"),
    B("Cosmetics"),
    C("Devices"),
    D("Other"),
    E("Undefined");

    String description;

    ProductCategory(String description) {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    @Override
    public String toString() {
        return name() +
                "[" + description +
                ']';
    }
}
