# 

## Model
www.msaez.io/#/storming/maas2

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- Reservation Management
- Customer Service and Support
- Transportation Services Integration
- Data Analytics and Feedback


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- Reservation Management
```
 http :8088/reservations Reservation ID="Reservation ID" Passenger name="Passenger name" Assistance type="Assistance type" 
```
- Customer Service and Support
```
 http :8088/feedbacks Feedback ID="Feedback ID" Feedback text="Feedback text" 
 http :8088/assistanceRequests Request ID="Request ID" Passenger name="Passenger name" Requester name="Requester name" Request status="Request status" 
```
- Transportation Services Integration
```
 http :8088/passengerLocations Passenger name="Passenger name" Current location="Current location" Location last update="Location last update" 
 http :8088/driverNotifications Notification ID="Notification ID" Driver name="Driver name" Notification type="Notification type" 
```
- Data Analytics and Feedback
```
 http :8088/assistanceStatistics Statistic ID="Statistic ID" Assistance type="Assistance type" Number of requests="Number of requests" Average response time="Average response time" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

