public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();

        // 1. Bütün məhsulları ekrana çıxaraq
        System.out.println("--- Bütün Məhsullar ---");
        for (Product p : productService.getAll()) {
            System.out.println(p);
        }

        // 2. ID-yə görə məhsul axtaraq
        System.out.println("\n--- ID-yə görə axtarış (ID: 1) ---");
        Product found = productService.getById(1L);
        System.out.println(found);

        // 3. Məhsulu silək
        System.out.println("\n--- Silmə əməliyyatı (ID: 2) ---");
        boolean deleted = productService.deleteById(2L);
        System.out.println("Silindimi? " + deleted);

        // 4. Son siyahıya baxaq
        System.out.println("\n--- Silindikdən sonra qalan məhsullar ---");
        for (Product p : productService.getAll()) {
            System.out.println(p);
        }
    }
}