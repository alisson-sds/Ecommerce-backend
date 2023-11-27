CREATE TABLE "user"(
    id UUID PRIMARY KEY,
    login VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    "name" VARCHAR(255) NOT NULL,
    phone_number VARCHAR(11) NOT NULL
);

CREATE TABLE orders (
    id UUID PRIMARY KEY,
    user_id UUID,
    date DATE NOT NULL,
    total DOUBLE PRECISION NOT NULL,
    status VARCHAR(255) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES "user"(id)
);

CREATE TABLE orders_itens (
    id UUID PRIMARY KEY,
    order_id UUID,
    product_id UUID,
    quantity INT NOT NULL,
    unit_price DOUBLE PRECISION NOT NULL,
    subtotal DOUBLE PRECISION NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);