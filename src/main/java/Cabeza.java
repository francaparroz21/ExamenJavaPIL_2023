public class Cabeza {
    private String colorPelo;
    private String colorPiel;
    private String colorOjos;

    public Cabeza(String colorPelo, String colorPiel, String colorOjos) {
        this.colorPelo = colorPelo;
        this.colorPiel = colorPiel;
        this.colorOjos = colorOjos;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
}
