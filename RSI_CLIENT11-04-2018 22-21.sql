#
# TABLE STRUCTURE FOR: RSI_CLIENT
#

DROP TABLE IF EXISTS RSI_CLIENT;

CREATE TABLE RSI_CLIENT (
  ID int(11) NOT NULL,
  USERNAME varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  PASSWORD varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO RSI_CLIENT (USERNAME, PASSWORD) VALUES ('davis.florida', 'qui');
INSERT INTO RSI_CLIENT (USERNAME, PASSWORD) VALUES ('daisy71', 'laboriosam');
INSERT INTO RSI_CLIENT (USERNAME, PASSWORD) VALUES ('eferry', 'iste');
INSERT INTO RSI_CLIENT (USERNAME, PASSWORD) VALUES ('bhudson', 'iure');
INSERT INTO RSI_CLIENT (USERNAME, PASSWORD) VALUES ('geoffrey74', 'voluptate');


