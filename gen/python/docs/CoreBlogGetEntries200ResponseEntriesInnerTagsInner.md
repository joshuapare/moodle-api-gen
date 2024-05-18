# CoreBlogGetEntries200ResponseEntriesInnerTagsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flag** | **int** | Whether the tag is flagged as inappropriate. | [optional] [default to 0]
**id** | **int** | Tag id. | [optional] [default to null]
**isstandard** | **bool** | Whether this tag is standard. | [optional] [default to False]
**itemid** | **int** | Id of the record tagged. | [optional] [default to null]
**name** | **str** | Tag name. | [optional] [default to 'null']
**ordering** | **int** | Tag ordering. | [optional] [default to null]
**rawname** | **str** | The raw, unnormalised name for the tag as entered by users. | [optional] [default to 'null']
**tagcollid** | **int** | Tag collection id. | [optional] [default to null]
**taginstancecontextid** | **int** | Context the tag instance belongs to. | [optional] [default to null]
**taginstanceid** | **int** | Tag instance id. | [optional] [default to null]

## Example

```python
from openapi_client.models.core_blog_get_entries200_response_entries_inner_tags_inner import CoreBlogGetEntries200ResponseEntriesInnerTagsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlogGetEntries200ResponseEntriesInnerTagsInner from a JSON string
core_blog_get_entries200_response_entries_inner_tags_inner_instance = CoreBlogGetEntries200ResponseEntriesInnerTagsInner.from_json(json)
# print the JSON string representation of the object
print(CoreBlogGetEntries200ResponseEntriesInnerTagsInner.to_json())

# convert the object into a dict
core_blog_get_entries200_response_entries_inner_tags_inner_dict = core_blog_get_entries200_response_entries_inner_tags_inner_instance.to_dict()
# create an instance of CoreBlogGetEntries200ResponseEntriesInnerTagsInner from a dict
core_blog_get_entries200_response_entries_inner_tags_inner_from_dict = CoreBlogGetEntries200ResponseEntriesInnerTagsInner.from_dict(core_blog_get_entries200_response_entries_inner_tags_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


