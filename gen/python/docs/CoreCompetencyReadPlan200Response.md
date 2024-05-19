# CoreCompetencyReadPlan200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canbeedited** | **bool** | canbeedited | 
**canmanage** | **bool** | canmanage | 
**canrequestreview** | **bool** | canrequestreview | 
**canreview** | **bool** | canreview | 
**commentarea** | [**CoreCompetencyReadPlan200ResponseCommentarea**](CoreCompetencyReadPlan200ResponseCommentarea.md) |  | 
**description** | **str** | description | [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**duedate** | **int** | duedate | [default to 0]
**duedateformatted** | **str** | duedateformatted | 
**id** | **int** | id | [default to 0]
**isactive** | **bool** | isactive | 
**isapproveallowed** | **bool** | isapproveallowed | 
**isbasedontemplate** | **bool** | isbasedontemplate | 
**iscancelreviewrequestallowed** | **bool** | iscancelreviewrequestallowed | 
**iscompleteallowed** | **bool** | iscompleteallowed | 
**iscompleted** | **bool** | iscompleted | 
**isdraft** | **bool** | isdraft | 
**isinreview** | **bool** | isinreview | 
**isreopenallowed** | **bool** | isreopenallowed | 
**isrequestreviewallowed** | **bool** | isrequestreviewallowed | 
**isstartreviewallowed** | **bool** | isstartreviewallowed | 
**isstopreviewallowed** | **bool** | isstopreviewallowed | 
**isunapproveallowed** | **bool** | isunapproveallowed | 
**isunlinkallowed** | **bool** | isunlinkallowed | 
**iswaitingforreview** | **bool** | iswaitingforreview | 
**name** | **str** | name | 
**origtemplateid** | **int** | origtemplateid | 
**reviewer** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**reviewerid** | **int** | reviewerid | 
**status** | **int** | status | [default to 0]
**statusname** | **str** | statusname | 
**template** | [**CoreCompetencyCreateTemplate200Response**](CoreCompetencyCreateTemplate200Response.md) |  | [optional] 
**templateid** | **int** | templateid | 
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**url** | **str** | url | 
**userid** | **int** | userid | 
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.core_competency_read_plan200_response import CoreCompetencyReadPlan200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyReadPlan200Response from a JSON string
core_competency_read_plan200_response_instance = CoreCompetencyReadPlan200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyReadPlan200Response.to_json())

# convert the object into a dict
core_competency_read_plan200_response_dict = core_competency_read_plan200_response_instance.to_dict()
# create an instance of CoreCompetencyReadPlan200Response from a dict
core_competency_read_plan200_response_from_dict = CoreCompetencyReadPlan200Response.from_dict(core_competency_read_plan200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


