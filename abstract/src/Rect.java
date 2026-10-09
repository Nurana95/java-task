class Rect extends Shape {
    double w, h;
    Rect(double w, double h) { this.w = w; this.h = h; }

    @Override
    double area() {
        return w * h;
    }
}