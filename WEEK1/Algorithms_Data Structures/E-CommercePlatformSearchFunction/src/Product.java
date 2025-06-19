public class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId(){
        return productId;
    }

    public String getCategory(){
        return category;
    }

    public String getProductName(){
        return productName;
    }

    public String toString(){
        return "Id:"+Integer.toString(this.productId)+" Product Name :"+ this.productName+" Category :"+this.category;
    }

}
