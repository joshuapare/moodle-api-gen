# ToolBehatGetEntityGeneratorRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitytype** | **str** | Entity type that can be created by a generator. | [default to 'null']

## Example

```python
from openapi_client.models.tool_behat_get_entity_generator_request import ToolBehatGetEntityGeneratorRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolBehatGetEntityGeneratorRequest from a JSON string
tool_behat_get_entity_generator_request_instance = ToolBehatGetEntityGeneratorRequest.from_json(json)
# print the JSON string representation of the object
print(ToolBehatGetEntityGeneratorRequest.to_json())

# convert the object into a dict
tool_behat_get_entity_generator_request_dict = tool_behat_get_entity_generator_request_instance.to_dict()
# create an instance of ToolBehatGetEntityGeneratorRequest from a dict
tool_behat_get_entity_generator_request_from_dict = ToolBehatGetEntityGeneratorRequest.from_dict(tool_behat_get_entity_generator_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


