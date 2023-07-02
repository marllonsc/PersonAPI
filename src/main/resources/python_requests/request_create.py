import requests
import json

def post_request(url, data):
    headers = {
        'Content-Type': 'application/json'
    }
    response = requests.post(url, headers=headers, json=data)
    if response.status_code == 200:
        print("POST Request Successful")
        print("Response:")
        print(response.json())
    else:
        print("POST Request Failed")

# Example usage
if __name__ == "__main__":
    # URL for the POST request
    url = "http://localhost:8080/person/create"

    # JSON data for the request body
    data = {
            "name": "Marllon Costa",
            "document": "2345066",
            "email": "msc@example.com"
            }

    # Send the POST request
    post_request(url, data)