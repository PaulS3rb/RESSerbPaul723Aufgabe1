package org.example.logs;

public class Log {
    private int Id;
    private String Held;
    private String Antagonist;
    private Konfrontation Konfrontationstyp;
    private String Ort;
    private String Datum;
    private double GlobalerEinfluss;

    public Log(int id, String held, String antagonist,
               Konfrontation konfrontationstyp, String ort, String datum, double globalerEinfluss) {
        Id = id;
        Held = held;
        Antagonist = antagonist;
        Konfrontationstyp = konfrontationstyp;
        Ort = ort;
        Datum = datum;
        GlobalerEinfluss = globalerEinfluss;
    }

    @Override
    public String toString() {
        return "Log{" +
                "Id=" + Id +
                ", Held='" + Held + '\'' +
                ", Antagonist='" + Antagonist + '\'' +
                ", Konfrontationstyp='" + Konfrontationstyp + '\'' +
                ", Ort='" + Ort + '\'' +
                ", Datum='" + Datum + '\'' +
                ", GlobalerEinfluss=" + GlobalerEinfluss +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getHeld() {
        return Held;
    }

    public void setHeld(String held) {
        Held = held;
    }

    public String getAntagonist() {
        return Antagonist;
    }

    public void setAntagonist(String antagonist) {
        Antagonist = antagonist;
    }

    public Konfrontation getKonfrontationstyp() {
        return Konfrontationstyp;
    }

    public void setKonfrontationstyp(Konfrontation konfrontationstyp) {
        Konfrontationstyp = konfrontationstyp;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public String getDatum() {
        return Datum;
    }

    public void setDatum(String datum) {
        Datum = datum;
    }

    public double getGlobalerEinfluss() {
        return GlobalerEinfluss;
    }

    public void setGlobalerEinfluss(double globalerEinfluss) {
        GlobalerEinfluss = globalerEinfluss;
    }
}
