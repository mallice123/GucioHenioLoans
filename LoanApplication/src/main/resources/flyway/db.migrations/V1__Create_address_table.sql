CREATE TABLE address (
                        id SERIAL primary key,
                        postCode VARCHAR(20) NOT NULL,
                        town VARCHAR(50) NOT NULL,
                        streetName VARCHAR(255) NOT NULL
);