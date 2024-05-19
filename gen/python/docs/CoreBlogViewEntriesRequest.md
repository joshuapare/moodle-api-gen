# CoreBlogViewEntriesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[CoreBlogViewEntriesRequestFiltersInner]**](CoreBlogViewEntriesRequestFiltersInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_blog_view_entries_request import CoreBlogViewEntriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlogViewEntriesRequest from a JSON string
core_blog_view_entries_request_instance = CoreBlogViewEntriesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBlogViewEntriesRequest.to_json())

# convert the object into a dict
core_blog_view_entries_request_dict = core_blog_view_entries_request_instance.to_dict()
# create an instance of CoreBlogViewEntriesRequest from a dict
core_blog_view_entries_request_from_dict = CoreBlogViewEntriesRequest.from_dict(core_blog_view_entries_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


