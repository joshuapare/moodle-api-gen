# ModPageGetPagesByCourses200ResponsePagesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | Page content | [optional] [default to 'null']
**contentfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**contentformat** | **int** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**display** | **int** | How to display the page | [optional] [default to null]
**displayoptions** | **str** | Display options (width, height) | [optional] [default to 'null']
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**legacyfiles** | **int** | Legacy files flag | [optional] [default to null]
**legacyfileslast** | **int** | Legacy files last control flag | [optional] [default to null]
**name** | **str** | Activity name | [optional] 
**revision** | **int** | Incremented when after each file changes, to avoid cache | [optional] 
**section** | **int** | Course section id | [optional] 
**timemodified** | **int** | Last time the page was modified | [optional] [default to null]
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_page_get_pages_by_courses200_response_pages_inner import ModPageGetPagesByCourses200ResponsePagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModPageGetPagesByCourses200ResponsePagesInner from a JSON string
mod_page_get_pages_by_courses200_response_pages_inner_instance = ModPageGetPagesByCourses200ResponsePagesInner.from_json(json)
# print the JSON string representation of the object
print(ModPageGetPagesByCourses200ResponsePagesInner.to_json())

# convert the object into a dict
mod_page_get_pages_by_courses200_response_pages_inner_dict = mod_page_get_pages_by_courses200_response_pages_inner_instance.to_dict()
# create an instance of ModPageGetPagesByCourses200ResponsePagesInner from a dict
mod_page_get_pages_by_courses200_response_pages_inner_from_dict = ModPageGetPagesByCourses200ResponsePagesInner.from_dict(mod_page_get_pages_by_courses200_response_pages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


