# ModBigbluebuttonbnGetRecordingsToImport200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | Whether the fetch was successful | 
**tabledata** | [**ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata**](ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_bigbluebuttonbn_get_recordings_to_import200_response import ModBigbluebuttonbnGetRecordingsToImport200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModBigbluebuttonbnGetRecordingsToImport200Response from a JSON string
mod_bigbluebuttonbn_get_recordings_to_import200_response_instance = ModBigbluebuttonbnGetRecordingsToImport200Response.from_json(json)
# print the JSON string representation of the object
print(ModBigbluebuttonbnGetRecordingsToImport200Response.to_json())

# convert the object into a dict
mod_bigbluebuttonbn_get_recordings_to_import200_response_dict = mod_bigbluebuttonbn_get_recordings_to_import200_response_instance.to_dict()
# create an instance of ModBigbluebuttonbnGetRecordingsToImport200Response from a dict
mod_bigbluebuttonbn_get_recordings_to_import200_response_from_dict = ModBigbluebuttonbnGetRecordingsToImport200Response.from_dict(mod_bigbluebuttonbn_get_recordings_to_import200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


