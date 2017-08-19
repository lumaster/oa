-- Create USER
CREATE TABLE user
(
    user_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    user_password VARCHAR(255) NOT NULL,
    user_first_name VARCHAR(255),
	user_last_name VARCHAR(255),
	user_birth_date DATETIME,
	user_gender VARCHAR(20),
	user_tel_number_1 VARCHAR(20),
	user_tel_number_2 VARCHAR(20),
	user_mobile_number VARCHAR(20),
	user_email VARCHAR(255),
	user_skype VARCHAR(255),
	user_wechat VARCHAR(255),
	user_qq VARCHAR(255),
	user_line VARCHAR(255),
    user_role VARCHAR(50) NOT NULL,
    user_picture BLOB,
    create_user VARCHAR(255) NOT NULL,
    create_date DATETIME DEFAULT NOW() NOT NULL COMMENT 'NOW()',
    update_date DATETIME,
    update_user VARCHAR(255)
);
CREATE UNIQUE INDEX USER_user_id_uindex ON USER (user_id);
CREATE UNIQUE INDEX USER_user_username_uindex ON USER (username);
ALTER TABLE USER COMMENT = 'This table will contain all user in system';

-- Create GEN_VALUE_MAPPING
CREATE TABLE value_mapping
(
    value_mapping_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    value_mapping_group_name VARCHAR(255),
    value_mapping_name VARCHAR(255),
    value_mapping_code VARCHAR(255)
);
CREATE UNIQUE INDEX value_mapping_value_mapping_id_uindex ON value_mapping (value_mapping_id);

-- Create USER_PERMISSION
create table user_permission
(
	user_permission_id int auto_increment
		primary key,
	user_id int null,
	value_mapping_group_name varchar(255) null,
	value_mapping_name varchar(255) null,
	user_permission_value varchar(255) null,
	constraint user_permission_user_permission_id_uindex
		unique (user_permission_id),
	constraint user_permission_user_user_id_fk
		foreign key (user_id) references user (user_id)
)
;

create index user_permission_user_user_id_fk
	on user_permission (user_id)
;

-- Create CUSTOMER

CREATE TABLE customer
(
    customer_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    customer_first_name VARCHAR(255),
    customer_last_name VARCHAR(255),
    customer_hn VARCHAR(255),
    customer_passport_number VARCHAR(255),
    customer_birth_date DATETIME,
    customer_type VARCHAR(255),
    customer_accommodation VARCHAR(255),
    customer_delivery_service VARCHAR(255),
    customer_picture BLOB,
    create_user VARCHAR(255),
    create_date DATETIME DEFAULT now(),
    update_user VARCHAR(255),
    update_date DATETIME
);
CREATE UNIQUE INDEX customer_customer_id_uindex ON customer (customer_id);

-- Create CUSTOMER_HISTORY_RECORDS_1
CREATE TABLE CUSTOMER_HISTORY_1
(
    CUSTOMER_HISTORY_1_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    customer_id INT,
    customer_history_1_line VARCHAR(10),
    customer_history_1_date DATETIME,
    customer_history_1_rt VARCHAR(255),
    customer_history_1_lt VARCHAR(255),
    customer_history_1_fsh VARCHAR(255),
    customer_history_1_amh VARCHAR(255),
    customer_history_1_lh VARCHAR(255),
    customer_history_1_e2 VARCHAR(255),
    customer_history_1_remark VARCHAR(255),
    customer_history_1_period VARCHAR(255),
    customer_history_1_amount DECIMAL(10,2),
    CONSTRAINT CUSTOMER_HISTORY_1_customer_customer_id_fk FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
);
CREATE UNIQUE INDEX CUSTOMER_HISTORY_1_CUSTOMER_HISTORY_1_ID_uindex ON CUSTOMER_HISTORY_1 (CUSTOMER_HISTORY_1_ID);

-- Create CUSTOMER_HISTORY_RECORDS_2
CREATE TABLE CUSTOMER_HISTORY_2
(
    CUSTOMER_HISTORY_2_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    customer_id INT,
    customer_history_2_line VARCHAR(10),
    customer_history_2_date DATETIME,
    customer_history_2_opu VARCHAR(255),
    customer_history_2_icsi VARCHAR(255),
    customer_history_2_fsh VARCHAR(255),
    customer_history_2_desc VARCHAR(255),
    CONSTRAINT CUSTOMER_HISTORY_2_customer_customer_id_fk FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
);
CREATE UNIQUE INDEX CUSTOMER_HISTORY_2_CUSTOMER_HISTORY_2_ID_uindex ON CUSTOMER_HISTORY_2 (CUSTOMER_HISTORY_2_ID);

-- Create CUSTOMER_HISTORY_RECORDS_3
CREATE TABLE CUSTOMER_HISTORY_3
(
    CUSTOMER_HISTORY_3_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    customer_id INT,
	customer_history_3_line VARCHAR(10),
    customer_history_3_day_1 VARCHAR(255),
    customer_history_3_day_3 VARCHAR(255),
    customer_history_3_day_5 VARCHAR(255),
    customer_history_3_day_6 VARCHAR(255),
    customer_history_3_status VARCHAR(255),
    customer_history_3_grade VARCHAR(255),
	customer_history_3_des VARCHAR(255),
    CONSTRAINT CUSTOMER_HISTORY_3_customer_customer_id_fk FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
);
CREATE UNIQUE INDEX CUSTOMER_HISTORY_3_CUSTOMER_HISTORY_3_ID_uindex ON CUSTOMER_HISTORY_3 (CUSTOMER_HISTORY_3_ID);

-- Create CUSTOMER_HISTORY_RECORDS_4
CREATE TABLE CUSTOMER_HISTORY_4
(
    CUSTOMER_HISTORY_4_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    customer_id INT,
	customer_history_4_line VARCHAR(10),
	customer_history_4_date DATETIME,
    customer_history_4_emorgo_number VARCHAR(255),
    customer_history_4_hcg VARCHAR(255),
    customer_history_4_lh VARCHAR(255),
	customer_history_4_status VARCHAR(255),
    CONSTRAINT CUSTOMER_HISTORY_4_customer_customer_id_fk FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
);
CREATE UNIQUE INDEX CUSTOMER_HISTORY_4_CUSTOMER_HISTORY_4_ID_uindex ON CUSTOMER_HISTORY_4 (CUSTOMER_HISTORY_4_ID);

-- Create CUSTOMER_HISTORY_RECORDS_5
CREATE TABLE CUSTOMER_HISTORY_5
(
    CUSTOMER_HISTORY_5_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    customer_id INT,
	customer_history_5_line VARCHAR(10),
	customer_history_5_date DATETIME,
    customer_history_5_desc VARCHAR(255),
    customer_history_5_amount DECIMAL(10,2),
    CONSTRAINT CUSTOMER_HISTORY_5_customer_customer_id_fk FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
);
CREATE UNIQUE INDEX CUSTOMER_HISTORY_5_CUSTOMER_HISTORY_5_ID_uindex ON CUSTOMER_HISTORY_5 (CUSTOMER_HISTORY_5_ID);

-- Insert Customer
-- INSERT INTO "CUSTOMER" (customer_id, first_name, last_name, hn, passport_number, birth_date, type, accommodation, delivery_service, picture create_user, create_date, update_user, update_date)  VALUES(1, 'Winiton','Chanapolchai','PP0001', TO_DATE('1992-09-29', 'yyyy-mm-dd'), 'TYPE_01', 'Bangkok', 'SERVICE_01','1_PROFILE_PICTURE','Winiton', NOW(), NULL, NULL);
-- INSERT INTO "CUSTOMER" (customer_id, first_name, last_name, hn, passport_number, birth_date, type, accommodation, delivery_service, picture create_user, create_date, update_user, update_date)  VALUES(2, 'Krisadapron','Hintao','PP2222', TO_DATE('1989-07-28', 'yyyy-mm-dd'), 'TYPE_22', 'Bangkok', 'SERVICE_01','2_PROFILE_PICTURE','Winiton', NOW(), NULL, NULL);

-- Insert History Records
