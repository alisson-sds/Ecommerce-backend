CREATE TABLE carts (
    id UUID PRIMARY KEY,
    user_id UUID,
    FOREIGN KEY (user_id) REFERENCES "user"(id)
);

CREATE TABLE cart_items (
    id UUID PRIMARY KEY,
    cart_id UUID,
    product_id UUID,
    quantity INT NOT NULL,
    FOREIGN KEY (cart_id) REFERENCES carts(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);