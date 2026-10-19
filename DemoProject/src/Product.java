import java.util.Objects;

public class Product {
    private Long id;
    private String name;
    private Double price;

    // Private konstruktor (Builder üçün)
    private Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
    }

    // Getters and Setters (Enkapsulyasiya)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product { id = " + id + ", name = '" + name + "', price = " + price + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    // Builder Pattern
    public static class Builder {
        private Long id;
        private String name;
        private Double price;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(Double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}