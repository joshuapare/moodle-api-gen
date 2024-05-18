# ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canbeedited** | **bool** | canbeedited | [optional] 
**canmanage** | **bool** | canmanage | [optional] 
**canrequestreview** | **bool** | canrequestreview | [optional] 
**canreview** | **bool** | canreview | [optional] 
**commentarea** | [**CoreCompetencyReadPlan200ResponseCommentarea**](CoreCompetencyReadPlan200ResponseCommentarea.md) |  | [optional] 
**description** | **str** | description | [optional] [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**duedate** | **int** | duedate | [optional] [default to 0]
**duedateformatted** | **str** | duedateformatted | [optional] 
**id** | **int** | id | [optional] [default to 0]
**isactive** | **bool** | isactive | [optional] 
**isapproveallowed** | **bool** | isapproveallowed | [optional] 
**isbasedontemplate** | **bool** | isbasedontemplate | [optional] 
**iscancelreviewrequestallowed** | **bool** | iscancelreviewrequestallowed | [optional] 
**iscompleteallowed** | **bool** | iscompleteallowed | [optional] 
**iscompleted** | **bool** | iscompleted | [optional] 
**isdraft** | **bool** | isdraft | [optional] 
**isinreview** | **bool** | isinreview | [optional] 
**isreopenallowed** | **bool** | isreopenallowed | [optional] 
**isrequestreviewallowed** | **bool** | isrequestreviewallowed | [optional] 
**isstartreviewallowed** | **bool** | isstartreviewallowed | [optional] 
**isstopreviewallowed** | **bool** | isstopreviewallowed | [optional] 
**isunapproveallowed** | **bool** | isunapproveallowed | [optional] 
**isunlinkallowed** | **bool** | isunlinkallowed | [optional] 
**iswaitingforreview** | **bool** | iswaitingforreview | [optional] 
**name** | **str** | name | [optional] 
**origtemplateid** | **int** | origtemplateid | [optional] 
**reviewer** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**reviewerid** | **int** | reviewerid | [optional] 
**status** | **int** | status | [optional] [default to 0]
**statusname** | **str** | statusname | [optional] 
**template** | [**CoreCompetencyCreateTemplate200Response**](CoreCompetencyCreateTemplate200Response.md) |  | [optional] 
**templateid** | **int** | templateid | [optional] 
**timecreated** | **int** | timecreated | [optional] [default to 0]
**timemodified** | **int** | timemodified | [optional] [default to 0]
**url** | **str** | url | [optional] 
**userid** | **int** | userid | [optional] 
**usermodified** | **int** | usermodified | [optional] [default to 0]

## Example

```python
from openapi_client.models.tool_lp_data_for_course_competencies_page200_response_competencies_inner_plans_inner import ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner from a JSON string
tool_lp_data_for_course_competencies_page200_response_competencies_inner_plans_inner_instance = ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner.to_json())

# convert the object into a dict
tool_lp_data_for_course_competencies_page200_response_competencies_inner_plans_inner_dict = tool_lp_data_for_course_competencies_page200_response_competencies_inner_plans_inner_instance.to_dict()
# create an instance of ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner from a dict
tool_lp_data_for_course_competencies_page200_response_competencies_inner_plans_inner_from_dict = ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner.from_dict(tool_lp_data_for_course_competencies_page200_response_competencies_inner_plans_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


