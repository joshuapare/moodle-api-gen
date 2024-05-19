# ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answers** | **List[object]** |  | [optional] 
**response** | **str** | The response text. | [default to 'null']
**responseformat** | **int** | response. format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [default to null]
**score** | **str** | The score (text version). | [default to 'null']

## Example

```python
from openapi_client.models.mod_lesson_get_user_attempt200_response_answerpages_inner_answerdata import ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata from a JSON string
mod_lesson_get_user_attempt200_response_answerpages_inner_answerdata_instance = ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata.to_json())

# convert the object into a dict
mod_lesson_get_user_attempt200_response_answerpages_inner_answerdata_dict = mod_lesson_get_user_attempt200_response_answerpages_inner_answerdata_instance.to_dict()
# create an instance of ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata from a dict
mod_lesson_get_user_attempt200_response_answerpages_inner_answerdata_from_dict = ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata.from_dict(mod_lesson_get_user_attempt200_response_answerpages_inner_answerdata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


