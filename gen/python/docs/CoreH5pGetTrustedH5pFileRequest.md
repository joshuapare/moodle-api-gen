# CoreH5pGetTrustedH5pFileRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**copyright** | **int** | The copyright option | [optional] [default to 0]
**embed** | **int** | The embed allow to copy the code to your site | [optional] [default to 0]
**export** | **int** | The export allow to download the package | [optional] [default to 0]
**frame** | **int** | The frame allow to show the bar options below the content | [optional] [default to 0]
**url** | **str** | H5P file url. | [default to 'null']

## Example

```python
from openapi_client.models.core_h5p_get_trusted_h5p_file_request import CoreH5pGetTrustedH5pFileRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreH5pGetTrustedH5pFileRequest from a JSON string
core_h5p_get_trusted_h5p_file_request_instance = CoreH5pGetTrustedH5pFileRequest.from_json(json)
# print the JSON string representation of the object
print(CoreH5pGetTrustedH5pFileRequest.to_json())

# convert the object into a dict
core_h5p_get_trusted_h5p_file_request_dict = core_h5p_get_trusted_h5p_file_request_instance.to_dict()
# create an instance of CoreH5pGetTrustedH5pFileRequest from a dict
core_h5p_get_trusted_h5p_file_request_from_dict = CoreH5pGetTrustedH5pFileRequest.from_dict(core_h5p_get_trusted_h5p_file_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


