echo "Deployment Start >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.!"
echo ""

mvn clean install
echo ""

eval $(minikube docker-env)             
echo ""

minikube docker-env | Invoke-Expression 
echo ""

docker build -t person:0.0.1 .
echo ""

kubectl delete pod person
echo ""

kubectl run person --image=person:0.0.1 --image-pull-policy=Never
echo ""

# Run on first time only -------------------------------------------------------------------------

#kubectl delete service person  
echo ""

#kubectl expose pod person --type=NodePort --port=8080 --target-port=8080 --name=person
echo ""

# End block first time----------------------------------------------------------------------------

minikube service person --url
echo ""
echo ""
echo ""

# Check the exit code of the deployment command
if [ $? -eq 0 ]; then
    echo "Deployment successful!"
else
    echo "Deployment failed!"
fi

echo "Deployment End >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.!"