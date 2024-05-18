# ToolLpSearchCohorts200ResponseCohortsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customfields** | [**List[CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner]**](CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.md) |  | [optional] 
**description** | **str** | cohort description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**id** | **int** | ID of the cohort | [optional] 
**idnumber** | **str** | cohort idnumber | [optional] 
**name** | **str** | cohort name | [optional] 
**theme** | **str** | cohort theme | [optional] 
**visible** | **bool** | cohort visible | [optional] 

## Example

```python
from openapi_client.models.tool_lp_search_cohorts200_response_cohorts_inner import ToolLpSearchCohorts200ResponseCohortsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpSearchCohorts200ResponseCohortsInner from a JSON string
tool_lp_search_cohorts200_response_cohorts_inner_instance = ToolLpSearchCohorts200ResponseCohortsInner.from_json(json)
# print the JSON string representation of the object
print(ToolLpSearchCohorts200ResponseCohortsInner.to_json())

# convert the object into a dict
tool_lp_search_cohorts200_response_cohorts_inner_dict = tool_lp_search_cohorts200_response_cohorts_inner_instance.to_dict()
# create an instance of ToolLpSearchCohorts200ResponseCohortsInner from a dict
tool_lp_search_cohorts200_response_cohorts_inner_from_dict = ToolLpSearchCohorts200ResponseCohortsInner.from_dict(tool_lp_search_cohorts200_response_cohorts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


