# CoreGradingGetDefinitionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeonly** | **bool** | Only the active method | [optional] [default to False]
**areaname** | **str** | area name | [default to 'null']
**cmids** | **List[object]** |  | 

## Example

```python
from openapi_client.models.core_grading_get_definitions_request import CoreGradingGetDefinitionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingGetDefinitionsRequest from a JSON string
core_grading_get_definitions_request_instance = CoreGradingGetDefinitionsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradingGetDefinitionsRequest.to_json())

# convert the object into a dict
core_grading_get_definitions_request_dict = core_grading_get_definitions_request_instance.to_dict()
# create an instance of CoreGradingGetDefinitionsRequest from a dict
core_grading_get_definitions_request_from_dict = CoreGradingGetDefinitionsRequest.from_dict(core_grading_get_definitions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


