import requests

# Make a GET request
def get_request(url):
    response = requests.get(url)
    if response.status_code == 200:
        print("GET Request Successful")
        print("Response:")
        print(response.json())
    else:
        print("GET Request Failed")

# Example usage
if __name__ == "__main__":

    url = "http://localhost:8080/person/all"

    # GET request
    get_request(url)
