# ModDataGetEntries200ResponseEntriesInnerTagsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flag** | **int** | Whether the tag is flagged as inappropriate. | [optional] [default to 0]
**id** | **int** | Tag id. | [optional] 
**isstandard** | **bool** | Whether this tag is standard. | [optional] [default to False]
**itemid** | **int** | Id of the record tagged. | [optional] 
**name** | **str** | Tag name. | [optional] 
**ordering** | **int** | Tag ordering. | [optional] 
**rawname** | **str** | The raw, unnormalised name for the tag as entered by users. | [optional] 
**tagcollid** | **int** | Tag collection id. | [optional] 
**taginstancecontextid** | **int** | Context the tag instance belongs to. | [optional] 
**taginstanceid** | **int** | Tag instance id. | [optional] 

## Example

```python
from openapi_client.models.mod_data_get_entries200_response_entries_inner_tags_inner import ModDataGetEntries200ResponseEntriesInnerTagsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetEntries200ResponseEntriesInnerTagsInner from a JSON string
mod_data_get_entries200_response_entries_inner_tags_inner_instance = ModDataGetEntries200ResponseEntriesInnerTagsInner.from_json(json)
# print the JSON string representation of the object
print(ModDataGetEntries200ResponseEntriesInnerTagsInner.to_json())

# convert the object into a dict
mod_data_get_entries200_response_entries_inner_tags_inner_dict = mod_data_get_entries200_response_entries_inner_tags_inner_instance.to_dict()
# create an instance of ModDataGetEntries200ResponseEntriesInnerTagsInner from a dict
mod_data_get_entries200_response_entries_inner_tags_inner_from_dict = ModDataGetEntries200ResponseEntriesInnerTagsInner.from_dict(mod_data_get_entries200_response_entries_inner_tags_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


