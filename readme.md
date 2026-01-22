docker-compose up --build

C:\Users\ru.shah>

docker exec -it postgres_db psql -U postgres -d demo_db
psql (15.15 (Debian 15.15-1.pgdg13+1))
Type "help" for help.

demo_db=# SELECT * FROM employees;



# azure dev ops

Create a Variable Group in Azure DevOps

Go to Pipelines → Library → + Variable Group
Name it: db-secrets
Add variables (mark password as secret):
SPRING_DATASOURCE_URL=jdbc:postgresql://postgres:5432/demo_db
SPRING_DATASOURCE_USERNAME=postgres
SPRING_DATASOURCE_PASSWORD=yourpassword
# Option 2: secrets are injected as above in azure-pipeline