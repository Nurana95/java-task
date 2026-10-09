class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }

    @Override
    double area() {
        return Math.PI * r * r;
    }
}
