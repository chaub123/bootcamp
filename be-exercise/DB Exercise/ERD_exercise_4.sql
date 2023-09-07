CREATE DATABASE exercise4;
use exercise4;

CREATE TABLE players (
	player_id integer not null unique,
    group_id integer not null
);

DROP TABLE matches;
CREATE TABLE matches (
	match_id integer not null unique,
    first_player integer not null,
    second_player integer not null,
    first_score integer not null,
    second_score integer not null
);

INSERT INTO players values (20, 2);
INSERT INTO players values (30, 1);
INSERT INTO players values (40, 3);
INSERT INTO players values (45, 1);
INSERT INTO players values (50, 2);
INSERT INTO players values (65, 1);

select * from players;

INSERT INTO matches values (1, 30, 45, 10, 12);
INSERT INTO matches values (2, 20, 50, 5, 5);
INSERT INTO matches values (13, 65, 45, 10, 10);
INSERT INTO matches values (5, 30, 65, 3, 15);
INSERT INTO matches values (42, 45, 65, 8, 4);

select * from matches;


WITH total_score as (
SELECT p.player_id, 
SUM(CASE
		WHEN p.player_id = m.first_player THEN first_score
        WHEN p.player_id = m.second_player THEN second_score
        ELSE 0
	END) as total_score
FROM players p, matches m
GROUP BY p.player_id),

player_score as (
SELECT p.group_id, p.player_id, 
RANK() OVER (PARTITION BY p.group_id ORDER BY t.total_score DESC, p.player_id ASC) AS player_rank
FROM players p LEFT JOIN total_score t 
on p.player_id = t.player_id
ORDER BY p.group_id)

SELECT group_id, player_id
FROM player_score
WHERE player_rank = 1
ORDER BY group_id;








