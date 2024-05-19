# CoreGradingSaveDefinitionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**areas** | [**List[CoreGradingSaveDefinitionsRequestAreasInner]**](CoreGradingSaveDefinitionsRequestAreasInner.md) |  | 

## Example

```python
from openapi_client.models.core_grading_save_definitions_request import CoreGradingSaveDefinitionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingSaveDefinitionsRequest from a JSON string
core_grading_save_definitions_request_instance = CoreGradingSaveDefinitionsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradingSaveDefinitionsRequest.to_json())

# convert the object into a dict
core_grading_save_definitions_request_dict = core_grading_save_definitions_request_instance.to_dict()
# create an instance of CoreGradingSaveDefinitionsRequest from a dict
core_grading_save_definitions_request_from_dict = CoreGradingSaveDefinitionsRequest.from_dict(core_grading_save_definitions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


