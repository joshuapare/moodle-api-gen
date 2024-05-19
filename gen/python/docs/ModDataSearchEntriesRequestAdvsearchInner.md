# ModDataSearchEntriesRequestAdvsearchInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Field key for search.                                                             Use fn or ln for first or last name | [optional] [default to 'null']
**value** | **str** | JSON encoded value for search | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_data_search_entries_request_advsearch_inner import ModDataSearchEntriesRequestAdvsearchInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataSearchEntriesRequestAdvsearchInner from a JSON string
mod_data_search_entries_request_advsearch_inner_instance = ModDataSearchEntriesRequestAdvsearchInner.from_json(json)
# print the JSON string representation of the object
print(ModDataSearchEntriesRequestAdvsearchInner.to_json())

# convert the object into a dict
mod_data_search_entries_request_advsearch_inner_dict = mod_data_search_entries_request_advsearch_inner_instance.to_dict()
# create an instance of ModDataSearchEntriesRequestAdvsearchInner from a dict
mod_data_search_entries_request_advsearch_inner_from_dict = ModDataSearchEntriesRequestAdvsearchInner.from_dict(mod_data_search_entries_request_advsearch_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


