package td7;

public enum Classe {
    CLASS40, IMOCA, RHUMMONO, MULTI50, ULTIM, RHUMMULTI,OCEAN_FIFTY;

    @Override
    public String toString() {
        switch (this) {
            case CLASS40 : return "Class40";
            case IMOCA : return "IMOCA";
            case RHUMMONO : return "RHUMMONO";
            case ULTIM : return "ULTIM";
            case RHUMMULTI : return "RHUMMULTI";
            case OCEAN_FIFTY : return "OCEAN_FIFTY";

        }return "indefinit";
    }
}
