# ModImscpGetImscpsByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**imscps** | [**List[ModImscpGetImscpsByCourses200ResponseImscpsInner]**](ModImscpGetImscpsByCourses200ResponseImscpsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_imscp_get_imscps_by_courses200_response import ModImscpGetImscpsByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModImscpGetImscpsByCourses200Response from a JSON string
mod_imscp_get_imscps_by_courses200_response_instance = ModImscpGetImscpsByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModImscpGetImscpsByCourses200Response.to_json())

# convert the object into a dict
mod_imscp_get_imscps_by_courses200_response_dict = mod_imscp_get_imscps_by_courses200_response_instance.to_dict()
# create an instance of ModImscpGetImscpsByCourses200Response from a dict
mod_imscp_get_imscps_by_courses200_response_from_dict = ModImscpGetImscpsByCourses200Response.from_dict(mod_imscp_get_imscps_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


