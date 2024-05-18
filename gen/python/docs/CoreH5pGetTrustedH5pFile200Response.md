# CoreH5pGetTrustedH5pFile200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**files** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_h5p_get_trusted_h5p_file200_response import CoreH5pGetTrustedH5pFile200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreH5pGetTrustedH5pFile200Response from a JSON string
core_h5p_get_trusted_h5p_file200_response_instance = CoreH5pGetTrustedH5pFile200Response.from_json(json)
# print the JSON string representation of the object
print(CoreH5pGetTrustedH5pFile200Response.to_json())

# convert the object into a dict
core_h5p_get_trusted_h5p_file200_response_dict = core_h5p_get_trusted_h5p_file200_response_instance.to_dict()
# create an instance of CoreH5pGetTrustedH5pFile200Response from a dict
core_h5p_get_trusted_h5p_file200_response_from_dict = CoreH5pGetTrustedH5pFile200Response.from_dict(core_h5p_get_trusted_h5p_file200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


