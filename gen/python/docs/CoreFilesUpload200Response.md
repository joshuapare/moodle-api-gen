# CoreFilesUpload200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** |  | 
**contextid** | **int** |  | 
**filearea** | **str** |  | 
**filename** | **str** |  | 
**filepath** | **str** |  | 
**itemid** | **int** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.core_files_upload200_response import CoreFilesUpload200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFilesUpload200Response from a JSON string
core_files_upload200_response_instance = CoreFilesUpload200Response.from_json(json)
# print the JSON string representation of the object
print(CoreFilesUpload200Response.to_json())

# convert the object into a dict
core_files_upload200_response_dict = core_files_upload200_response_instance.to_dict()
# create an instance of CoreFilesUpload200Response from a dict
core_files_upload200_response_from_dict = CoreFilesUpload200Response.from_dict(core_files_upload200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


