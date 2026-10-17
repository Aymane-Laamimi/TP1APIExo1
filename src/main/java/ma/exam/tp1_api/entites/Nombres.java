package ma.exam.tp1_api.entites;

public class Nombres {
    private double nombre1;
    private double nombre2;

    public Nombres() {
    }

    public Nombres(double nombre1, double nombre2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }

    public double getNombre1() {
        return nombre1;
    }

    public void setNombre1(double nombre1) {
        this.nombre1 = nombre1;
    }

    public double getNombre2() {
        return nombre2;
    }

    public void setNombre2(double nombre2) {
        this.nombre2 = nombre2;
    }
}
