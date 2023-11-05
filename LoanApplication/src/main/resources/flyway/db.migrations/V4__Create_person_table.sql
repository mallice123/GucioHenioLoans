CREATE TABLE person (
                        id SERIAL PRIMARY KEY,
                        first_name VARCHAR(255) NOT NULL,
                        last_name VARCHAR(255) NOT NULL,
                        birth_date DATE,
                        phone_number VARCHAR(20),
                        email VARCHAR(255) NOT NULL,
                        password VARCHAR(255),
                        identification_document_id BIGINT,
                        occupation_id BIGINT,
                        address_id BIGINT,
                        CONSTRAINT fk_person_address FOREIGN KEY (address_id) REFERENCES address(id),
                        CONSTRAINT fk_person_identification_document_id FOREIGN KEY (identification_document_id) REFERENCES identification_document(id),
                        CONSTRAINT fk_person_occupation FOREIGN KEY (occupation_id) REFERENCES occupation(id)
);