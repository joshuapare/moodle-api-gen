# CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** | Are we currently on this item? | [optional] [default to False]
**email** | **str** | An email address - allow email as root@localhost | [optional] [default to 'null']
**fullname** | **str** | The full name of the user | [optional] 
**id** | **int** | ID of the user | [optional] 
**profileimage** | **str** | The location of the users larger image | [optional] 
**url** | **str** | The link to the user report | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_grades_get_enrolled_users_for_search_widget200_response_users_inner import CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner from a JSON string
core_grades_get_enrolled_users_for_search_widget200_response_users_inner_instance = CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner.to_json())

# convert the object into a dict
core_grades_get_enrolled_users_for_search_widget200_response_users_inner_dict = core_grades_get_enrolled_users_for_search_widget200_response_users_inner_instance.to_dict()
# create an instance of CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner from a dict
core_grades_get_enrolled_users_for_search_widget200_response_users_inner_from_dict = CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner.from_dict(core_grades_get_enrolled_users_for_search_widget200_response_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


