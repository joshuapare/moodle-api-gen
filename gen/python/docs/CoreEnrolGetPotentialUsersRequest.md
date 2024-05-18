# CoreEnrolGetPotentialUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id | 
**enrolid** | **int** | enrolment id | [default to null]
**page** | **int** | Page number | [default to null]
**perpage** | **int** | Number per page | [default to null]
**search** | **str** | query | [default to 'null']
**searchanywhere** | **bool** | find a match anywhere, or only at the beginning | [default to False]

## Example

```python
from openapi_client.models.core_enrol_get_potential_users_request import CoreEnrolGetPotentialUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreEnrolGetPotentialUsersRequest from a JSON string
core_enrol_get_potential_users_request_instance = CoreEnrolGetPotentialUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreEnrolGetPotentialUsersRequest.to_json())

# convert the object into a dict
core_enrol_get_potential_users_request_dict = core_enrol_get_potential_users_request_instance.to_dict()
# create an instance of CoreEnrolGetPotentialUsersRequest from a dict
core_enrol_get_potential_users_request_from_dict = CoreEnrolGetPotentialUsersRequest.from_dict(core_enrol_get_potential_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


