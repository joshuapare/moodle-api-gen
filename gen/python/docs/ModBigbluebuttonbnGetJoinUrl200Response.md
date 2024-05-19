# ModBigbluebuttonbnGetJoinUrl200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**join_url** | **str** | Can join session | [optional] [default to 'null']
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_bigbluebuttonbn_get_join_url200_response import ModBigbluebuttonbnGetJoinUrl200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModBigbluebuttonbnGetJoinUrl200Response from a JSON string
mod_bigbluebuttonbn_get_join_url200_response_instance = ModBigbluebuttonbnGetJoinUrl200Response.from_json(json)
# print the JSON string representation of the object
print(ModBigbluebuttonbnGetJoinUrl200Response.to_json())

# convert the object into a dict
mod_bigbluebuttonbn_get_join_url200_response_dict = mod_bigbluebuttonbn_get_join_url200_response_instance.to_dict()
# create an instance of ModBigbluebuttonbnGetJoinUrl200Response from a dict
mod_bigbluebuttonbn_get_join_url200_response_from_dict = ModBigbluebuttonbnGetJoinUrl200Response.from_dict(mod_bigbluebuttonbn_get_join_url200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


