package entity;

public class ProductDetail {

    private int productDetailId;

    private int quantity;

    private String color;

    private String address;

    private String productId;

    public ProductDetail() {
        super();
    }

    public ProductDetail(int quantity, String color, String address, String productId) {
        super();
        this.quantity = quantity;
        this.color = color;
        this.address = address;
        this.productId = productId;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "ProductDetail [productDetailId=" + productDetailId + ", quantity=" + quantity + ", color=" + color
                + ", address=" + address + ", productId=" + productId + "]";
    }

}
