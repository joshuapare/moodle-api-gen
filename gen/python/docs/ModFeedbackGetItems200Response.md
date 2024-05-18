# ModFeedbackGetItems200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[ModFeedbackGetItems200ResponseItemsInner]**](ModFeedbackGetItems200ResponseItemsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_items200_response import ModFeedbackGetItems200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetItems200Response from a JSON string
mod_feedback_get_items200_response_instance = ModFeedbackGetItems200Response.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetItems200Response.to_json())

# convert the object into a dict
mod_feedback_get_items200_response_dict = mod_feedback_get_items200_response_instance.to_dict()
# create an instance of ModFeedbackGetItems200Response from a dict
mod_feedback_get_items200_response_from_dict = ModFeedbackGetItems200Response.from_dict(mod_feedback_get_items200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

