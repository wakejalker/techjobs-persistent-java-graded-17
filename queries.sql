--Part 1
DESCRIBE job;
--Part 2
SELECT name FROM employer WHERE location="St. Louis City";
--Part 3
DROP TABLE job;
--Part 4
SELECT * FROM skill
                  LEFT JOIN job_skills ON skill.id = job_skills.skills_id
ORDER BY name ASC;