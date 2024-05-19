# CoreFormGetFiletypesBrowserDataRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowall** | **bool** | Allows to select All file types, does not apply with onlytypes are set. | [optional] [default to True]
**current** | **str** | Current types that should be selected. | [optional] [default to '']
**onlytypes** | **str** | Limit the browser to the given groups and extensions | [optional] [default to '']

## Example

```python
from openapi_client.models.core_form_get_filetypes_browser_data_request import CoreFormGetFiletypesBrowserDataRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFormGetFiletypesBrowserDataRequest from a JSON string
core_form_get_filetypes_browser_data_request_instance = CoreFormGetFiletypesBrowserDataRequest.from_json(json)
# print the JSON string representation of the object
print(CoreFormGetFiletypesBrowserDataRequest.to_json())

# convert the object into a dict
core_form_get_filetypes_browser_data_request_dict = core_form_get_filetypes_browser_data_request_instance.to_dict()
# create an instance of CoreFormGetFiletypesBrowserDataRequest from a dict
core_form_get_filetypes_browser_data_request_from_dict = CoreFormGetFiletypesBrowserDataRequest.from_dict(core_form_get_filetypes_browser_data_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


