/*-Insert inot users value-*/

insert into user (user_id,active,email,first_name,last_name, role,user_name) values ('1','F','abc@hcl.com','sweta','shaw','admin','swetashaw');
insert into user (user_id,active,email,first_name,last_name, role,user_name) values ('2','T','anup@hcl.com','anup','kmar','admin','anup');
insert into user (user_id,active,email,first_name,last_name, role,user_name) values ('3','T','swetashaw@hcl.com','sweta','shaw','user','sweta');
/*-Insert inot Leave Request value-*/



insert into stock(id,stock_name,price_per_unit,quantity,is_active) values ('1','Reliance','365','2000','true');
insert into stock(id,stock_name,price_per_unit,quantity,is_active) values ('2','Birla Sun','365','2000','true');
insert into stock(id,stock_name,price_per_unit,quantity,is_active) values ('3','Aditya Group','365','2000','true');

/*-Insert into userstocks-*/
insert into user_stocks(id,user_id,stock_id,total_quantity,stock_name,total_price,purchased_on) values ('1','1','1','10','AdityaBirla','10000',CURRENT_TIMESTAMP);
insert into user_stocks(id,user_id,stock_id,total_quantity,stock_name,total_price,purchased_on) values ('2','2','2','10','AdityaBirla','10000',CURRENT_TIMESTAMP);
insert into user_stocks(id,user_id,stock_id,total_quantity,stock_name,total_price,purchased_on) values ('3','3','3','10','AdityaBirla','10000',CURRENT_TIMESTAMP);


