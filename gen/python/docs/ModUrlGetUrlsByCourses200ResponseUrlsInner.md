# ModUrlGetUrlsByCourses200ResponseUrlsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**display** | **int** | How to display the url | [optional] [default to null]
**displayoptions** | **str** | Display options (width, height) | [optional] 
**externalurl** | **str** | External URL | [optional] [default to 'null']
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**name** | **str** | Activity name | [optional] 
**parameters** | **str** | Parameters to append to the URL | [optional] [default to 'null']
**section** | **int** | Course section id | [optional] 
**timemodified** | **int** | Last time the url was modified | [optional] [default to null]
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_url_get_urls_by_courses200_response_urls_inner import ModUrlGetUrlsByCourses200ResponseUrlsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModUrlGetUrlsByCourses200ResponseUrlsInner from a JSON string
mod_url_get_urls_by_courses200_response_urls_inner_instance = ModUrlGetUrlsByCourses200ResponseUrlsInner.from_json(json)
# print the JSON string representation of the object
print(ModUrlGetUrlsByCourses200ResponseUrlsInner.to_json())

# convert the object into a dict
mod_url_get_urls_by_courses200_response_urls_inner_dict = mod_url_get_urls_by_courses200_response_urls_inner_instance.to_dict()
# create an instance of ModUrlGetUrlsByCourses200ResponseUrlsInner from a dict
mod_url_get_urls_by_courses200_response_urls_inner_from_dict = ModUrlGetUrlsByCourses200ResponseUrlsInner.from_dict(mod_url_get_urls_by_courses200_response_urls_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


