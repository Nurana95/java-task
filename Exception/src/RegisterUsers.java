public class RegisterUsers {

    static void registerUser(String name, int age) throws InvalidAge1Exception {
        if (age < 18 || age > 120) {
            throw new InvalidAge1Exception("Yaş yanlışdır: " + age +
                    " (18 ilə 120 arası olmalıdır)");
        }
        System.out.println(name + " uğurla qeydiyyatdan keçdi. Yaş: " + age);
    }}