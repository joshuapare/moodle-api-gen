# ModChoiceDeleteChoiceResponsesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**choiceid** | **int** | choice instance id | [default to null]
**responses** | **List[object]** |  | [optional] 

## Example

```python
from openapi_client.models.mod_choice_delete_choice_responses_request import ModChoiceDeleteChoiceResponsesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModChoiceDeleteChoiceResponsesRequest from a JSON string
mod_choice_delete_choice_responses_request_instance = ModChoiceDeleteChoiceResponsesRequest.from_json(json)
# print the JSON string representation of the object
print(ModChoiceDeleteChoiceResponsesRequest.to_json())

# convert the object into a dict
mod_choice_delete_choice_responses_request_dict = mod_choice_delete_choice_responses_request_instance.to_dict()
# create an instance of ModChoiceDeleteChoiceResponsesRequest from a dict
mod_choice_delete_choice_responses_request_from_dict = ModChoiceDeleteChoiceResponsesRequest.from_dict(mod_choice_delete_choice_responses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


