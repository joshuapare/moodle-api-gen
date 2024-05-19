# ModDataSearchEntriesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advsearch** | [**List[ModDataSearchEntriesRequestAdvsearchInner]**](ModDataSearchEntriesRequestAdvsearchInner.md) |  | [optional] 
**databaseid** | **int** | data instance id | 
**groupid** | **int** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]
**order** | **str** | The direction of the sorting: &#39;ASC&#39; or &#39;DESC&#39;.                                                 Empty for using the default database setting. | [optional] 
**page** | **int** | The page of records to return. | [optional] [default to 0]
**perpage** | **int** | The number of records to return per page | [optional] [default to 0]
**returncontents** | **bool** | Whether to return contents or not. | [optional] [default to False]
**search** | **str** | search string (empty when using advanced) | [optional] [default to '']
**sort** | **int** | Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting. | [optional] 

## Example

```python
from openapi_client.models.mod_data_search_entries_request import ModDataSearchEntriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataSearchEntriesRequest from a JSON string
mod_data_search_entries_request_instance = ModDataSearchEntriesRequest.from_json(json)
# print the JSON string representation of the object
print(ModDataSearchEntriesRequest.to_json())

# convert the object into a dict
mod_data_search_entries_request_dict = mod_data_search_entries_request_instance.to_dict()
# create an instance of ModDataSearchEntriesRequest from a dict
mod_data_search_entries_request_from_dict = ModDataSearchEntriesRequest.from_dict(mod_data_search_entries_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


