
mvn clean install

docker build -t person:0.0.1 .

kubectl delete pod person

kubectl run person --image=person:0.0.1 --image-pull-policy=Never