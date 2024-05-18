# CoreOutputLoadTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | component containing the template | [default to 'null']
**includecomments** | **bool** | Include comments or not | [optional] [default to False]
**template** | **str** | name of the template | [default to 'null']
**themename** | **str** | The current theme. | [default to 'null']

## Example

```python
from openapi_client.models.core_output_load_template_request import CoreOutputLoadTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreOutputLoadTemplateRequest from a JSON string
core_output_load_template_request_instance = CoreOutputLoadTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CoreOutputLoadTemplateRequest.to_json())

# convert the object into a dict
core_output_load_template_request_dict = core_output_load_template_request_instance.to_dict()
# create an instance of CoreOutputLoadTemplateRequest from a dict
core_output_load_template_request_from_dict = CoreOutputLoadTemplateRequest.from_dict(core_output_load_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


