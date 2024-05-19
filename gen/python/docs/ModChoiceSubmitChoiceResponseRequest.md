# ModChoiceSubmitChoiceResponseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**choiceid** | **int** | choice instance id | 
**responses** | **List[object]** |  | 

## Example

```python
from openapi_client.models.mod_choice_submit_choice_response_request import ModChoiceSubmitChoiceResponseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModChoiceSubmitChoiceResponseRequest from a JSON string
mod_choice_submit_choice_response_request_instance = ModChoiceSubmitChoiceResponseRequest.from_json(json)
# print the JSON string representation of the object
print(ModChoiceSubmitChoiceResponseRequest.to_json())

# convert the object into a dict
mod_choice_submit_choice_response_request_dict = mod_choice_submit_choice_response_request_instance.to_dict()
# create an instance of ModChoiceSubmitChoiceResponseRequest from a dict
mod_choice_submit_choice_response_request_from_dict = ModChoiceSubmitChoiceResponseRequest.from_dict(mod_choice_submit_choice_response_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


