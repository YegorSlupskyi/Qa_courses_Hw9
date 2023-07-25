package src;

public enum Size {
    EXTRA_SMALL("XS", 82, 84),
    SMALL("S", 86, 84),
    MEDIUM("M", 90, 84),
    LARGE("L", 94, 84),
    EXTRA_LARGE("XL", 100, 84);

    private final String shortName;

    private final int width;
    private final int length;

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }

    public static String staticGetFullSizeName(Size size) {
        switch (size.shortName) {
            case "XS" -> {
                return "Extra Small";
            }
            case "S" -> {
                return "Small";
            }
            case "M" -> {
                return "Medium";
            }
            case "L" -> {
                return "Large";
            }
            case "XL" -> {
                return "Extra Large";
            }
        }
        return null;
    }

    public String getFullSizeName() {
        switch (shortName) {
            case "XS" -> {
                return "Extra Small";
            }
            case "S" -> {
                return "Small";
            }
            case "M" -> {
                return "Medium";
            }
            case "L" -> {
                return "Large";
            }
            case "XL" -> {
                return "Extra Large";
            }
        }
        return null;
    }

    public String getShortName() {
        return shortName;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
