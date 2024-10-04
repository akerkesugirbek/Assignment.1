package task4;

public class Prototype {
    public static void main(String[] args) {
        try {
            Product originalProduct = new Product("Laptop", 999.99);
            System.out.println("Original: " + originalProduct);

            Product clonedProduct = originalProduct.clone();
            System.out.println("Cloned: " + clonedProduct);

            clonedProduct = new Product("Laptop Pro", 1299.99);
            System.out.println("Modified Cloned: " + clonedProduct);

            System.out.println("Original After Modification: " + originalProduct);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}