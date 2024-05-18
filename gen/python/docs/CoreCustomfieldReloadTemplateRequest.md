# CoreCustomfieldReloadTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | area | 
**component** | **str** | component | 
**itemid** | **int** | itemid | 

## Example

```python
from openapi_client.models.core_customfield_reload_template_request import CoreCustomfieldReloadTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCustomfieldReloadTemplateRequest from a JSON string
core_customfield_reload_template_request_instance = CoreCustomfieldReloadTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCustomfieldReloadTemplateRequest.to_json())

# convert the object into a dict
core_customfield_reload_template_request_dict = core_customfield_reload_template_request_instance.to_dict()
# create an instance of CoreCustomfieldReloadTemplateRequest from a dict
core_customfield_reload_template_request_from_dict = CoreCustomfieldReloadTemplateRequest.from_dict(core_customfield_reload_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


