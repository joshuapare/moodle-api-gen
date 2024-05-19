# CoreCompetencyCreatePlan200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canbeedited** | **bool** | canbeedited | [default to False]
**canmanage** | **bool** | canmanage | 
**canrequestreview** | **bool** | canrequestreview | [default to False]
**canreview** | **bool** | canreview | [default to False]
**commentarea** | [**CoreCompetencyCreatePlan200ResponseCommentarea**](CoreCompetencyCreatePlan200ResponseCommentarea.md) |  | 
**description** | **str** | description | [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**duedate** | **int** | duedate | [default to 0]
**duedateformatted** | **str** | duedateformatted | [default to 'null']
**id** | **int** | id | [default to 0]
**isactive** | **bool** | isactive | [default to False]
**isapproveallowed** | **bool** | isapproveallowed | [default to False]
**isbasedontemplate** | **bool** | isbasedontemplate | [default to False]
**iscancelreviewrequestallowed** | **bool** | iscancelreviewrequestallowed | [default to False]
**iscompleteallowed** | **bool** | iscompleteallowed | [default to False]
**iscompleted** | **bool** | iscompleted | [default to False]
**isdraft** | **bool** | isdraft | [default to False]
**isinreview** | **bool** | isinreview | [default to False]
**isreopenallowed** | **bool** | isreopenallowed | [default to False]
**isrequestreviewallowed** | **bool** | isrequestreviewallowed | [default to False]
**isstartreviewallowed** | **bool** | isstartreviewallowed | [default to False]
**isstopreviewallowed** | **bool** | isstopreviewallowed | [default to False]
**isunapproveallowed** | **bool** | isunapproveallowed | [default to False]
**isunlinkallowed** | **bool** | isunlinkallowed | [default to False]
**iswaitingforreview** | **bool** | iswaitingforreview | [default to False]
**name** | **str** | name | 
**origtemplateid** | **int** | origtemplateid | 
**reviewer** | [**CoreCompetencyCreatePlan200ResponseReviewer**](CoreCompetencyCreatePlan200ResponseReviewer.md) |  | [optional] 
**reviewerid** | **int** | reviewerid | 
**status** | **int** | status | [default to 0]
**statusname** | **str** | statusname | [default to 'null']
**template** | [**CoreCompetencyCreatePlan200ResponseTemplate**](CoreCompetencyCreatePlan200ResponseTemplate.md) |  | [optional] 
**templateid** | **int** | templateid | 
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**url** | **str** | url | 
**userid** | **int** | userid | 
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.core_competency_create_plan200_response import CoreCompetencyCreatePlan200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreatePlan200Response from a JSON string
core_competency_create_plan200_response_instance = CoreCompetencyCreatePlan200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreatePlan200Response.to_json())

# convert the object into a dict
core_competency_create_plan200_response_dict = core_competency_create_plan200_response_instance.to_dict()
# create an instance of CoreCompetencyCreatePlan200Response from a dict
core_competency_create_plan200_response_from_dict = CoreCompetencyCreatePlan200Response.from_dict(core_competency_create_plan200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


