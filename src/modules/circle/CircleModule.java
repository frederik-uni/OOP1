package modules.circle;

public class CircleModule {
    private double radius;
    private double durchmesser;
    private double umfang;
    private double volume;

    public CircleModule() {
        this.radius = 0;
        this.durchmesser = 0;
        this.umfang = 0;
        this.volume = 0;
    }

    public static CircleModule fromRadius(double radius) {
        CircleModule circle = new CircleModule();
        circle.radius = radius;
        circle.durchmesser = radius * 2;
        circle.calcUmfang();
        circle.calcMass();
        return circle;
    }
    public static CircleModule fromDurchmesser(double durchmesser) {
        CircleModule circle = new CircleModule();
        circle.radius = durchmesser / 2;
        circle.durchmesser = durchmesser;
        circle.calcUmfang();
        circle.calcMass();
        return circle;
    }

    public static CircleModule fromUmfang(double u) {
        CircleModule circle = new CircleModule();
        circle.durchmesser = u / Math.PI;
        circle.radius = circle.durchmesser / 2;
        circle.calcUmfang();
        circle.calcMass();
        return circle;
    }
    public static CircleModule fromVolume(double v) {
        CircleModule circle = new CircleModule();
        circle.radius = Math.sqrt(v / Math.PI);
        circle.durchmesser = circle.radius * 2;
        circle.calcUmfang();
        circle.calcMass();
        return circle;
    }
    private void calcUmfang() {
        this.umfang = this.durchmesser * Math.PI;
    }
    private void calcMass() {
        this.volume = this.radius * this.radius  * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public double getUmfang() {
        return umfang;
    }

    public double getVolume() {
        return volume;
    }
}
