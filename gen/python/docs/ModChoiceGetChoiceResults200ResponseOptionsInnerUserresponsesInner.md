# ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner

User responses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answerid** | **int** | answer id | [optional] [default to null]
**fullname** | **str** | user full name | [optional] 
**profileimageurl** | **str** | profile user image url | [optional] [default to 'null']
**timemodified** | **int** | time of modification | [optional] [default to null]
**userid** | **int** | user id | [optional] 

## Example

```python
from openapi_client.models.mod_choice_get_choice_results200_response_options_inner_userresponses_inner import ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner from a JSON string
mod_choice_get_choice_results200_response_options_inner_userresponses_inner_instance = ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner.from_json(json)
# print the JSON string representation of the object
print(ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner.to_json())

# convert the object into a dict
mod_choice_get_choice_results200_response_options_inner_userresponses_inner_dict = mod_choice_get_choice_results200_response_options_inner_userresponses_inner_instance.to_dict()
# create an instance of ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner from a dict
mod_choice_get_choice_results200_response_options_inner_userresponses_inner_from_dict = ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner.from_dict(mod_choice_get_choice_results200_response_options_inner_userresponses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


