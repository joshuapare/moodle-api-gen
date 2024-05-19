# CoreBlogGetEntries200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entries** | [**List[CoreBlogGetEntries200ResponseEntriesInner]**](CoreBlogGetEntries200ResponseEntriesInner.md) |  | 
**totalentries** | **int** | The total number of entries found. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_blog_get_entries200_response import CoreBlogGetEntries200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlogGetEntries200Response from a JSON string
core_blog_get_entries200_response_instance = CoreBlogGetEntries200Response.from_json(json)
# print the JSON string representation of the object
print(CoreBlogGetEntries200Response.to_json())

# convert the object into a dict
core_blog_get_entries200_response_dict = core_blog_get_entries200_response_instance.to_dict()
# create an instance of CoreBlogGetEntries200Response from a dict
core_blog_get_entries200_response_from_dict = CoreBlogGetEntries200Response.from_dict(core_blog_get_entries200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


