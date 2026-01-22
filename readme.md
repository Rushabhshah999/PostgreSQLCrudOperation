docker-compose up --build

C:\Users\ru.shah>

docker exec -it postgres_db psql -U postgres -d demo_db
psql (15.15 (Debian 15.15-1.pgdg13+1))
Type "help" for help.

demo_db=# SELECT * FROM employees;