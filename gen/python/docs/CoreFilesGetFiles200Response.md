# CoreFilesGetFiles200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**files** | [**List[CoreFilesGetFiles200ResponseFilesInner]**](CoreFilesGetFiles200ResponseFilesInner.md) |  | 
**parents** | [**List[CoreFilesGetFiles200ResponseParentsInner]**](CoreFilesGetFiles200ResponseParentsInner.md) |  | 

## Example

```python
from openapi_client.models.core_files_get_files200_response import CoreFilesGetFiles200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFilesGetFiles200Response from a JSON string
core_files_get_files200_response_instance = CoreFilesGetFiles200Response.from_json(json)
# print the JSON string representation of the object
print(CoreFilesGetFiles200Response.to_json())

# convert the object into a dict
core_files_get_files200_response_dict = core_files_get_files200_response_instance.to_dict()
# create an instance of CoreFilesGetFiles200Response from a dict
core_files_get_files200_response_from_dict = CoreFilesGetFiles200Response.from_dict(core_files_get_files200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

