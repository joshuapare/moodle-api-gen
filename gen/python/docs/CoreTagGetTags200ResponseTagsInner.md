# CoreTagGetTags200ResponseTagsInner

information about one tag

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | tag description | [optional] [default to 'null']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**flag** | **int** | flag | [optional] [default to null]
**id** | **int** | tag id | [optional] 
**isstandard** | **int** | whether this flag is standard | [optional] [default to null]
**name** | **str** | name | [optional] 
**official** | **int** | whether this flag is standard (deprecated, use isstandard) | [optional] [default to null]
**rawname** | **str** | tag raw name (may contain capital letters) | [optional] [default to 'null']
**tagcollid** | **int** | tag collection id | [optional] 
**viewurl** | **str** | URL to view | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_tag_get_tags200_response_tags_inner import CoreTagGetTags200ResponseTagsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTags200ResponseTagsInner from a JSON string
core_tag_get_tags200_response_tags_inner_instance = CoreTagGetTags200ResponseTagsInner.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTags200ResponseTagsInner.to_json())

# convert the object into a dict
core_tag_get_tags200_response_tags_inner_dict = core_tag_get_tags200_response_tags_inner_instance.to_dict()
# create an instance of CoreTagGetTags200ResponseTagsInner from a dict
core_tag_get_tags200_response_tags_inner_from_dict = CoreTagGetTags200ResponseTagsInner.from_dict(core_tag_get_tags200_response_tags_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


