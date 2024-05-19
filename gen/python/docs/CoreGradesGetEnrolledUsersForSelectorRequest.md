# CoreGradesGetEnrolledUsersForSelectorRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course Id | 
**groupid** | **int** | Group Id | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_grades_get_enrolled_users_for_selector_request import CoreGradesGetEnrolledUsersForSelectorRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetEnrolledUsersForSelectorRequest from a JSON string
core_grades_get_enrolled_users_for_selector_request_instance = CoreGradesGetEnrolledUsersForSelectorRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetEnrolledUsersForSelectorRequest.to_json())

# convert the object into a dict
core_grades_get_enrolled_users_for_selector_request_dict = core_grades_get_enrolled_users_for_selector_request_instance.to_dict()
# create an instance of CoreGradesGetEnrolledUsersForSelectorRequest from a dict
core_grades_get_enrolled_users_for_selector_request_from_dict = CoreGradesGetEnrolledUsersForSelectorRequest.from_dict(core_grades_get_enrolled_users_for_selector_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


