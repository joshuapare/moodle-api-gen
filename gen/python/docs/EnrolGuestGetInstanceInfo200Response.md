# EnrolGuestGetInstanceInfo200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceinfo** | [**EnrolGuestGetInstanceInfo200ResponseInstanceinfo**](EnrolGuestGetInstanceInfo200ResponseInstanceinfo.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.enrol_guest_get_instance_info200_response import EnrolGuestGetInstanceInfo200Response

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolGuestGetInstanceInfo200Response from a JSON string
enrol_guest_get_instance_info200_response_instance = EnrolGuestGetInstanceInfo200Response.from_json(json)
# print the JSON string representation of the object
print(EnrolGuestGetInstanceInfo200Response.to_json())

# convert the object into a dict
enrol_guest_get_instance_info200_response_dict = enrol_guest_get_instance_info200_response_instance.to_dict()
# create an instance of EnrolGuestGetInstanceInfo200Response from a dict
enrol_guest_get_instance_info200_response_from_dict = EnrolGuestGetInstanceInfo200Response.from_dict(enrol_guest_get_instance_info200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


