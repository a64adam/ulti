package dto;

public enum Region {
    NA("na"),
    EUW("euw"),
    EUNE("eune"),
    KR("kr"),
    BR("br"),
    LAS("las"),
    LAN("lan"),
    OCE("oce"),
    TR("tr"),
    RU("ru"),
    GLOBAL("global");

    private String region;

    Region(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return region;
    }
}
