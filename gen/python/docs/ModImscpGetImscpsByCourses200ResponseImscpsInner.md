# ModImscpGetImscpsByCourses200ResponseImscpsInner

IMS content packages

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**keepold** | **int** | Number of old IMSCP to keep | [optional] [default to null]
**lang** | **str** | Forced activity language | [optional] 
**name** | **str** | Activity name | [optional] 
**revision** | **int** | Revision | [optional] [default to null]
**section** | **int** | Course section id | [optional] 
**structure** | **str** | IMSCP structure | [optional] [default to 'null']
**timemodified** | **str** | Time of last modification | [optional] [default to 'null']
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_imscp_get_imscps_by_courses200_response_imscps_inner import ModImscpGetImscpsByCourses200ResponseImscpsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModImscpGetImscpsByCourses200ResponseImscpsInner from a JSON string
mod_imscp_get_imscps_by_courses200_response_imscps_inner_instance = ModImscpGetImscpsByCourses200ResponseImscpsInner.from_json(json)
# print the JSON string representation of the object
print(ModImscpGetImscpsByCourses200ResponseImscpsInner.to_json())

# convert the object into a dict
mod_imscp_get_imscps_by_courses200_response_imscps_inner_dict = mod_imscp_get_imscps_by_courses200_response_imscps_inner_instance.to_dict()
# create an instance of ModImscpGetImscpsByCourses200ResponseImscpsInner from a dict
mod_imscp_get_imscps_by_courses200_response_imscps_inner_from_dict = ModImscpGetImscpsByCourses200ResponseImscpsInner.from_dict(mod_imscp_get_imscps_by_courses200_response_imscps_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


