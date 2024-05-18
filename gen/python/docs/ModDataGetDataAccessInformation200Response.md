# ModDataGetDataAccessInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canaddentry** | **bool** | Whether the user can add entries or not. | [default to False]
**canapprove** | **bool** | Whether the user can approve entries or not. | [default to False]
**canmanageentries** | **bool** | Whether the user can manage entries or not. | [default to False]
**entrieslefttoadd** | **int** | The number of entries left to complete the activity. | [default to null]
**entrieslefttoview** | **int** | The number of entries left to view other users entries. | [default to null]
**groupid** | **int** | User current group id (calculated) | [default to null]
**inreadonlyperiod** | **bool** | Whether the database is in read mode only. | [default to False]
**numentries** | **int** | The number of entries the current user added. | [default to null]
**timeavailable** | **bool** | Whether the database is available or not by time restrictions. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_data_get_data_access_information200_response import ModDataGetDataAccessInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetDataAccessInformation200Response from a JSON string
mod_data_get_data_access_information200_response_instance = ModDataGetDataAccessInformation200Response.from_json(json)
# print the JSON string representation of the object
print(ModDataGetDataAccessInformation200Response.to_json())

# convert the object into a dict
mod_data_get_data_access_information200_response_dict = mod_data_get_data_access_information200_response_instance.to_dict()
# create an instance of ModDataGetDataAccessInformation200Response from a dict
mod_data_get_data_access_information200_response_from_dict = ModDataGetDataAccessInformation200Response.from_dict(mod_data_get_data_access_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


