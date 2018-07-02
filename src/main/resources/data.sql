-- noinspection SqlNoDataSourceInspectionForFile

-- noinspection SqlDialectInspectionForFile

insert into Hotel (id,name_hotel ) values (10, 'Max');
insert into Hotel (id,name_hotel ) values (20, 'Mal');

insert into Login (id,email, name, password,surname) values (11, 'max@gmail.com', 'Max','abc', 'Kolonko');
insert into Login (id,email, name, password,surname) values (21, 'bernard@gmail.com', 'Benek','cba', 'Trump');

insert into Client(id, name, surname, login_id) values (100, 'Max', 'Kolonko', 11);
insert into Client(id, name, surname, login_id) values (200, 'Benek', 'Trump', 21);

insert into Room(id, number_of_beds, type_of_room, price, hotel_id) values (1000, 1, 'one bed', 200, 10);
insert into Room(id, number_of_beds, type_of_room, price, hotel_id) values (2000, 2, 'two beds', 300, 10);
insert into Room(id, number_of_beds, type_of_room, price, hotel_id) values (3000, 3, 'three beds',400, 10);
insert into Room(id, number_of_beds, type_of_room, price, hotel_id) values (4000, 4, 'four beds', 450, 10);
insert into Room(id, number_of_beds, type_of_room, price, hotel_id) values (5000, 5, 'five beds', 550, 10);

insert into Payment (id,status_payment, client_id ) values (120, false, 100);
insert into Payment (id,status_payment, client_id ) values (130, false, 200);

insert into Resevation (id, end_time, start_time, client_id, payment_id) values (150, '2018-07-11', '2018-06-30',100,120);
insert into Resevation (id, end_time, start_time, client_id, payment_id) values (160, '2018-07-15', '2018-07-01',200,130);

insert into Menu (id, meal, price) values (500, 'breakfast', 20);
insert into Menu (id, meal, price) values (510, 'lunch-fish', 50);
insert into Menu (id, meal, price) values (520, 'lunch-pizza', 40);
insert into Menu (id, meal, price) values (530, 'lunch-steak', 60);
insert into Menu (id, meal, price) values (540, 'mexican-dinner', 80);
insert into Menu (id, meal, price) values (550, 'italian-dinner', 85);
insert into Menu (id, meal, price) values (560, 'sushi-dinner', 100);
insert into Menu (id, meal, price) values (570, 'european-dinner', 75);

insert into Workers (id, name, surname) values (900, 'Walt', 'Modest-Amaro');
insert into Workers (id, name, surname) values (910, 'Michel', 'Moro');


insert into Additional_services (id, spa, gym, swimmingpool, payment_id, resevation_id) values (170, 50, 20, 30, 120, 150);
insert into Additional_services (id, spa, gym, swimmingpool, payment_id, resevation_id) values (180, 50, 20, 30, 130, 160);

insert into RESEVATION_ADDITIONAL_SERVICES (resevation_id, additional_services_id) values (150, 170);
insert into RESEVATION_ADDITIONAL_SERVICES (resevation_id, additional_services_id) values (160, 180);

insert into MENU_WORKERS_LIST (menu_list_id, workers_list_id) values (500, 900);
insert into MENU_WORKERS_LIST (menu_list_id, workers_list_id) values (510, 900);
insert into MENU_WORKERS_LIST (menu_list_id, workers_list_id) values (520, 900);
insert into MENU_WORKERS_LIST (menu_list_id, workers_list_id) values (540, 900);
insert into MENU_WORKERS_LIST (menu_list_id, workers_list_id) values (570, 900);
insert into MENU_WORKERS_LIST (menu_list_id, workers_list_id) values (500, 910);
insert into MENU_WORKERS_LIST (menu_list_id, workers_list_id) values (520, 910);
insert into MENU_WORKERS_LIST (menu_list_id, workers_list_id) values (530, 910);
insert into MENU_WORKERS_LIST (menu_list_id, workers_list_id) values (550, 910);
insert into MENU_WORKERS_LIST (menu_list_id, workers_list_id) values (560, 910);