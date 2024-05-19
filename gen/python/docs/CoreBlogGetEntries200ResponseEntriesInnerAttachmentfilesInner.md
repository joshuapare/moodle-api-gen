# CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **str** | File name. | [optional] [default to 'null']
**filepath** | **str** | File path. | [optional] [default to 'null']
**filesize** | **int** | File size. | [optional] [default to null]
**fileurl** | **str** | Downloadable file url. | [optional] [default to 'null']
**isexternalfile** | **bool** | Whether is an external file. | [optional] [default to False]
**mimetype** | **str** | File mime type. | [optional] [default to 'null']
**repositorytype** | **str** | The repository type for the external files. | [optional] [default to 'null']
**timemodified** | **int** | Time modified. | [optional] [default to null]

## Example

```python
from openapi_client.models.core_blog_get_entries200_response_entries_inner_attachmentfiles_inner import CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner from a JSON string
core_blog_get_entries200_response_entries_inner_attachmentfiles_inner_instance = CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner.from_json(json)
# print the JSON string representation of the object
print(CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner.to_json())

# convert the object into a dict
core_blog_get_entries200_response_entries_inner_attachmentfiles_inner_dict = core_blog_get_entries200_response_entries_inner_attachmentfiles_inner_instance.to_dict()
# create an instance of CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner from a dict
core_blog_get_entries200_response_entries_inner_attachmentfiles_inner_from_dict = CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner.from_dict(core_blog_get_entries200_response_entries_inner_attachmentfiles_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


