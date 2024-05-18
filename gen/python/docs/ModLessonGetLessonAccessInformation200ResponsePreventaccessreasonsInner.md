# ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner

The reasons why the user cannot attempt the lesson

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **str** | Additional data | [optional] [default to 'null']
**message** | **str** | Complete html message | [optional] [default to 'null']
**reason** | **str** | Reason lang string code | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_lesson_get_lesson_access_information200_response_preventaccessreasons_inner import ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner from a JSON string
mod_lesson_get_lesson_access_information200_response_preventaccessreasons_inner_instance = ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner.to_json())

# convert the object into a dict
mod_lesson_get_lesson_access_information200_response_preventaccessreasons_inner_dict = mod_lesson_get_lesson_access_information200_response_preventaccessreasons_inner_instance.to_dict()
# create an instance of ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner from a dict
mod_lesson_get_lesson_access_information200_response_preventaccessreasons_inner_from_dict = ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner.from_dict(mod_lesson_get_lesson_access_information200_response_preventaccessreasons_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


