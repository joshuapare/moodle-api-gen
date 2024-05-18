# CoreGradesGetEnrolledUsersForSearchWidget200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner]**](CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_grades_get_enrolled_users_for_search_widget200_response import CoreGradesGetEnrolledUsersForSearchWidget200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetEnrolledUsersForSearchWidget200Response from a JSON string
core_grades_get_enrolled_users_for_search_widget200_response_instance = CoreGradesGetEnrolledUsersForSearchWidget200Response.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetEnrolledUsersForSearchWidget200Response.to_json())

# convert the object into a dict
core_grades_get_enrolled_users_for_search_widget200_response_dict = core_grades_get_enrolled_users_for_search_widget200_response_instance.to_dict()
# create an instance of CoreGradesGetEnrolledUsersForSearchWidget200Response from a dict
core_grades_get_enrolled_users_for_search_widget200_response_from_dict = CoreGradesGetEnrolledUsersForSearchWidget200Response.from_dict(core_grades_get_enrolled_users_for_search_widget200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


