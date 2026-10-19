import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(Long id);
    Boolean deleteById(Long id);
}