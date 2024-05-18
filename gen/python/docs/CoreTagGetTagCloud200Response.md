# CoreTagGetTagCloud200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | [**List[CoreTagGetTagCloud200ResponseTagsInner]**](CoreTagGetTagCloud200ResponseTagsInner.md) |  | 
**tagscount** | **int** | Number of tags returned. | [default to null]
**totalcount** | **int** | Total count of tags. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_tag_get_tag_cloud200_response import CoreTagGetTagCloud200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTagCloud200Response from a JSON string
core_tag_get_tag_cloud200_response_instance = CoreTagGetTagCloud200Response.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTagCloud200Response.to_json())

# convert the object into a dict
core_tag_get_tag_cloud200_response_dict = core_tag_get_tag_cloud200_response_instance.to_dict()
# create an instance of CoreTagGetTagCloud200Response from a dict
core_tag_get_tag_cloud200_response_from_dict = CoreTagGetTagCloud200Response.from_dict(core_tag_get_tag_cloud200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

