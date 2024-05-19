# ModLessonGetLessonAccessInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptscount** | **int** | The number of attempts done by the user. | [default to null]
**cangrade** | **bool** | Whether the user can grade the lesson or not. | [default to False]
**canmanage** | **bool** | Whether the user can manage the lesson or not. | [default to False]
**canviewreports** | **bool** | Whether the user can view the lesson reports or not. | [default to False]
**firstpageid** | **int** | The lesson first page id. | [default to null]
**lastpageseen** | **int** | The last page seen id. | [default to null]
**leftduringtimedsession** | **bool** | Whether the user left during a timed session. | [default to False]
**preventaccessreasons** | [**List[ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner]**](ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner.md) |  | 
**reviewmode** | **bool** | Whether the lesson is in review mode for the current user. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_lesson_access_information200_response import ModLessonGetLessonAccessInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetLessonAccessInformation200Response from a JSON string
mod_lesson_get_lesson_access_information200_response_instance = ModLessonGetLessonAccessInformation200Response.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetLessonAccessInformation200Response.to_json())

# convert the object into a dict
mod_lesson_get_lesson_access_information200_response_dict = mod_lesson_get_lesson_access_information200_response_instance.to_dict()
# create an instance of ModLessonGetLessonAccessInformation200Response from a dict
mod_lesson_get_lesson_access_information200_response_from_dict = ModLessonGetLessonAccessInformation200Response.from_dict(mod_lesson_get_lesson_access_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


