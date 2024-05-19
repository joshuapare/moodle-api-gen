# CoreBlogGetEntriesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[CoreBlogGetEntriesRequestFiltersInner]**](CoreBlogGetEntriesRequestFiltersInner.md) |  | [optional] 
**page** | **int** | The blog page to return. | [optional] [default to 0]
**perpage** | **int** | The number of posts to return per page. | [optional] [default to 10]

## Example

```python
from openapi_client.models.core_blog_get_entries_request import CoreBlogGetEntriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlogGetEntriesRequest from a JSON string
core_blog_get_entries_request_instance = CoreBlogGetEntriesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBlogGetEntriesRequest.to_json())

# convert the object into a dict
core_blog_get_entries_request_dict = core_blog_get_entries_request_instance.to_dict()
# create an instance of CoreBlogGetEntriesRequest from a dict
core_blog_get_entries_request_from_dict = CoreBlogGetEntriesRequest.from_dict(core_blog_get_entries_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


