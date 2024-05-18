# ModDataGetEntries200ResponseEntriesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | **bool** | Whether the entry has been approved (if the database is configured in that way). | [optional] [default to False]
**canmanageentry** | **bool** | Whether the current user can manage this entry | [optional] [default to False]
**contents** | [**List[ModDataGetEntries200ResponseEntriesInnerContentsInner]**](ModDataGetEntries200ResponseEntriesInnerContentsInner.md) |  | [optional] 
**dataid** | **int** | The database id this record belongs to. | [optional] [default to 0]
**fullname** | **str** | The user who created the entry fullname. | [optional] [default to 'null']
**groupid** | **int** | The group id this record belongs to (0 for no groups). | [optional] [default to 0]
**id** | **int** | Record id. | [optional] [default to null]
**tags** | [**List[ModDataGetEntries200ResponseEntriesInnerTagsInner]**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**timecreated** | **int** | Time the record was created. | [optional] [default to 0]
**timemodified** | **int** | Last time the record was modified. | [optional] [default to 0]
**userid** | **int** | The id of the user who created the record. | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_data_get_entries200_response_entries_inner import ModDataGetEntries200ResponseEntriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetEntries200ResponseEntriesInner from a JSON string
mod_data_get_entries200_response_entries_inner_instance = ModDataGetEntries200ResponseEntriesInner.from_json(json)
# print the JSON string representation of the object
print(ModDataGetEntries200ResponseEntriesInner.to_json())

# convert the object into a dict
mod_data_get_entries200_response_entries_inner_dict = mod_data_get_entries200_response_entries_inner_instance.to_dict()
# create an instance of ModDataGetEntries200ResponseEntriesInner from a dict
mod_data_get_entries200_response_entries_inner_from_dict = ModDataGetEntries200ResponseEntriesInner.from_dict(mod_data_get_entries200_response_entries_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


