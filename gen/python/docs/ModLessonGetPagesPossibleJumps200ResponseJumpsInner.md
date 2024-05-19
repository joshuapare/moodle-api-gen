# ModLessonGetPagesPossibleJumps200ResponseJumpsInner

Jump for a page answer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answerid** | **int** | The answer id | [optional] [default to null]
**calculatedjump** | **int** | The real page id (or EOL) to jump | [optional] [default to null]
**jumpto** | **int** | The jump (page id or type of jump) | [optional] [default to null]
**pageid** | **int** | The page id | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_lesson_get_pages_possible_jumps200_response_jumps_inner import ModLessonGetPagesPossibleJumps200ResponseJumpsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetPagesPossibleJumps200ResponseJumpsInner from a JSON string
mod_lesson_get_pages_possible_jumps200_response_jumps_inner_instance = ModLessonGetPagesPossibleJumps200ResponseJumpsInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetPagesPossibleJumps200ResponseJumpsInner.to_json())

# convert the object into a dict
mod_lesson_get_pages_possible_jumps200_response_jumps_inner_dict = mod_lesson_get_pages_possible_jumps200_response_jumps_inner_instance.to_dict()
# create an instance of ModLessonGetPagesPossibleJumps200ResponseJumpsInner from a dict
mod_lesson_get_pages_possible_jumps200_response_jumps_inner_from_dict = ModLessonGetPagesPossibleJumps200ResponseJumpsInner.from_dict(mod_lesson_get_pages_possible_jumps200_response_jumps_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


