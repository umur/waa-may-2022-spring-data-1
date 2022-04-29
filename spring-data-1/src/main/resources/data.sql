-- USERS

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (1, 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (2, 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (3, 'muhyidean@miu.edu', 'muhyidean', 'al-tarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (4, 'levi@miu.edu', 'keith', 'levi', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (5, 'okalu@miu.edu', 'obinna', 'kalu', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (6, 'tina@miu.edu', 'tina', 'xing', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123


-- CATEGORIES
INSERT INTO catagories(id, name) VALUES (1, 'phone');
    INSERT INTO catagories(id, name) VALUES (2, 'tab');
INSERT INTO catagories(id, name) VALUES (3, 'pen');

-- PRODUCTS

INSERT INTO products (id, name, price, rating, category_id)
VALUES (1, 'iPhone', 1200, 1, 1);

INSERT INTO products (id, name, price, rating, category_id)
VALUES (2, 'iPad', 900, 2, 2);

INSERT INTO products (id, name, price,rating, category_id)
VALUES (3, 'Pen', 500, 5,3);

INSERT INTO products (id, name, price, rating, category_id)
VALUES (4, 'Samsung', 1300, 1,1);

INSERT INTO products (id, name, price, rating, category_id)
VALUES (5, 'MI', 400, 1,1);

-- REVIEWS

INSERT INTO reviews (id,comment, product_id)
VALUES (1,'awesome phone',1);

INSERT INTO reviews (id,comment, product_id)
VALUES (2,'amazing phone',1);

INSERT INTO reviews (id,comment, product_id)
VALUES (3,'awesome tablet',2);


