# ModChoiceDeleteChoiceResponses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | status, true if everything went right | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_choice_delete_choice_responses200_response import ModChoiceDeleteChoiceResponses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModChoiceDeleteChoiceResponses200Response from a JSON string
mod_choice_delete_choice_responses200_response_instance = ModChoiceDeleteChoiceResponses200Response.from_json(json)
# print the JSON string representation of the object
print(ModChoiceDeleteChoiceResponses200Response.to_json())

# convert the object into a dict
mod_choice_delete_choice_responses200_response_dict = mod_choice_delete_choice_responses200_response_instance.to_dict()
# create an instance of ModChoiceDeleteChoiceResponses200Response from a dict
mod_choice_delete_choice_responses200_response_from_dict = ModChoiceDeleteChoiceResponses200Response.from_dict(mod_choice_delete_choice_responses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


