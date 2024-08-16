FROM postgres:latest

ADD dump.sql /docker-entrypoint-initdb.d/

ENV POSTGRES_USER=kodilla
ENV POSTGRES_PASSWORD=kodilla
ENV POSTGRES_DB=kodilla-quotes

EXPOSE 5432