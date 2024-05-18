# CoreTagUpdateTagsRequestTagsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | tag description | [optional] 
**descriptionformat** | **int** | tag description format | [optional] [default to null]
**flag** | **int** | flag | [optional] 
**id** | **int** | tag id | [optional] 
**isstandard** | **int** | whether this flag is standard | [optional] 
**official** | **int** | (deprecated, use isstandard) whether this flag is standard | [optional] [default to null]
**rawname** | **str** | tag raw name (may contain capital letters) | [optional] 

## Example

```python
from openapi_client.models.core_tag_update_tags_request_tags_inner import CoreTagUpdateTagsRequestTagsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagUpdateTagsRequestTagsInner from a JSON string
core_tag_update_tags_request_tags_inner_instance = CoreTagUpdateTagsRequestTagsInner.from_json(json)
# print the JSON string representation of the object
print(CoreTagUpdateTagsRequestTagsInner.to_json())

# convert the object into a dict
core_tag_update_tags_request_tags_inner_dict = core_tag_update_tags_request_tags_inner_instance.to_dict()
# create an instance of CoreTagUpdateTagsRequestTagsInner from a dict
core_tag_update_tags_request_tags_inner_from_dict = CoreTagUpdateTagsRequestTagsInner.from_dict(core_tag_update_tags_request_tags_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


