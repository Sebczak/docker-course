FROM postgres:latest

COPY dump.sql /docker-entrypoint-initdb.d/dump.sql

ENV POSTGRES_USER=kodilla
ENV POSTGRES_PASSWORD=kodilla
ENV POSTGRES_DB=kodilla-quotes