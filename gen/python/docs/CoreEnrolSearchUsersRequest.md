# CoreEnrolSearchUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | Context ID | [optional] [default to null]
**courseid** | **int** | course id | 
**page** | **int** | Page number | 
**perpage** | **int** | Number per page | 
**search** | **str** | query | 
**searchanywhere** | **bool** | find a match anywhere, or only at the beginning | 

## Example

```python
from openapi_client.models.core_enrol_search_users_request import CoreEnrolSearchUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreEnrolSearchUsersRequest from a JSON string
core_enrol_search_users_request_instance = CoreEnrolSearchUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreEnrolSearchUsersRequest.to_json())

# convert the object into a dict
core_enrol_search_users_request_dict = core_enrol_search_users_request_instance.to_dict()
# create an instance of CoreEnrolSearchUsersRequest from a dict
core_enrol_search_users_request_from_dict = CoreEnrolSearchUsersRequest.from_dict(core_enrol_search_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


