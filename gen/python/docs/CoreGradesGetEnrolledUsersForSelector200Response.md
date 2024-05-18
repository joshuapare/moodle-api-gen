# CoreGradesGetEnrolledUsersForSelector200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner]**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_grades_get_enrolled_users_for_selector200_response import CoreGradesGetEnrolledUsersForSelector200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetEnrolledUsersForSelector200Response from a JSON string
core_grades_get_enrolled_users_for_selector200_response_instance = CoreGradesGetEnrolledUsersForSelector200Response.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetEnrolledUsersForSelector200Response.to_json())

# convert the object into a dict
core_grades_get_enrolled_users_for_selector200_response_dict = core_grades_get_enrolled_users_for_selector200_response_instance.to_dict()
# create an instance of CoreGradesGetEnrolledUsersForSelector200Response from a dict
core_grades_get_enrolled_users_for_selector200_response_from_dict = CoreGradesGetEnrolledUsersForSelector200Response.from_dict(core_grades_get_enrolled_users_for_selector200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


