# CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayvalue** | **str** | The value of the custom field for display | [optional] [default to 'null']
**name** | **str** | The name of the custom field | [optional] 
**shortname** | **str** | The shortname of the custom field - to be able to build the field class in the code | [optional] 
**type** | **str** | The type of the custom field - text field, checkbox... | [optional] 
**value** | **str** | The value of the custom field (as stored in the database) | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_grades_get_enrolled_users_for_selector200_response_users_inner_customfields_inner import CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner from a JSON string
core_grades_get_enrolled_users_for_selector200_response_users_inner_customfields_inner_instance = CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.to_json())

# convert the object into a dict
core_grades_get_enrolled_users_for_selector200_response_users_inner_customfields_inner_dict = core_grades_get_enrolled_users_for_selector200_response_users_inner_customfields_inner_instance.to_dict()
# create an instance of CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner from a dict
core_grades_get_enrolled_users_for_selector200_response_users_inner_customfields_inner_from_dict = CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.from_dict(core_grades_get_enrolled_users_for_selector200_response_users_inner_customfields_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


