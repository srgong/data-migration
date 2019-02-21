
# Table of Contents
1. [Introduction](README.md#introduction)
2. [Approach](README.md#approach)
3. [To Run](README.md#torun)


# Introduction

This project addresses this [prompt](https://github.com/Samariya57/coding_challenges/blob/master/data_migration.md), where we build a pipeline for Business Analysts to query a Postresql database for the company's historical Orders. During the ETL, information on Users is also extracted from these historical Orders, as well as any additional metrics Business Analysts would find useful.

# Approach

Given JSON files, the objective is to query this data via Postresql. 
This pipeline deserializes json files into Plain Old Java Objects (POJOs) and deserializes these objects into Postgresql. 

1) To automate schema translation, POJO skeletons are created using [JSON Schema to POJO](http://www.jsonschema2pojo.org/)
2) We deserialize JSON using Jackson's[ObjectMapper](https://fasterxml.github.io/jackson-databind/javadoc/2.7/com/fasterxml/jackson/databind/ObjectMapper.html), a popular library used to de/serialize or map Java objects. 
3) After establishing a PsqlClient, we create tables for Orders and Users (a Connection is reused for every interaction with the database).

Further work includes querying the database using SQL scripts to extract a dedicated table for Users, and additional backend work to create Metrics around these datasets.

# To Run

1. `cd out/artifacts/data_migration_jar/`
2. `java -jar data-migration.jar <json_dir> and <psql_host>`

 
