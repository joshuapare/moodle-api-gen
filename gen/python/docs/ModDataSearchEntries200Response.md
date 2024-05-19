# ModDataSearchEntries200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entries** | [**List[ModDataSearchEntries200ResponseEntriesInner]**](ModDataSearchEntries200ResponseEntriesInner.md) |  | 
**listviewcontents** | **str** | The list view contents as is rendered in the site. | [optional] 
**maxcount** | **int** | Total count of records that the user could see in the database                     (if all the search criterias were removed). | [optional] [default to null]
**totalcount** | **int** | Total count of records returned by the search. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_data_search_entries200_response import ModDataSearchEntries200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataSearchEntries200Response from a JSON string
mod_data_search_entries200_response_instance = ModDataSearchEntries200Response.from_json(json)
# print the JSON string representation of the object
print(ModDataSearchEntries200Response.to_json())

# convert the object into a dict
mod_data_search_entries200_response_dict = mod_data_search_entries200_response_instance.to_dict()
# create an instance of ModDataSearchEntries200Response from a dict
mod_data_search_entries200_response_from_dict = ModDataSearchEntries200Response.from_dict(mod_data_search_entries200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


