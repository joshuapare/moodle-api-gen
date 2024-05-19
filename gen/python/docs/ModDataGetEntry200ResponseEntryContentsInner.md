# ModDataGetEntry200ResponseEntryContentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | Contents. | [optional] 
**content1** | **str** | Contents. | [optional] 
**content2** | **str** | Contents. | [optional] 
**content3** | **str** | Contents. | [optional] 
**content4** | **str** | Contents. | [optional] 
**fieldid** | **int** | The field type of the content. | [optional] [default to 0]
**files** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**id** | **int** | Content id. | [optional] 
**recordid** | **int** | The record this content belongs to. | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_data_get_entry200_response_entry_contents_inner import ModDataGetEntry200ResponseEntryContentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetEntry200ResponseEntryContentsInner from a JSON string
mod_data_get_entry200_response_entry_contents_inner_instance = ModDataGetEntry200ResponseEntryContentsInner.from_json(json)
# print the JSON string representation of the object
print(ModDataGetEntry200ResponseEntryContentsInner.to_json())

# convert the object into a dict
mod_data_get_entry200_response_entry_contents_inner_dict = mod_data_get_entry200_response_entry_contents_inner_instance.to_dict()
# create an instance of ModDataGetEntry200ResponseEntryContentsInner from a dict
mod_data_get_entry200_response_entry_contents_inner_from_dict = ModDataGetEntry200ResponseEntryContentsInner.from_dict(mod_data_get_entry200_response_entry_contents_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


