# CoreDynamicTabsGetContent200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | JSON-encoded data for template | [default to 'null']
**javascript** | **str** | JavaScript fragment | [default to 'null']
**template** | **str** | Template name | [default to 'null']

## Example

```python
from openapi_client.models.core_dynamic_tabs_get_content200_response import CoreDynamicTabsGetContent200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreDynamicTabsGetContent200Response from a JSON string
core_dynamic_tabs_get_content200_response_instance = CoreDynamicTabsGetContent200Response.from_json(json)
# print the JSON string representation of the object
print(CoreDynamicTabsGetContent200Response.to_json())

# convert the object into a dict
core_dynamic_tabs_get_content200_response_dict = core_dynamic_tabs_get_content200_response_instance.to_dict()
# create an instance of CoreDynamicTabsGetContent200Response from a dict
core_dynamic_tabs_get_content200_response_from_dict = CoreDynamicTabsGetContent200Response.from_dict(core_dynamic_tabs_get_content200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


