import requests
import json

# URL for the DELETE request
url = "http://localhost:8080/person/delete"

# JSON data for the request body
data = {
    "id": 4
}

# Convert the data to JSON format
json_data = json.dumps(data)

# Set the appropriate headers
headers = {
    "Content-Type": "application/json"
}

# Send the DELETE request with request body
response = requests.delete(url, headers=headers, data=json_data)

# Check the response
if response.status_code == 200:
    print("DELETE Request Successful")
    print(response.json())
else:
    print("DELETE Request Failed")
