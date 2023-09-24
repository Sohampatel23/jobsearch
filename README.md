
# JobSearch Application 

A spring boot application to integrated with H2 Database for CRUD operations and maintain data in local database.


## Data Flow

1. Job Search Main Application File
2. Job Search Controller class which is Autowired
3. Job Search Model class with entities;
4. Job Search Service class extending Repo class
5. Job Search Repo class extend Crud Repository 
## Data Structure

List structure to show data

## Summary

Whole Project is built in spring boot application with IDE of Intellij Idea. Which contains controller class configured with model class to provide data source and Service which has actual logic to API's which can be tested on localhost of your own PC.
And also Repo class extends CrudRepository for to simplify database operations
