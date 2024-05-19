# CoreGradesGetGradableUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course Id | 
**groupid** | **int** | Group Id | [optional] [default to 0]
**onlyactive** | **bool** | Only active enrolment | [optional] [default to False]

## Example

```python
from openapi_client.models.core_grades_get_gradable_users_request import CoreGradesGetGradableUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetGradableUsersRequest from a JSON string
core_grades_get_gradable_users_request_instance = CoreGradesGetGradableUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetGradableUsersRequest.to_json())

# convert the object into a dict
core_grades_get_gradable_users_request_dict = core_grades_get_gradable_users_request_instance.to_dict()
# create an instance of CoreGradesGetGradableUsersRequest from a dict
core_grades_get_gradable_users_request_from_dict = CoreGradesGetGradableUsersRequest.from_dict(core_grades_get_gradable_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


