# CoreDynamicTabsGetContentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jsondata** | **str** | Json-encoded data | [default to 'null']
**tab** | **str** | Tab class | [default to 'null']

## Example

```python
from openapi_client.models.core_dynamic_tabs_get_content_request import CoreDynamicTabsGetContentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreDynamicTabsGetContentRequest from a JSON string
core_dynamic_tabs_get_content_request_instance = CoreDynamicTabsGetContentRequest.from_json(json)
# print the JSON string representation of the object
print(CoreDynamicTabsGetContentRequest.to_json())

# convert the object into a dict
core_dynamic_tabs_get_content_request_dict = core_dynamic_tabs_get_content_request_instance.to_dict()
# create an instance of CoreDynamicTabsGetContentRequest from a dict
core_dynamic_tabs_get_content_request_from_dict = CoreDynamicTabsGetContentRequest.from_dict(core_dynamic_tabs_get_content_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


