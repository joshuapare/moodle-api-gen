# ModLessonGetPageData200ResponseAnswersInner

The page answers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answer** | **str** | Possible answer text | [optional] [default to 'null']
**answerfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**answerformat** | **int** | answer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**flags** | **int** | Used to store options for the answer | [optional] [default to null]
**grade** | **int** | The grade this answer is worth | [optional] [default to null]
**id** | **int** | The ID of this answer in the database | [optional] [default to null]
**jumpto** | **int** | Identifies where the user goes upon completing a page with this answer | [optional] [default to null]
**response** | **str** | Response text for the answer | [optional] [default to 'null']
**responsefiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**responseformat** | **int** | response format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**score** | **int** | The score this answer will give | [optional] [default to null]
**timecreated** | **int** | A timestamp of when the answer was created | [optional] [default to null]
**timemodified** | **int** | A timestamp of when the answer was modified | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_lesson_get_page_data200_response_answers_inner import ModLessonGetPageData200ResponseAnswersInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetPageData200ResponseAnswersInner from a JSON string
mod_lesson_get_page_data200_response_answers_inner_instance = ModLessonGetPageData200ResponseAnswersInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetPageData200ResponseAnswersInner.to_json())

# convert the object into a dict
mod_lesson_get_page_data200_response_answers_inner_dict = mod_lesson_get_page_data200_response_answers_inner_instance.to_dict()
# create an instance of ModLessonGetPageData200ResponseAnswersInner from a dict
mod_lesson_get_page_data200_response_answers_inner_from_dict = ModLessonGetPageData200ResponseAnswersInner.from_dict(mod_lesson_get_page_data200_response_answers_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


