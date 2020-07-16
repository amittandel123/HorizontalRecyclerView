package tandel.amit.horizontalrecyclerview;

/*
 * Created by Amit Tandel on 4/5/2018.
 */

public class Grocery {
    public int productImage;
    public String productName;

    public Grocery(String productName, int productImage) {
        this.productImage = productImage;
        this.productName = productName;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
