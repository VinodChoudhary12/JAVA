class Area {
    int l, b;

    public Area(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int calculateArea() {
        return this.l * this.b;
    }
}

class Volume extends Area {
    int h;

    public Volume(int l, int b, int h) {
        super(l, b);
        this.h = h;
    }

    public int calculateVolume() {
        return calculateArea() * h;
    }
}

class Density extends Volume {
    private double mass;

    public Density(int l, int b, int h, double mass) {
        super(l, b, h);
        this.mass = mass;
    }

    public double calculateDensity() {
        return calculateVolume() / mass;
    }
}

class Test {
    public static void main(String[] args) {
        Density ob = new Density(2, 2, 2, 98.5);

        System.out.println("The Area Is: " + ob.calculateArea());
        System.out.println("The Volume Is: " + ob.calculateVolume());
        System.out.println("The Density Is: " + ob.calculateDensity());
    }
}
