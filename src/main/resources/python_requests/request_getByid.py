import requests
import json

# URL for the GET request
url = "http://localhost:8080/person/getperson"

# JSON data for the request body
data = {
    "id": 5
}

# Convert the data to JSON format
json_data = json.dumps(data)

# Set the appropriate headers
headers = {
    "Content-Type": "application/json"
}

# Send the GET request with request body
response = requests.get(url, headers=headers, data=json_data)

# Check the response
if response.status_code == 200:
    print("GET Request Successful")
    print("Response:")
    print(response.json())
else:
    print("GET Request Failed")
