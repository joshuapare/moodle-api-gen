# ModChoiceGetChoiceOptions200ResponseOptionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checked** | **bool** | we already answered | [optional] [default to False]
**countanswers** | **int** | number of answers | [optional] [default to null]
**disabled** | **bool** | option disabled | [optional] [default to False]
**displaylayout** | **bool** | true for orizontal, otherwise vertical | [optional] [default to False]
**id** | **int** | option id | [optional] [default to null]
**maxanswers** | **int** | maximum number of answers | [optional] [default to null]
**text** | **str** | text of the choice | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_choice_get_choice_options200_response_options_inner import ModChoiceGetChoiceOptions200ResponseOptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModChoiceGetChoiceOptions200ResponseOptionsInner from a JSON string
mod_choice_get_choice_options200_response_options_inner_instance = ModChoiceGetChoiceOptions200ResponseOptionsInner.from_json(json)
# print the JSON string representation of the object
print(ModChoiceGetChoiceOptions200ResponseOptionsInner.to_json())

# convert the object into a dict
mod_choice_get_choice_options200_response_options_inner_dict = mod_choice_get_choice_options200_response_options_inner_instance.to_dict()
# create an instance of ModChoiceGetChoiceOptions200ResponseOptionsInner from a dict
mod_choice_get_choice_options200_response_options_inner_from_dict = ModChoiceGetChoiceOptions200ResponseOptionsInner.from_dict(mod_choice_get_choice_options200_response_options_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


