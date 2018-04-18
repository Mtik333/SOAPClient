#
# TABLE STRUCTURE FOR: RSI_RESERVATION
#

DROP TABLE IF EXISTS RSI_RESERVATION;

CREATE TABLE RSI_RESERVATION (
  ID int(11) NOT NULL,
  SCREENING_ID int(11) NOT NULL,
  CLIENT_RESERVER_ID int(11) NOT NULL,
  RESERVATION_CONTACT varchar(1024) COLLATE utf8_unicode_ci DEFAULT NULL,
  RESERVED tinyint(1) DEFAULT NULL,
  ACTIVE tinyint(1) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY SCREENING_ID (SCREENING_ID),
  KEY CLIENT_RESERVER_ID (CLIENT_RESERVER_ID),
  CONSTRAINT RSI_RESERVATION_ibfk_1 FOREIGN KEY (SCREENING_ID) REFERENCES RSI_SCREENING (ID),
  CONSTRAINT RSI_RESERVATION_ibfk_2 FOREIGN KEY (CLIENT_RESERVER_ID) REFERENCES RSI_CLIENT (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO RSI_RESERVATION (ID, SCREENING_ID, CLIENT_RESERVER_ID, RESERVATION_CONTACT, RESERVED, ACTIVE) VALUES (1, 6, 2, 'pkovacek@champlinstiedemann.com',true,true);
INSERT INTO RSI_RESERVATION (ID, SCREENING_ID, CLIENT_RESERVER_ID, RESERVATION_CONTACT, RESERVED, ACTIVE) VALUES (2, 1, 4, 'mike06@stokes.com',false,false);
INSERT INTO RSI_RESERVATION (ID, SCREENING_ID, CLIENT_RESERVER_ID, RESERVATION_CONTACT, RESERVED, ACTIVE) VALUES (3, 1, 1, 'lesch.jodie@hotmail.com',true,false);
INSERT INTO RSI_RESERVATION (ID, SCREENING_ID, CLIENT_RESERVER_ID, RESERVATION_CONTACT, RESERVED, ACTIVE) VALUES (4, 9, 3, 'anitzsche@pfannerstillbechtelar.info',true,false);
INSERT INTO RSI_RESERVATION (ID, SCREENING_ID, CLIENT_RESERVER_ID, RESERVATION_CONTACT, RESERVED, ACTIVE) VALUES (5, 5, 2, 'rachael09@gmail.com',true,true);
INSERT INTO RSI_RESERVATION (ID, SCREENING_ID, CLIENT_RESERVER_ID, RESERVATION_CONTACT, RESERVED, ACTIVE) VALUES (6, 8, 2, 'yasmin.bode@hirthe.com',false,false);
INSERT INTO RSI_RESERVATION (ID, SCREENING_ID, CLIENT_RESERVER_ID, RESERVATION_CONTACT, RESERVED, ACTIVE) VALUES (7, 8, 3, 'rkuhlman@yahoo.com',true,false);
INSERT INTO RSI_RESERVATION (ID, SCREENING_ID, CLIENT_RESERVER_ID, RESERVATION_CONTACT, RESERVED, ACTIVE) VALUES (8, 10, 5, 'ybarton@gmail.com',true,false);
INSERT INTO RSI_RESERVATION (ID, SCREENING_ID, CLIENT_RESERVER_ID, RESERVATION_CONTACT, RESERVED, ACTIVE) VALUES (9, 8, 1, 'dejah64@gmail.com',false,true);
INSERT INTO RSI_RESERVATION (ID, SCREENING_ID, CLIENT_RESERVER_ID, RESERVATION_CONTACT, RESERVED, ACTIVE) VALUES (10, 9, 4, 'fgutmann@hotmail.com',true,true);


