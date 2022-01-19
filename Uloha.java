CREATE TABLE databazovky.Users (
     Id int NOT NULL auto_increment PRIMARY KEY, -- long pretoze int max 2,147,483,647
     email VARCHAR(40) NOT NULL,
     phone VARCHAR(20),
     first_name VARCHAR(255),
     last_name VARCHAR(255),
     created_ts timestamp DEFAULT CURRENT_TIMESTAMP,
     update_ts timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


INSERT INTO databazovky.Users (email, phone, first_name, last_name) VALUES('Davidpepek@gmail.com', '+421910382666','David','Pepek');
INSERT INTO databazovky.Users (email, phone, first_name, last_name) VALUES('janoGrecky@gmail.com', '+421914555222','Jano','Grecky');
INSERT INTO databazovky.Users (email, phone, first_name, last_name) VALUES('matejmravec4@gmail.com', '+421910382333','Matej','Mravec');

UPDATE databazovky.Users SET phone = '+421911222331' WHERE Id = 3;
SELECT * from databazovky.Users;


CREATE TABLE databazovky.Addresses (
  user_id int, -- Both a primary and foreign key
  street varchar(30) NOT NULL,
  city varchar(30) NOT NULL,
  zipcode varchar(30) NOT NULL,
  PRIMARY KEY (user_id),
  FOREIGN KEY (user_id)
      REFERENCES databazovky.Users (id)
      ON DELETE CASCADE
);
INSERT INTO databazovky.Addresses
         (user_id, street, city, zipcode)
  VALUES (1, '1 Market Street', 'San Francisco', '94106'),
         (2, '2 Elm Street', 'San Francisco', '94108'),
         (3, '3 Main Street', 'Boston', '02109');
         
select u.id, u.email, u.last_name, a.city, a.zipcode from databazovky.Users as u
left join databazovky.Addresses as a on u.id=a.user_id;

-- error duplicate
INSERT INTO databazovky.Addresses (user_id, street, city, zipcode)
  VALUES (1, '2 Park Road', 'San Francisco', '43404');

-- id user with 4 dosent exist
INSERT INTO databazovky.Addresses (user_id, street, city, zipcode)
  VALUES (4, '2 Park Road', 'San Francisco', '43404');
SELECT * from databazovky.Addresses;

CREATE TABLE databazovky.Products (
  id int NOT NULL auto_increment,
  name varchar(100) NOT NULL,
  description varchar(100) NOT NULL,
  created_ts timestamp DEFAULT CURRENT_TIMESTAMP,
  update_ts timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  serial_number char(12),
  PRIMARY KEY (id),
  UNIQUE (serial_number)
);
SELECT * from databazovky.Products;

CREATE TABLE databazovky.Reviews (
  id int NOT NULL auto_increment,
  product_id integer NOT NULL,
  reviewer_name varchar(255),
  content varchar(255),
  rating integer,
  created_ts timestamp DEFAULT CURRENT_TIMESTAMP,
  update_ts timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  FOREIGN KEY (product_id)
      REFERENCES databazovky.Products(id)
      ON DELETE CASCADE
);


INSERT INTO databazovky.Products
  (id, name, description, serial_number)
  VALUES
      (1, 'KRESLO ', 'Fabric armchair with headrest',SUBSTRING_INDEX(uuid(),'-',1)),
      (2, 'HARBOR LAIDBACK', 'Recliner leather armchair with headrest',SUBSTRING_INDEX(uuid(),'-',1)),
      (3, 'Porada', 'Fabric armchair with armrests',SUBSTRING_INDEX(uuid(),'-',1));

select * from databazovky.Products;

INSERT INTO databazovky.Reviews
  (id, product_id, reviewer_name, content, rating)
  VALUES
      (1, 1, 'Martin Mravec', 'My first review', 4),
      (2, 2, 'Mirka Canecka', 'My second review', 5),
      (3, 2, 'Matej Mravec', 'Another review', 1);

select * from databazovky.Products as p left join databazovky.Reviews as r on p.id=r.product_id where p.id=2;

CREATE TABLE databazovky.Orders (
  id serial,
  user_id int NOT NULL,
  product_id int NOT NULL,
  created_ts timestamp DEFAULT CURRENT_TIMESTAMP,
  update_ts timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES databazovky.Users(id)
                        ON DELETE CASCADE,
  FOREIGN KEY (product_id) REFERENCES databazovky.Products(id)
                        ON DELETE CASCADE
);

INSERT INTO databazovky.Orders
  (id, user_id, product_id)
  VALUES
    (1, 1, 1),
    (2, 1, 2),
    (3, 2, 2),
    (4, 3, 3);



SELECT * FROM databazovky.Addresses WHERE zipcode LIKE "941%";
SELECT * from databazovky.Reviews ORDER BY rating asc;
SELECT MIN(rating) AS LargestPrice FROM databazovky.Reviews;
SELECT MAX(rating) AS LargestPrice FROM databazovky.Reviews ORDER BY rating desc;

SELECT * FROM databazovky.Addresses WHERE city LIKE 'S%';
SELECT * FROM databazovky.Addresses WHERE zipcode < 94108 AND zipcode >94106 OR zipcode=94108;
SELECT * FROM databazovky.Users WHERE Id in (SELECT user_id FROM databazovky.Addresses where street NOT LIKE "%1%");

SELECT COUNT(user_id), city FROM databazovky.Addresses GROUP BY city;
SELECT COUNT(user_id), city FROM databazovky.Addresses GROUP BY city HAVING COUNT(user_id) > 1 ORDER BY COUNT(user_id) DESC;
SELECT MIN(zipcode) AS LargestZipcode FROM databazovky.Addresses GROUP BY zipcode;

SELECT * FROM databazovky.Users WHERE Id in (SELECT user_id FROM databazovky.Addresses WHERE city LIKE "San Francisco");
SELECT * FROM databazovky.Users WHERE Id in (SELECT user_id FROM databazovky.Addresses where street LIKE "1%");
