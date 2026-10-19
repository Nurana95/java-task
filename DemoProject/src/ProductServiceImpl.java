import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private List<Product> elements = new ArrayList<>();

    // Konstruktor (ilkin məlumatların əlavə olunması)
    public ProductServiceImpl() {
        elements.add(new Product.Builder().id(1L).name("Laptop").price(1500.0).build());
        elements.add(new Product.Builder().id(2L).name("Smartfon").price(800.0).build());
    }

    @Override
    public List<Product> getAll() {
        return elements;
    }

    @Override
    public Product getById(Long id) {
        for (Product product : elements) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Boolean deleteById(Long id) {
        Product product = getById(id);
        if (product != null) {
            elements.remove(product);
            return true;
        }
        return false;
    }
}