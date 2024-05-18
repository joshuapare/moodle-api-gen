# CoreTagGetTagsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | [**List[CoreTagGetTagsRequestTagsInner]**](CoreTagGetTagsRequestTagsInner.md) |  | 

## Example

```python
from openapi_client.models.core_tag_get_tags_request import CoreTagGetTagsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTagsRequest from a JSON string
core_tag_get_tags_request_instance = CoreTagGetTagsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTagsRequest.to_json())

# convert the object into a dict
core_tag_get_tags_request_dict = core_tag_get_tags_request_instance.to_dict()
# create an instance of CoreTagGetTagsRequest from a dict
core_tag_get_tags_request_from_dict = CoreTagGetTagsRequest.from_dict(core_tag_get_tags_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


