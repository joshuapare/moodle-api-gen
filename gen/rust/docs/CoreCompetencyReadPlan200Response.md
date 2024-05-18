# CoreCompetencyReadPlan200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canbeedited** | **bool** | canbeedited | 
**canmanage** | **bool** | canmanage | 
**canrequestreview** | **bool** | canrequestreview | 
**canreview** | **bool** | canreview | 
**commentarea** | [**models::CoreCompetencyReadPlan200ResponseCommentarea**](core_competency_read_plan_200_response_commentarea.md) |  | 
**description** | **String** | description | [default to ]
**descriptionformat** | Option<**i32**> | description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**duedate** | **i32** | duedate | [default to 0]
**duedateformatted** | **String** | duedateformatted | 
**id** | **i32** | id | [default to 0]
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
**name** | **String** | name | 
**origtemplateid** | **i32** | origtemplateid | 
**reviewer** | Option<[**models::CoreCompetencyGradeCompetency200ResponseActionuser**](core_competency_grade_competency_200_response_actionuser.md)> |  | [optional]
**reviewerid** | **i32** | reviewerid | 
**status** | **i32** | status | [default to 0]
**statusname** | **String** | statusname | 
**template** | Option<[**models::CoreCompetencyCreateTemplate200Response**](core_competency_create_template_200_response.md)> |  | [optional]
**templateid** | **i32** | templateid | 
**timecreated** | **i32** | timecreated | [default to 0]
**timemodified** | **i32** | timemodified | [default to 0]
**url** | **String** | url | 
**userid** | **i32** | userid | 
**usermodified** | **i32** | usermodified | [default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


