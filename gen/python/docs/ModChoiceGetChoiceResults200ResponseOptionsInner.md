# ModChoiceGetChoiceResults200ResponseOptionsInner

Options

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | choice instance id | [optional] 
**maxanswer** | **int** | maximum number of answers | [optional] 
**numberofuser** | **int** | number of users answers | [optional] [default to null]
**percentageamount** | **float** | percentage of users answers | [optional] [default to null]
**text** | **str** | text of the choice | [optional] 
**userresponses** | [**List[ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner]**](ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_choice_get_choice_results200_response_options_inner import ModChoiceGetChoiceResults200ResponseOptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModChoiceGetChoiceResults200ResponseOptionsInner from a JSON string
mod_choice_get_choice_results200_response_options_inner_instance = ModChoiceGetChoiceResults200ResponseOptionsInner.from_json(json)
# print the JSON string representation of the object
print(ModChoiceGetChoiceResults200ResponseOptionsInner.to_json())

# convert the object into a dict
mod_choice_get_choice_results200_response_options_inner_dict = mod_choice_get_choice_results200_response_options_inner_instance.to_dict()
# create an instance of ModChoiceGetChoiceResults200ResponseOptionsInner from a dict
mod_choice_get_choice_results200_response_options_inner_from_dict = ModChoiceGetChoiceResults200ResponseOptionsInner.from_dict(mod_choice_get_choice_results200_response_options_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


