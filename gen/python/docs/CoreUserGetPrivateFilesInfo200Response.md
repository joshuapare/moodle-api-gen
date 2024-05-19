# CoreUserGetPrivateFilesInfo200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filecount** | **int** | Number of files in the area. | [default to null]
**filesize** | **int** | Total size of the files in the area. | [default to null]
**filesizewithoutreferences** | **int** | Total size of the area excluding file references | [default to null]
**foldercount** | **int** | Number of folders in the area. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_user_get_private_files_info200_response import CoreUserGetPrivateFilesInfo200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserGetPrivateFilesInfo200Response from a JSON string
core_user_get_private_files_info200_response_instance = CoreUserGetPrivateFilesInfo200Response.from_json(json)
# print the JSON string representation of the object
print(CoreUserGetPrivateFilesInfo200Response.to_json())

# convert the object into a dict
core_user_get_private_files_info200_response_dict = core_user_get_private_files_info200_response_instance.to_dict()
# create an instance of CoreUserGetPrivateFilesInfo200Response from a dict
core_user_get_private_files_info200_response_from_dict = CoreUserGetPrivateFilesInfo200Response.from_dict(core_user_get_private_files_info200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


