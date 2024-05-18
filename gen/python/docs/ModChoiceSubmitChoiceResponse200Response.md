# ModChoiceSubmitChoiceResponse200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answers** | [**List[ModChoiceSubmitChoiceResponse200ResponseAnswersInner]**](ModChoiceSubmitChoiceResponse200ResponseAnswersInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_choice_submit_choice_response200_response import ModChoiceSubmitChoiceResponse200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModChoiceSubmitChoiceResponse200Response from a JSON string
mod_choice_submit_choice_response200_response_instance = ModChoiceSubmitChoiceResponse200Response.from_json(json)
# print the JSON string representation of the object
print(ModChoiceSubmitChoiceResponse200Response.to_json())

# convert the object into a dict
mod_choice_submit_choice_response200_response_dict = mod_choice_submit_choice_response200_response_instance.to_dict()
# create an instance of ModChoiceSubmitChoiceResponse200Response from a dict
mod_choice_submit_choice_response200_response_from_dict = ModChoiceSubmitChoiceResponse200Response.from_dict(mod_choice_submit_choice_response200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


