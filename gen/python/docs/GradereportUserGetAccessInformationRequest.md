# GradereportUserGetAccessInformationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course to check. | [default to null]

## Example

```python
from openapi_client.models.gradereport_user_get_access_information_request import GradereportUserGetAccessInformationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportUserGetAccessInformationRequest from a JSON string
gradereport_user_get_access_information_request_instance = GradereportUserGetAccessInformationRequest.from_json(json)
# print the JSON string representation of the object
print(GradereportUserGetAccessInformationRequest.to_json())

# convert the object into a dict
gradereport_user_get_access_information_request_dict = gradereport_user_get_access_information_request_instance.to_dict()
# create an instance of GradereportUserGetAccessInformationRequest from a dict
gradereport_user_get_access_information_request_from_dict = GradereportUserGetAccessInformationRequest.from_dict(gradereport_user_get_access_information_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


