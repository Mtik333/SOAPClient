#
# TABLE STRUCTURE FOR: RSI_MOVIE
#

DROP TABLE IF EXISTS RSI_MOVIE;

CREATE TABLE RSI_MOVIE (
  ID int(11) NOT NULL,
  TITLE varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  DIRECTOR varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  ACTORS varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  DESCRIPTION varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  DURATION int(11) DEFAULT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO RSI_MOVIE (ID, TITLE, DIRECTOR, ACTORS, DESCRIPTION, DURATION) VALUES (1, 'Quam omnis vitae sit consequatur maxime ex velit.', 'Austen Marquardt', 'Tenetur officia natus totam quo nobis itaque veritatis. Ratione veniam aspernatur sed non ullam quod.', 'Consequatur eius ullam cum quaerat. Aliquid eum ipsam vel perferendis.', 84);
INSERT INTO RSI_MOVIE (ID, TITLE, DIRECTOR, ACTORS, DESCRIPTION, DURATION) VALUES (2, 'Earum deserunt quia corporis soluta.', 'Guido Denesik', 'Numquam quibusdam id ut aut velit et est. Sed corporis aut sed ut. Voluptatem neque suscipit odio nihil ullam quia.', 'Ut sunt voluptas et velit ipsum. Officiis temporibus libero architecto magnam.', 30);
INSERT INTO RSI_MOVIE (ID, TITLE, DIRECTOR, ACTORS, DESCRIPTION, DURATION) VALUES (3, 'Repellendus facere quidem vel quisquam dolorem consequatur.', 'Prof. Janice Mosciski II', 'Optio non dicta eligendi odio vitae consequatur facilis. Eligendi consequuntur et fugit repellat et accusamus mollitia.', 'Atque facere modi veritatis saepe occaecati qui. Veniam dolore nesciunt rerum tempora modi a.', 91);
INSERT INTO RSI_MOVIE (ID, TITLE, DIRECTOR, ACTORS, DESCRIPTION, DURATION) VALUES (4, 'Est porro et facilis libero necessitatibus voluptatem.', 'Golda Walter', 'Dolorum illum sit tempora porro. Ipsa sapiente similique ex sint ullam et qui mollitia.', 'Recusandae ex facere voluptatibus saepe quaerat. Deleniti similique consequuntur veniam eos magni consequuntur.', 110);
INSERT INTO RSI_MOVIE (ID, TITLE, DIRECTOR, ACTORS, DESCRIPTION, DURATION) VALUES (5, 'Magnam similique numquam et.', 'Micheal Nitzsche', 'Magnam tempore dolores porro optio sed voluptas. Expedita voluptatem non unde illum itaque odio.', 'Dolor non aut et voluptatem quae quisquam omnis. Provident quam adipisci aspernatur beatae et enim similique.', 44);


