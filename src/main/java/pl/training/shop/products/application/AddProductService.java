package pl.training.shop.products.application;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pl.training.shop.products.domain.Product;
import pl.training.shop.products.ports.input.AddProductUseCase;
import pl.training.shop.products.ports.output.persistence.ProductUpdates;

import javax.inject.Inject;

@RequiredArgsConstructor
@NoArgsConstructor
public class AddProductService implements AddProductUseCase {

    @Inject
    @NonNull
    private ProductUpdates productUpdates;

    @Override
    public Product add(Product product) {
        return productUpdates.save(new Product(product.getId(), product.getDescription(), true));
    }

}
