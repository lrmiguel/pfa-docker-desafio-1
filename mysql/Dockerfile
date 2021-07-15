FROM mysql as builder

ENV MYSQL_ROOT_PASSWORD=my-secret-pw

COPY ./scripts /docker-entrypoint-initdb.d

CMD ["/usr/local/bin/docker-entrypoint.sh", "mysqld", "--datadir", "/initialized-db"]

#FROM mysql:5.7.24

#COPY --from=builder /initialized-db /var/lib/mysql

#CMD ["tail", "-f", "/dev/null"]