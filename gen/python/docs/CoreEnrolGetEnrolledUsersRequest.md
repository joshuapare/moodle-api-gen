# CoreEnrolGetEnrolledUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id | 
**options** | [**List[CoreEnrolGetEnrolledUsersRequestOptionsInner]**](CoreEnrolGetEnrolledUsersRequestOptionsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_enrol_get_enrolled_users_request import CoreEnrolGetEnrolledUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreEnrolGetEnrolledUsersRequest from a JSON string
core_enrol_get_enrolled_users_request_instance = CoreEnrolGetEnrolledUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreEnrolGetEnrolledUsersRequest.to_json())

# convert the object into a dict
core_enrol_get_enrolled_users_request_dict = core_enrol_get_enrolled_users_request_instance.to_dict()
# create an instance of CoreEnrolGetEnrolledUsersRequest from a dict
core_enrol_get_enrolled_users_request_from_dict = CoreEnrolGetEnrolledUsersRequest.from_dict(core_enrol_get_enrolled_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


