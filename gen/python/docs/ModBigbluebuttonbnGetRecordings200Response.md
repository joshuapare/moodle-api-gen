# ModBigbluebuttonbnGetRecordings200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | Whether the fetch was successful | [default to False]
**tabledata** | [**ModBigbluebuttonbnGetRecordings200ResponseTabledata**](ModBigbluebuttonbnGetRecordings200ResponseTabledata.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_bigbluebuttonbn_get_recordings200_response import ModBigbluebuttonbnGetRecordings200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModBigbluebuttonbnGetRecordings200Response from a JSON string
mod_bigbluebuttonbn_get_recordings200_response_instance = ModBigbluebuttonbnGetRecordings200Response.from_json(json)
# print the JSON string representation of the object
print(ModBigbluebuttonbnGetRecordings200Response.to_json())

# convert the object into a dict
mod_bigbluebuttonbn_get_recordings200_response_dict = mod_bigbluebuttonbn_get_recordings200_response_instance.to_dict()
# create an instance of ModBigbluebuttonbnGetRecordings200Response from a dict
mod_bigbluebuttonbn_get_recordings200_response_from_dict = ModBigbluebuttonbnGetRecordings200Response.from_dict(mod_bigbluebuttonbn_get_recordings200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


