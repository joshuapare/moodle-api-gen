# CoreGradesGetEnrolledUsersForSearchWidgetRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionbaseurl** | **str** | The base URL for the user option | [default to 'null']
**courseid** | **int** | Course Id | [default to null]
**groupid** | **int** | Group Id | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_grades_get_enrolled_users_for_search_widget_request import CoreGradesGetEnrolledUsersForSearchWidgetRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetEnrolledUsersForSearchWidgetRequest from a JSON string
core_grades_get_enrolled_users_for_search_widget_request_instance = CoreGradesGetEnrolledUsersForSearchWidgetRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetEnrolledUsersForSearchWidgetRequest.to_json())

# convert the object into a dict
core_grades_get_enrolled_users_for_search_widget_request_dict = core_grades_get_enrolled_users_for_search_widget_request_instance.to_dict()
# create an instance of CoreGradesGetEnrolledUsersForSearchWidgetRequest from a dict
core_grades_get_enrolled_users_for_search_widget_request_from_dict = CoreGradesGetEnrolledUsersForSearchWidgetRequest.from_dict(core_grades_get_enrolled_users_for_search_widget_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


