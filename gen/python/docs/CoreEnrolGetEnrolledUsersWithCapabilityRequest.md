# CoreEnrolGetEnrolledUsersWithCapabilityRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coursecapabilities** | [**List[CoreEnrolGetEnrolledUsersWithCapabilityRequestCoursecapabilitiesInner]**](CoreEnrolGetEnrolledUsersWithCapabilityRequestCoursecapabilitiesInner.md) |  | 
**options** | [**List[CoreEnrolGetEnrolledUsersWithCapabilityRequestOptionsInner]**](CoreEnrolGetEnrolledUsersWithCapabilityRequestOptionsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_enrol_get_enrolled_users_with_capability_request import CoreEnrolGetEnrolledUsersWithCapabilityRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreEnrolGetEnrolledUsersWithCapabilityRequest from a JSON string
core_enrol_get_enrolled_users_with_capability_request_instance = CoreEnrolGetEnrolledUsersWithCapabilityRequest.from_json(json)
# print the JSON string representation of the object
print(CoreEnrolGetEnrolledUsersWithCapabilityRequest.to_json())

# convert the object into a dict
core_enrol_get_enrolled_users_with_capability_request_dict = core_enrol_get_enrolled_users_with_capability_request_instance.to_dict()
# create an instance of CoreEnrolGetEnrolledUsersWithCapabilityRequest from a dict
core_enrol_get_enrolled_users_with_capability_request_from_dict = CoreEnrolGetEnrolledUsersWithCapabilityRequest.from_dict(core_enrol_get_enrolled_users_with_capability_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


