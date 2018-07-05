package mapper;

import java.util.List;

import entity.ProductDetail;
import entity.ProductResult;

public interface ProductMapper {

    List<ProductResult> getListProduct();

    ProductDetail getProductDetailByProductId(int productId);

    List<ProductResult> getMaxQuantityProduct();

    List<ProductResult> searchProductByName(String productName);
}
