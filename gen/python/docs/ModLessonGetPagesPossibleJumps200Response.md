# ModLessonGetPagesPossibleJumps200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jumps** | [**List[ModLessonGetPagesPossibleJumps200ResponseJumpsInner]**](ModLessonGetPagesPossibleJumps200ResponseJumpsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_pages_possible_jumps200_response import ModLessonGetPagesPossibleJumps200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetPagesPossibleJumps200Response from a JSON string
mod_lesson_get_pages_possible_jumps200_response_instance = ModLessonGetPagesPossibleJumps200Response.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetPagesPossibleJumps200Response.to_json())

# convert the object into a dict
mod_lesson_get_pages_possible_jumps200_response_dict = mod_lesson_get_pages_possible_jumps200_response_instance.to_dict()
# create an instance of ModLessonGetPagesPossibleJumps200Response from a dict
mod_lesson_get_pages_possible_jumps200_response_from_dict = ModLessonGetPagesPossibleJumps200Response.from_dict(mod_lesson_get_pages_possible_jumps200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


