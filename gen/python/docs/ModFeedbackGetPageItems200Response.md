# ModFeedbackGetPageItems200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hasnextpage** | **bool** | Whether there are more pages. | [default to False]
**hasprevpage** | **bool** | Whether is a previous page. | [default to False]
**items** | [**List[ModFeedbackGetItems200ResponseItemsInner]**](ModFeedbackGetItems200ResponseItemsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_page_items200_response import ModFeedbackGetPageItems200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetPageItems200Response from a JSON string
mod_feedback_get_page_items200_response_instance = ModFeedbackGetPageItems200Response.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetPageItems200Response.to_json())

# convert the object into a dict
mod_feedback_get_page_items200_response_dict = mod_feedback_get_page_items200_response_instance.to_dict()
# create an instance of ModFeedbackGetPageItems200Response from a dict
mod_feedback_get_page_items200_response_from_dict = ModFeedbackGetPageItems200Response.from_dict(mod_feedback_get_page_items200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


