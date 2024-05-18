# CoreOutputLoadTemplateWithDependencies200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strings** | [**List[CoreOutputLoadTemplateWithDependencies200ResponseStringsInner]**](CoreOutputLoadTemplateWithDependencies200ResponseStringsInner.md) |  | 
**templates** | [**List[CoreOutputLoadTemplateWithDependencies200ResponseTemplatesInner]**](CoreOutputLoadTemplateWithDependencies200ResponseTemplatesInner.md) |  | 

## Example

```python
from openapi_client.models.core_output_load_template_with_dependencies200_response import CoreOutputLoadTemplateWithDependencies200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreOutputLoadTemplateWithDependencies200Response from a JSON string
core_output_load_template_with_dependencies200_response_instance = CoreOutputLoadTemplateWithDependencies200Response.from_json(json)
# print the JSON string representation of the object
print(CoreOutputLoadTemplateWithDependencies200Response.to_json())

# convert the object into a dict
core_output_load_template_with_dependencies200_response_dict = core_output_load_template_with_dependencies200_response_instance.to_dict()
# create an instance of CoreOutputLoadTemplateWithDependencies200Response from a dict
core_output_load_template_with_dependencies200_response_from_dict = CoreOutputLoadTemplateWithDependencies200Response.from_dict(core_output_load_template_with_dependencies200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


