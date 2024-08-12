FROM golang:alpine

WORKDIR /usr/src/app

COPY . .

RUN go mod init gohelloworld

EXPOSE 8080

CMD ["go", "run", "main.go"]