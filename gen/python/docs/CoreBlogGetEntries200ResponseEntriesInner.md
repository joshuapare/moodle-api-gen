# CoreBlogGetEntries200ResponseEntriesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachment** | **str** | Post atachment. | [optional] [default to 'null']
**attachmentfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner.md) |  | [optional] 
**content** | **str** | Post content. | [optional] [default to 'null']
**courseid** | **int** | Course where the post was created. | [optional] [default to 0]
**coursemoduleid** | **int** | Course module id where the post was created. | [optional] [default to 0]
**created** | **int** | When it was created. | [optional] [default to 0]
**format** | **int** | Post content format. | [optional] [default to 0]
**groupid** | **int** | Group post was created for. | [optional] [default to 0]
**id** | **int** | Post/entry id. | [optional] [default to null]
**lastmodified** | **int** | When it was last modified. | [optional] [default to 0]
**module** | **str** | Where it was published the post (blog, blog_external...). | [optional] [default to 'null']
**moduleid** | **int** | Module id where the post was created (not used anymore). | [optional] [default to 0]
**publishstate** | **str** | Post publish state. | [optional] [default to 'draft']
**rating** | **int** | Post rating. | [optional] [default to 0]
**subject** | **str** | Post subject. | [optional] [default to 'null']
**summary** | **str** | Post summary. | [optional] [default to 'null']
**summaryfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**summaryformat** | **int** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**tags** | [**List[CoreBlogGetEntries200ResponseEntriesInnerTagsInner]**](CoreBlogGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**uniquehash** | **str** | Post unique hash. | [optional] [default to 'null']
**userid** | **int** | Post author. | [optional] [default to 0]
**usermodified** | **int** | User that updated the post. | [optional] [default to null]

## Example

```python
from openapi_client.models.core_blog_get_entries200_response_entries_inner import CoreBlogGetEntries200ResponseEntriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlogGetEntries200ResponseEntriesInner from a JSON string
core_blog_get_entries200_response_entries_inner_instance = CoreBlogGetEntries200ResponseEntriesInner.from_json(json)
# print the JSON string representation of the object
print(CoreBlogGetEntries200ResponseEntriesInner.to_json())

# convert the object into a dict
core_blog_get_entries200_response_entries_inner_dict = core_blog_get_entries200_response_entries_inner_instance.to_dict()
# create an instance of CoreBlogGetEntries200ResponseEntriesInner from a dict
core_blog_get_entries200_response_entries_inner_from_dict = CoreBlogGetEntries200ResponseEntriesInner.from_dict(core_blog_get_entries200_response_entries_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


