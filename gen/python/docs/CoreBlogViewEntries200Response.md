# CoreBlogViewEntries200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | status: true if success | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_blog_view_entries200_response import CoreBlogViewEntries200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlogViewEntries200Response from a JSON string
core_blog_view_entries200_response_instance = CoreBlogViewEntries200Response.from_json(json)
# print the JSON string representation of the object
print(CoreBlogViewEntries200Response.to_json())

# convert the object into a dict
core_blog_view_entries200_response_dict = core_blog_view_entries200_response_instance.to_dict()
# create an instance of CoreBlogViewEntries200Response from a dict
core_blog_view_entries200_response_from_dict = CoreBlogViewEntries200Response.from_dict(core_blog_view_entries200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


