CREATE TABLE person (
                        id SERIAL PRIMARY KEY,
                        first_name VARCHAR(255) NOT NULL,
                        last_name VARCHAR(255) NOT NULL,
                        birth_date DATE,
                        phone_number VARCHAR(20),
                        identificationDocument_id BIGINT,
                        occupation_id BIGINT,
                        address_id BIGINT,
                        CONSTRAINT fk_person_address FOREIGN KEY (address_id) REFERENCES address(id),
                        CONSTRAINT fk_person_occupation FOREIGN KEY (occupation_id) REFERENCES occupation(id),
                        CONSTRAINT fk_person_identificationDocument_id FOREIGN KEY (identificationDocument_id) REFERENCES identificationDocument(id)
);