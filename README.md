# Shopping-Portal-System-Using-SprinBoot-JWT-Authentication

eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbkBnbWFpbC5jb20iLCJpc3MiOiJ0ZXN0X2lzc3VlciIsIlJPTEUiOiJhZG1pbiIsIlNVQkpFQ1RfSUQiOjEsImlhdCI6MTY4NjkzOTcxMSwiZXhwIjoxNjg3NTQ0NTExfQ.dp5zwTQ4kC4Zib7-Vw7OLxqbLCJsBuQ28DZPoQuKWUqiXIIswfBYqGfBdP9v2vYEaov14cOGNR93rS_RftcFfA
Postman link of your working live API collection

Create database shoppingPortal;
USE shoppingPortal;
SHOW TABLES;
select * from role;
DESC ROLE;
INSERT INTO ROLE (USER_ROLE) VALUES("admin"),("guest");
select * from role;
select * from auth_user;
select * from product;
select * from order_details;


For registering an  Admin into system
POST        http://localhost:8080/user/register
{
    "name":"admin123",
    "emailAddress":"admin@gmail.com",
    "password":"admin123",
    "address":"mumbai"
}

Credentials For logging an  Admin into system
POST        http://localhost:8080/user/login
{
    //admin login
    "emailAddress":"abhi@gmail.com",
    "password":"abhi1234"
}


FOR ADDING PRODUCT INTO SYSTEM
POST        Providing JWT token for authorization
Authorization      Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbkBnbWFpbC5jb20iLCJpc3MiOiJ0ZXN0X2lzc3VlciIsIlJPTEUiOiJhZG1pbiIsIlNVQkpFQ1RfSUQiOjEsImlhdCI6MTY4NjY0OTgwMCwiZXhwIjoxNjg3MjU0NjAwfQ.J0axDPn3MDQ96ObIC4uFV32LprD0XdGmrTR4WdAO33cGCgxPPo_IwfZFC1uonCG7DbIYrweDC8I6OMikhm-vIQ
POST        http://localhost:8080/admin/addProduct
{
    "name":"mobile",
    "brand":"ASUS-A3",
    "stock":65,
    "price":26640
}

Disabling the product if in case the production of any product stopped in market 
Providing JWT token for authorization
Authorization      Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbkBnbWFpbC5jb20iLCJpc3MiOiJ0ZXN0X2lzc3VlciIsIlJPTEUiOiJhZG1pbiIsIlNVQkpFQ1RfSUQiOjEsImlhdCI6MTY4NjY0OTgwMCwiZXhwIjoxNjg3MjU0NjAwfQ.J0axDPn3MDQ96ObIC4uFV32LprD0XdGmrTR4WdAO33cGCgxPPo_IwfZFC1uonCG7DbIYrweDC8I6OMikhm-vIQ
(cancelProduct/1     cancelProduct followed by their product id) 
PUT        Http://localhost:8080/cancelProduct/1

Getting all product by their name as like filtering by name
GET        http://localhost:8080/productsByName/mobile

For registering an  user into system
POST        http://localhost:8080/user/register
{
    "name":"Abhishek",
    "emailAddress":"abhi@gmail.com",
    "password":"abhishek123",
    "address":"mumbai"
}

Credentials For loging an  User into system
POST        http://localhost:8080/user/login
{
    //user login
     "emailAddress":"abhi@gmail.com",
    "password":"abhishek123"
}

For placing an order from user end
Authorization     Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYmhpQGdtYWlsLmNvbSIsImlzcyI6InRlc3RfaXNzdWVyIiwiUk9MRSI6Imd1ZXN0IiwiU1VCSkVDVF9JRCI6MiwiaWF0IjoxNjg2NjUwNzE5LCJleHAiOjE2ODcyNTU1MTl9.y_nOd_ubhRotOsH5C6lstPB1CgH-S3sABFwEET2RTZ95-zu63B6MpazLdt0p2AxS5nU52wJ8ixI5cm5dooY7MA
(placeOrder/2/2   placing an order product id followed by user id)
http://localhost:8080/api/placeOrder/2/2

PUT      For canceling an order followed by order id 
http://localhost:8080/api/cancelOrder/1

