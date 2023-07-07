
mvn clean install

eval $(minikube docker-env)             

minikube docker-env | Invoke-Expression 

docker build -t person:0.0.1 .

kubectl delete pod person

kubectl run person --image=person:0.0.1 --image-pull-policy=Never

# Run on first time only -------------------------------------------------------------------------

#kubectl delete service person  

#kubectl expose pod person --type=NodePort --port=8080 --target-port=8080 --name=person

# End block first time-------------------------------------------------------------------------

minikube service person --url


# Check the exit code of the deployment command
if [ $? -eq 0 ]; then
    echo "Deployment successful!"
else
    echo "Deployment failed!"
fi