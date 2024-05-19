# CoreFormGetFiletypesBrowserData200ResponseGroupsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expanded** | **bool** | Should the group start as expanded or collapsed | [optional] [default to False]
**ext** | **str** | The list of file extensions associated with the group | [optional] [default to 'null']
**key** | **str** | The file type group identifier | [optional] [default to 'null']
**name** | **str** | The file type group name | [optional] [default to 'null']
**selectable** | **bool** | Can it be marked as selected | [optional] [default to False]
**selected** | **bool** | Should it be marked as selected | [optional] [default to False]
**types** | [**List[CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner]**](CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_form_get_filetypes_browser_data200_response_groups_inner import CoreFormGetFiletypesBrowserData200ResponseGroupsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFormGetFiletypesBrowserData200ResponseGroupsInner from a JSON string
core_form_get_filetypes_browser_data200_response_groups_inner_instance = CoreFormGetFiletypesBrowserData200ResponseGroupsInner.from_json(json)
# print the JSON string representation of the object
print(CoreFormGetFiletypesBrowserData200ResponseGroupsInner.to_json())

# convert the object into a dict
core_form_get_filetypes_browser_data200_response_groups_inner_dict = core_form_get_filetypes_browser_data200_response_groups_inner_instance.to_dict()
# create an instance of CoreFormGetFiletypesBrowserData200ResponseGroupsInner from a dict
core_form_get_filetypes_browser_data200_response_groups_inner_from_dict = CoreFormGetFiletypesBrowserData200ResponseGroupsInner.from_dict(core_form_get_filetypes_browser_data200_response_groups_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


