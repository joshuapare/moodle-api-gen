# ModLtiGetLtisByCourses200ResponseLtisInner

Tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**debuglaunch** | **int** | Debug launch | [optional] [default to null]
**grade** | **int** | Enable grades | [optional] [default to null]
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**icon** | **str** | Alternative icon URL | [optional] [default to 'null']
**id** | **int** | Activity instance id | [optional] 
**instructorchoiceacceptgrades** | **int** | instructor choice accept grades | [optional] [default to null]
**instructorchoiceallowroster** | **int** | Instructor choice allow roster | [optional] [default to null]
**instructorchoiceallowsetting** | **int** | Instructor choice allow setting | [optional] [default to null]
**instructorchoicesendemailaddr** | **int** | instructor choice send mail address | [optional] [default to null]
**instructorchoicesendname** | **str** | Instructor choice send name | [optional] [default to 'null']
**instructorcustomparameters** | **str** | instructor custom parameters | [optional] [default to 'null']
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**launchcontainer** | **int** | Launch container mode | [optional] [default to null]
**name** | **str** | Activity name | [optional] 
**password** | **str** | Shared secret | [optional] [default to 'null']
**resourcekey** | **str** | Resource key | [optional] [default to 'null']
**section** | **int** | Course section id | [optional] 
**secureicon** | **str** | Secure icon URL | [optional] [default to 'null']
**securetoolurl** | **str** | Secure tool url | [optional] [default to 'null']
**servicesalt** | **str** | Service salt | [optional] [default to 'null']
**showdescriptionlaunch** | **int** | Show description launch | [optional] [default to null]
**showtitlelaunch** | **int** | Show title launch | [optional] [default to null]
**timecreated** | **int** | Time of creation | [optional] 
**timemodified** | **int** | Time of last modification | [optional] 
**toolurl** | **str** | Tool url | [optional] [default to 'null']
**typeid** | **int** | Type id | [optional] [default to null]
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_lti_get_ltis_by_courses200_response_ltis_inner import ModLtiGetLtisByCourses200ResponseLtisInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetLtisByCourses200ResponseLtisInner from a JSON string
mod_lti_get_ltis_by_courses200_response_ltis_inner_instance = ModLtiGetLtisByCourses200ResponseLtisInner.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetLtisByCourses200ResponseLtisInner.to_json())

# convert the object into a dict
mod_lti_get_ltis_by_courses200_response_ltis_inner_dict = mod_lti_get_ltis_by_courses200_response_ltis_inner_instance.to_dict()
# create an instance of ModLtiGetLtisByCourses200ResponseLtisInner from a dict
mod_lti_get_ltis_by_courses200_response_ltis_inner_from_dict = ModLtiGetLtisByCourses200ResponseLtisInner.from_dict(mod_lti_get_ltis_by_courses200_response_ltis_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


