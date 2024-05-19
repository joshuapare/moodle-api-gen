# CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **str** | File name. | [optional] 
**filepath** | **str** | File path. | [optional] 
**filesize** | **int** | File size. | [optional] 
**fileurl** | **str** | Downloadable file url. | [optional] 
**isexternalfile** | **bool** | Whether is an external file. | [optional] 
**mimetype** | **str** | File mime type. | [optional] 
**repositorytype** | **str** | The repository type for the external files. | [optional] 
**timemodified** | **int** | Time modified. | [optional] 

## Example

```python
from openapi_client.models.core_blog_get_entries200_response_entries_inner_summaryfiles_inner import CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner from a JSON string
core_blog_get_entries200_response_entries_inner_summaryfiles_inner_instance = CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.from_json(json)
# print the JSON string representation of the object
print(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.to_json())

# convert the object into a dict
core_blog_get_entries200_response_entries_inner_summaryfiles_inner_dict = core_blog_get_entries200_response_entries_inner_summaryfiles_inner_instance.to_dict()
# create an instance of CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner from a dict
core_blog_get_entries200_response_entries_inner_summaryfiles_inner_from_dict = CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.from_dict(core_blog_get_entries200_response_entries_inner_summaryfiles_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


