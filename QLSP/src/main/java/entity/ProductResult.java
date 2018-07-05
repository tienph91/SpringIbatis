package entity;

public class ProductResult {

    private int productId;

    private String productName;

    private int productDetailId;

    private int quantity;

    private String color;

    private String address;

    public ProductResult() {
        super();
    }

    public ProductResult(int productId, String productName, int productDetailId, int quantity, String color,
            String address) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productDetailId = productDetailId;
        this.quantity = quantity;
        this.color = color;
        this.address = address;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(int productDetailId) {
        this.productDetailId = productDetailId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ProductResult [productId=" + productId + ", productName=" + productName + ", productDetailId="
                + productDetailId + ", quantity=" + quantity + ", color=" + color + ", address=" + address + "]";
    }

}
