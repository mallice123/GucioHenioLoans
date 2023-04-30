CREATE TABLE occupation (
                        id SERIAL PRIMARY KEY,
                        employee_name VARCHAR(255),
                        start_date DATE,
                        end_date DATE,
                        gross_salary DECIMAL(10, 2),
                        net_salary DECIMAL(10, 2)
);