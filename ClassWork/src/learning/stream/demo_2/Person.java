package learning.stream.demo_2;

public class Person {

    private String voorNaam;
    private String achterNaam;
    private String geslacht;
    private int leefTijd;
    private float gewicht;
    private int lengte;

    public Person(String voorNaam, String achterNaam, String geslacht, int leefTijd, float gewicht, int lengte) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.geslacht = geslacht;
        this.leefTijd = leefTijd;
        this.gewicht = gewicht;
        this.lengte = lengte;
    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public int getLeefTijd() {
        return leefTijd;
    }

    public void setLeefTijd(int leefTijd) {
        this.leefTijd = leefTijd;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    @Override
    public String toString() {
        return "Person{" +
                "voorNaam='" + voorNaam + '\'' +
                ", achterNaam='" + achterNaam + '\'' +
                ", geslacht='" + geslacht + '\'' +
                ", leefTijd=" + leefTijd +
                ", gewicht=" + gewicht +
                ", lengte=" + lengte +
                '}';
    }
}
