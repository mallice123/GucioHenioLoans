CREATE TABLE identification_document (
                        id SERIAL PRIMARY KEY,
                        document_id BIGINT,
                        personal_id BIGINT,
                        date_of_creation DATE,
                        expiry_date_of_document DATE
);