# Run on first time only -------------------------------------------------------------------------
echo "Service Starting"
echo ""
kubectl delete service person  
echo ""

kubectl expose pod person --type=NodePort --port=8080 --target-port=8080 --name=person
echo ""

minikube service person --url
echo ""
echo ""

# Check the exit code of the deployment command
if [ $? -eq 0 ]; then
    echo "Service Create successful!"
else
    echo "Service Create failed!"
fi