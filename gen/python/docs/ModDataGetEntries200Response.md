# ModDataGetEntries200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entries** | [**List[ModDataGetEntries200ResponseEntriesInner]**](ModDataGetEntries200ResponseEntriesInner.md) |  | 
**listviewcontents** | **str** | The list view contents as is rendered in the site. | [optional] [default to 'null']
**totalcount** | **int** | Total count of records. | [default to null]
**totalfilesize** | **int** | Total size (bytes) of the files included in the records. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_data_get_entries200_response import ModDataGetEntries200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetEntries200Response from a JSON string
mod_data_get_entries200_response_instance = ModDataGetEntries200Response.from_json(json)
# print the JSON string representation of the object
print(ModDataGetEntries200Response.to_json())

# convert the object into a dict
mod_data_get_entries200_response_dict = mod_data_get_entries200_response_instance.to_dict()
# create an instance of ModDataGetEntries200Response from a dict
mod_data_get_entries200_response_from_dict = ModDataGetEntries200Response.from_dict(mod_data_get_entries200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


