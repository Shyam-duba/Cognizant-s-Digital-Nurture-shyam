import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inp = sc.nextInt();

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "wireless earphones", "electrical"));
        products.add(new Product(2, "oppo a96 smart phone", "mobiles"));
        products.add(new Product(3, "Asus Tuf laptop", "Laptops"));
        products.add(new Product(4, "Plastic Chair", "accessories"));
        products.add(new Product(5, "non-stick pan", "Home"));
        products.add(new Product(6, "classmate white notebook", "accessories"));
        products.add(new Product(7, "puma black shoes", "wearables"));
        products.add(new Product(8, "one-pieace printed t-shirt", "wearables"));


        Search search = new Search();

        Product searchProductLinearSearch = search.linearSearch(products, inp);


        if (searchProductLinearSearch != null) {
            System.out.println("Found the required search product through Linear Search :" + searchProductLinearSearch.toString());
        }
        else {
            System.out.println("No Search results found :)");
        }


        Collections.sort(products,(a,b)->(a.getProductId() - b.getProductId()));

        Product searchProductBinarySearch = search.BinarySearch(products, inp);

        if (searchProductBinarySearch != null) {
            System.out.println("Found the required search product through Binary Search :"+searchProductBinarySearch.toString());
        }
        else {
            System.out.println("unable to find the required product :)");
        }





    }
}