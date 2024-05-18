# CoreTagGetTagCloud200ResponseTagsInner

Tags.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | Number of tag instances. | [optional] [default to null]
**flag** | **bool** | Whether the tag is flagged as inappropriate. | [optional] [default to False]
**isstandard** | **bool** | Whether is a standard tag or not. | [optional] [default to False]
**name** | **str** | Tag name. | [optional] [default to 'null']
**size** | **int** | Proportional size to display the tag. | [optional] [default to null]
**viewurl** | **str** | URL to view the tag index. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_tag_get_tag_cloud200_response_tags_inner import CoreTagGetTagCloud200ResponseTagsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTagCloud200ResponseTagsInner from a JSON string
core_tag_get_tag_cloud200_response_tags_inner_instance = CoreTagGetTagCloud200ResponseTagsInner.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTagCloud200ResponseTagsInner.to_json())

# convert the object into a dict
core_tag_get_tag_cloud200_response_tags_inner_dict = core_tag_get_tag_cloud200_response_tags_inner_instance.to_dict()
# create an instance of CoreTagGetTagCloud200ResponseTagsInner from a dict
core_tag_get_tag_cloud200_response_tags_inner_from_dict = CoreTagGetTagCloud200ResponseTagsInner.from_dict(core_tag_get_tag_cloud200_response_tags_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


