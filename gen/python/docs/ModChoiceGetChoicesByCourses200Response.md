# ModChoiceGetChoicesByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**choices** | [**List[ModChoiceGetChoicesByCourses200ResponseChoicesInner]**](ModChoiceGetChoicesByCourses200ResponseChoicesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_choice_get_choices_by_courses200_response import ModChoiceGetChoicesByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModChoiceGetChoicesByCourses200Response from a JSON string
mod_choice_get_choices_by_courses200_response_instance = ModChoiceGetChoicesByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModChoiceGetChoicesByCourses200Response.to_json())

# convert the object into a dict
mod_choice_get_choices_by_courses200_response_dict = mod_choice_get_choices_by_courses200_response_instance.to_dict()
# create an instance of ModChoiceGetChoicesByCourses200Response from a dict
mod_choice_get_choices_by_courses200_response_from_dict = ModChoiceGetChoicesByCourses200Response.from_dict(mod_choice_get_choices_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


