# CoreOutputLoadTemplateWithDependenciesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | component containing the template | 
**includecomments** | **bool** | Include comments or not | [optional] [default to False]
**lang** | **str** | lang | [optional] 
**template** | **str** | name of the template | 
**themename** | **str** | The current theme. | 

## Example

```python
from openapi_client.models.core_output_load_template_with_dependencies_request import CoreOutputLoadTemplateWithDependenciesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreOutputLoadTemplateWithDependenciesRequest from a JSON string
core_output_load_template_with_dependencies_request_instance = CoreOutputLoadTemplateWithDependenciesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreOutputLoadTemplateWithDependenciesRequest.to_json())

# convert the object into a dict
core_output_load_template_with_dependencies_request_dict = core_output_load_template_with_dependencies_request_instance.to_dict()
# create an instance of CoreOutputLoadTemplateWithDependenciesRequest from a dict
core_output_load_template_with_dependencies_request_from_dict = CoreOutputLoadTemplateWithDependenciesRequest.from_dict(core_output_load_template_with_dependencies_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


