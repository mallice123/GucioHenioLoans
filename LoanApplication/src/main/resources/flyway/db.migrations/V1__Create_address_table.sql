CREATE TABLE address (
                        id SERIAL primary key,
                        email VARCHAR(255) NOT NULL,
                        postCode VARCHAR(20) NOT NULL,
                        town VARCHAR(50) NOT NULL,
                        streetName VARCHAR(255) NOT NULL
);