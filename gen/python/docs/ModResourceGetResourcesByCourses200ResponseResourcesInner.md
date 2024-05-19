# ModResourceGetResourcesByCourses200ResponseResourcesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**display** | **int** | How to display the resource | [optional] [default to null]
**displayoptions** | **str** | Display options (width, height) | [optional] 
**filterfiles** | **int** | If filters should be applied to the resource content | [optional] [default to null]
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**legacyfiles** | **int** | Legacy files flag | [optional] 
**legacyfileslast** | **int** | Legacy files last control flag | [optional] 
**name** | **str** | Activity name | [optional] 
**revision** | **int** | Incremented when after each file changes, to avoid cache | [optional] 
**section** | **int** | Course section id | [optional] 
**timemodified** | **int** | Last time the resource was modified | [optional] [default to null]
**tobemigrated** | **int** | Whether this resource was migrated | [optional] [default to null]
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_resource_get_resources_by_courses200_response_resources_inner import ModResourceGetResourcesByCourses200ResponseResourcesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModResourceGetResourcesByCourses200ResponseResourcesInner from a JSON string
mod_resource_get_resources_by_courses200_response_resources_inner_instance = ModResourceGetResourcesByCourses200ResponseResourcesInner.from_json(json)
# print the JSON string representation of the object
print(ModResourceGetResourcesByCourses200ResponseResourcesInner.to_json())

# convert the object into a dict
mod_resource_get_resources_by_courses200_response_resources_inner_dict = mod_resource_get_resources_by_courses200_response_resources_inner_instance.to_dict()
# create an instance of ModResourceGetResourcesByCourses200ResponseResourcesInner from a dict
mod_resource_get_resources_by_courses200_response_resources_inner_from_dict = ModResourceGetResourcesByCourses200ResponseResourcesInner.from_dict(mod_resource_get_resources_by_courses200_response_resources_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


