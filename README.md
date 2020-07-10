####Pull MariaDB image and run on docker
Pull MariaDB docker image
```
$ docker pull mariadb
```
Run 
```
$ docker run --name sr-mariadb -e MYSQL_ROOT_PASSWORD=abc123 -d mariadb
```
```
$ docker run -it --network some-network --rm mariadb mysql -hsome-mariadb -uexample-SRUser -p
```
