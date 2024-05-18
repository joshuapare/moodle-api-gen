# ModLessonGetUserAttempt200ResponseAnswerpagesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answerdata** | [**ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata**](ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata.md) |  | [optional] 
**contents** | **str** | Page contents. | [optional] [default to 'null']
**grayout** | **int** | If is required to apply a grayout. | [optional] [default to null]
**page** | [**ModLessonGetPages200ResponsePagesInnerPage**](ModLessonGetPages200ResponsePagesInnerPage.md) |  | [optional] 
**qtype** | **str** | Identifies the page type of this page. | [optional] [default to 'null']
**title** | **str** | Page title. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_lesson_get_user_attempt200_response_answerpages_inner import ModLessonGetUserAttempt200ResponseAnswerpagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserAttempt200ResponseAnswerpagesInner from a JSON string
mod_lesson_get_user_attempt200_response_answerpages_inner_instance = ModLessonGetUserAttempt200ResponseAnswerpagesInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserAttempt200ResponseAnswerpagesInner.to_json())

# convert the object into a dict
mod_lesson_get_user_attempt200_response_answerpages_inner_dict = mod_lesson_get_user_attempt200_response_answerpages_inner_instance.to_dict()
# create an instance of ModLessonGetUserAttempt200ResponseAnswerpagesInner from a dict
mod_lesson_get_user_attempt200_response_answerpages_inner_from_dict = ModLessonGetUserAttempt200ResponseAnswerpagesInner.from_dict(mod_lesson_get_user_attempt200_response_answerpages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


