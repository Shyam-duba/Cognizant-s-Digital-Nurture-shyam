import java.util.*;
public class Search {

    public Product linearSearch(List<Product> products, int productId){
        Product result = null;
        for (Product product : products){
            if (product.getProductId() == productId){
                result = product;
            }
        }

        return result;
    }
    public Product BinarySearch(List<Product> products, int productId) {
        int start = 0, end = products.size()-1;

        Product result = null;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (products.get(mid).getProductId() == productId){
                result = products.get(mid);
                break;
            }
            else if (products.get(mid).getProductId()  > productId) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        return result;
    }
}
