# ModDataGetEntry200ResponseEntry


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | **bool** | Whether the entry has been approved (if the database is configured in that way). | [default to False]
**canmanageentry** | **bool** | Whether the current user can manage this entry | 
**contents** | [**List[ModDataGetEntry200ResponseEntryContentsInner]**](ModDataGetEntry200ResponseEntryContentsInner.md) |  | [optional] 
**dataid** | **int** | The database id this record belongs to. | [default to 0]
**fullname** | **str** | The user who created the entry fullname. | [optional] 
**groupid** | **int** | The group id this record belongs to (0 for no groups). | [default to 0]
**id** | **int** | Record id. | 
**tags** | [**List[ModDataGetEntries200ResponseEntriesInnerTagsInner]**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**timecreated** | **int** | Time the record was created. | [default to 0]
**timemodified** | **int** | Last time the record was modified. | [default to 0]
**userid** | **int** | The id of the user who created the record. | [default to 0]

## Example

```python
from openapi_client.models.mod_data_get_entry200_response_entry import ModDataGetEntry200ResponseEntry

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetEntry200ResponseEntry from a JSON string
mod_data_get_entry200_response_entry_instance = ModDataGetEntry200ResponseEntry.from_json(json)
# print the JSON string representation of the object
print(ModDataGetEntry200ResponseEntry.to_json())

# convert the object into a dict
mod_data_get_entry200_response_entry_dict = mod_data_get_entry200_response_entry_instance.to_dict()
# create an instance of ModDataGetEntry200ResponseEntry from a dict
mod_data_get_entry200_response_entry_from_dict = ModDataGetEntry200ResponseEntry.from_dict(mod_data_get_entry200_response_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


