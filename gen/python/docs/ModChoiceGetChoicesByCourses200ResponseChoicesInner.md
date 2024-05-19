# ModChoiceGetChoicesByCourses200ResponseChoicesInner

Choices

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowmultiple** | **bool** | Allow multiple choices | [optional] [default to False]
**allowupdate** | **bool** | Allow update | [optional] [default to False]
**completionsubmit** | **bool** | Completion on user submission | [optional] [default to False]
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**display** | **int** | Display mode (vertical, horizontal) | [optional] [default to null]
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**includeinactive** | **bool** | Include inactive users | [optional] [default to False]
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**limitanswers** | **bool** | Limit unswers | [optional] [default to False]
**name** | **str** | Activity name | [optional] 
**publish** | **bool** | If choice is published | [optional] [default to False]
**section** | **int** | Course section id | [optional] 
**showavailable** | **bool** | Show available spaces | [optional] [default to False]
**showpreview** | **bool** | Show preview before timeopen | [optional] [default to False]
**showresults** | **int** | 0 never, 1 after answer, 2 after close, 3 always | [optional] [default to null]
**showunanswered** | **bool** | Show users who not answered yet | [optional] [default to False]
**timeclose** | **int** | Date of closing validity | [optional] [default to null]
**timemodified** | **int** | Time of last modification | [optional] 
**timeopen** | **int** | Date of opening validity | [optional] [default to null]
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_choice_get_choices_by_courses200_response_choices_inner import ModChoiceGetChoicesByCourses200ResponseChoicesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModChoiceGetChoicesByCourses200ResponseChoicesInner from a JSON string
mod_choice_get_choices_by_courses200_response_choices_inner_instance = ModChoiceGetChoicesByCourses200ResponseChoicesInner.from_json(json)
# print the JSON string representation of the object
print(ModChoiceGetChoicesByCourses200ResponseChoicesInner.to_json())

# convert the object into a dict
mod_choice_get_choices_by_courses200_response_choices_inner_dict = mod_choice_get_choices_by_courses200_response_choices_inner_instance.to_dict()
# create an instance of ModChoiceGetChoicesByCourses200ResponseChoicesInner from a dict
mod_choice_get_choices_by_courses200_response_choices_inner_from_dict = ModChoiceGetChoicesByCourses200ResponseChoicesInner.from_dict(mod_choice_get_choices_by_courses200_response_choices_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


