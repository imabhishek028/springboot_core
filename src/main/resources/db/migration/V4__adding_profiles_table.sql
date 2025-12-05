CREATE TABLE profiles (
        id BIGINT PRIMARY KEY,
        bio VARCHAR(500),
        phone_number VARCHAR(20),
        date_of_birth DATE,
        loyalty_points INT UNSIGNED DEFAULT 0,
        FOREIGN KEY (id) REFERENCES users(id)
);
