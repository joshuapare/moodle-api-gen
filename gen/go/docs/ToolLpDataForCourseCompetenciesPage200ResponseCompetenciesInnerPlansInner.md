# ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canbeedited** | Pointer to **bool** | canbeedited | [optional] 
**Canmanage** | Pointer to **bool** | canmanage | [optional] 
**Canrequestreview** | Pointer to **bool** | canrequestreview | [optional] 
**Canreview** | Pointer to **bool** | canreview | [optional] 
**Commentarea** | Pointer to [**CoreCompetencyReadPlan200ResponseCommentarea**](CoreCompetencyReadPlan200ResponseCommentarea.md) |  | [optional] 
**Description** | Pointer to **string** | description | [optional] [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Duedate** | Pointer to **int32** | duedate | [optional] [default to 0]
**Duedateformatted** | Pointer to **string** | duedateformatted | [optional] 
**Id** | Pointer to **int32** | id | [optional] [default to 0]
**Isactive** | Pointer to **bool** | isactive | [optional] 
**Isapproveallowed** | Pointer to **bool** | isapproveallowed | [optional] 
**Isbasedontemplate** | Pointer to **bool** | isbasedontemplate | [optional] 
**Iscancelreviewrequestallowed** | Pointer to **bool** | iscancelreviewrequestallowed | [optional] 
**Iscompleteallowed** | Pointer to **bool** | iscompleteallowed | [optional] 
**Iscompleted** | Pointer to **bool** | iscompleted | [optional] 
**Isdraft** | Pointer to **bool** | isdraft | [optional] 
**Isinreview** | Pointer to **bool** | isinreview | [optional] 
**Isreopenallowed** | Pointer to **bool** | isreopenallowed | [optional] 
**Isrequestreviewallowed** | Pointer to **bool** | isrequestreviewallowed | [optional] 
**Isstartreviewallowed** | Pointer to **bool** | isstartreviewallowed | [optional] 
**Isstopreviewallowed** | Pointer to **bool** | isstopreviewallowed | [optional] 
**Isunapproveallowed** | Pointer to **bool** | isunapproveallowed | [optional] 
**Isunlinkallowed** | Pointer to **bool** | isunlinkallowed | [optional] 
**Iswaitingforreview** | Pointer to **bool** | iswaitingforreview | [optional] 
**Name** | Pointer to **string** | name | [optional] 
**Origtemplateid** | Pointer to **int32** | origtemplateid | [optional] 
**Reviewer** | Pointer to [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**Reviewerid** | Pointer to **int32** | reviewerid | [optional] 
**Status** | Pointer to **int32** | status | [optional] [default to 0]
**Statusname** | Pointer to **string** | statusname | [optional] 
**Template** | Pointer to [**CoreCompetencyCreateTemplate200Response**](CoreCompetencyCreateTemplate200Response.md) |  | [optional] 
**Templateid** | Pointer to **int32** | templateid | [optional] 
**Timecreated** | Pointer to **int32** | timecreated | [optional] [default to 0]
**Timemodified** | Pointer to **int32** | timemodified | [optional] [default to 0]
**Url** | Pointer to **string** | url | [optional] 
**Userid** | Pointer to **int32** | userid | [optional] 
**Usermodified** | Pointer to **int32** | usermodified | [optional] [default to 0]

## Methods

### NewToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner

`func NewToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner() *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner`

NewToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner instantiates a new ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInnerWithDefaults

`func NewToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInnerWithDefaults() *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner`

NewToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInnerWithDefaults instantiates a new ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanbeedited

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetCanbeedited() bool`

GetCanbeedited returns the Canbeedited field if non-nil, zero value otherwise.

### GetCanbeeditedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetCanbeeditedOk() (*bool, bool)`

GetCanbeeditedOk returns a tuple with the Canbeedited field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanbeedited

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetCanbeedited(v bool)`

SetCanbeedited sets Canbeedited field to given value.

### HasCanbeedited

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasCanbeedited() bool`

HasCanbeedited returns a boolean if a field has been set.

### GetCanmanage

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.

### HasCanmanage

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasCanmanage() bool`

HasCanmanage returns a boolean if a field has been set.

### GetCanrequestreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetCanrequestreview() bool`

GetCanrequestreview returns the Canrequestreview field if non-nil, zero value otherwise.

### GetCanrequestreviewOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetCanrequestreviewOk() (*bool, bool)`

GetCanrequestreviewOk returns a tuple with the Canrequestreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanrequestreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetCanrequestreview(v bool)`

SetCanrequestreview sets Canrequestreview field to given value.

### HasCanrequestreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasCanrequestreview() bool`

HasCanrequestreview returns a boolean if a field has been set.

### GetCanreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetCanreview() bool`

GetCanreview returns the Canreview field if non-nil, zero value otherwise.

### GetCanreviewOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetCanreviewOk() (*bool, bool)`

GetCanreviewOk returns a tuple with the Canreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetCanreview(v bool)`

SetCanreview sets Canreview field to given value.

### HasCanreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasCanreview() bool`

HasCanreview returns a boolean if a field has been set.

### GetCommentarea

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetCommentarea() CoreCompetencyReadPlan200ResponseCommentarea`

GetCommentarea returns the Commentarea field if non-nil, zero value otherwise.

### GetCommentareaOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetCommentareaOk() (*CoreCompetencyReadPlan200ResponseCommentarea, bool)`

GetCommentareaOk returns a tuple with the Commentarea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommentarea

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetCommentarea(v CoreCompetencyReadPlan200ResponseCommentarea)`

SetCommentarea sets Commentarea field to given value.

### HasCommentarea

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasCommentarea() bool`

HasCommentarea returns a boolean if a field has been set.

### GetDescription

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetDuedate

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetDuedate() int32`

GetDuedate returns the Duedate field if non-nil, zero value otherwise.

### GetDuedateOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetDuedateOk() (*int32, bool)`

GetDuedateOk returns a tuple with the Duedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedate

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetDuedate(v int32)`

SetDuedate sets Duedate field to given value.

### HasDuedate

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasDuedate() bool`

HasDuedate returns a boolean if a field has been set.

### GetDuedateformatted

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetDuedateformatted() string`

GetDuedateformatted returns the Duedateformatted field if non-nil, zero value otherwise.

### GetDuedateformattedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetDuedateformattedOk() (*string, bool)`

GetDuedateformattedOk returns a tuple with the Duedateformatted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedateformatted

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetDuedateformatted(v string)`

SetDuedateformatted sets Duedateformatted field to given value.

### HasDuedateformatted

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasDuedateformatted() bool`

HasDuedateformatted returns a boolean if a field has been set.

### GetId

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIsactive

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsactive() bool`

GetIsactive returns the Isactive field if non-nil, zero value otherwise.

### GetIsactiveOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsactiveOk() (*bool, bool)`

GetIsactiveOk returns a tuple with the Isactive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsactive

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIsactive(v bool)`

SetIsactive sets Isactive field to given value.

### HasIsactive

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIsactive() bool`

HasIsactive returns a boolean if a field has been set.

### GetIsapproveallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsapproveallowed() bool`

GetIsapproveallowed returns the Isapproveallowed field if non-nil, zero value otherwise.

### GetIsapproveallowedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsapproveallowedOk() (*bool, bool)`

GetIsapproveallowedOk returns a tuple with the Isapproveallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsapproveallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIsapproveallowed(v bool)`

SetIsapproveallowed sets Isapproveallowed field to given value.

### HasIsapproveallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIsapproveallowed() bool`

HasIsapproveallowed returns a boolean if a field has been set.

### GetIsbasedontemplate

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsbasedontemplate() bool`

GetIsbasedontemplate returns the Isbasedontemplate field if non-nil, zero value otherwise.

### GetIsbasedontemplateOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsbasedontemplateOk() (*bool, bool)`

GetIsbasedontemplateOk returns a tuple with the Isbasedontemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsbasedontemplate

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIsbasedontemplate(v bool)`

SetIsbasedontemplate sets Isbasedontemplate field to given value.

### HasIsbasedontemplate

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIsbasedontemplate() bool`

HasIsbasedontemplate returns a boolean if a field has been set.

### GetIscancelreviewrequestallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIscancelreviewrequestallowed() bool`

GetIscancelreviewrequestallowed returns the Iscancelreviewrequestallowed field if non-nil, zero value otherwise.

### GetIscancelreviewrequestallowedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIscancelreviewrequestallowedOk() (*bool, bool)`

GetIscancelreviewrequestallowedOk returns a tuple with the Iscancelreviewrequestallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscancelreviewrequestallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIscancelreviewrequestallowed(v bool)`

SetIscancelreviewrequestallowed sets Iscancelreviewrequestallowed field to given value.

### HasIscancelreviewrequestallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIscancelreviewrequestallowed() bool`

HasIscancelreviewrequestallowed returns a boolean if a field has been set.

### GetIscompleteallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIscompleteallowed() bool`

GetIscompleteallowed returns the Iscompleteallowed field if non-nil, zero value otherwise.

### GetIscompleteallowedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIscompleteallowedOk() (*bool, bool)`

GetIscompleteallowedOk returns a tuple with the Iscompleteallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscompleteallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIscompleteallowed(v bool)`

SetIscompleteallowed sets Iscompleteallowed field to given value.

### HasIscompleteallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIscompleteallowed() bool`

HasIscompleteallowed returns a boolean if a field has been set.

### GetIscompleted

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIscompleted() bool`

GetIscompleted returns the Iscompleted field if non-nil, zero value otherwise.

### GetIscompletedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIscompletedOk() (*bool, bool)`

GetIscompletedOk returns a tuple with the Iscompleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscompleted

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIscompleted(v bool)`

SetIscompleted sets Iscompleted field to given value.

### HasIscompleted

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIscompleted() bool`

HasIscompleted returns a boolean if a field has been set.

### GetIsdraft

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsdraft() bool`

GetIsdraft returns the Isdraft field if non-nil, zero value otherwise.

### GetIsdraftOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsdraftOk() (*bool, bool)`

GetIsdraftOk returns a tuple with the Isdraft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsdraft

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIsdraft(v bool)`

SetIsdraft sets Isdraft field to given value.

### HasIsdraft

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIsdraft() bool`

HasIsdraft returns a boolean if a field has been set.

### GetIsinreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsinreview() bool`

GetIsinreview returns the Isinreview field if non-nil, zero value otherwise.

### GetIsinreviewOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsinreviewOk() (*bool, bool)`

GetIsinreviewOk returns a tuple with the Isinreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsinreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIsinreview(v bool)`

SetIsinreview sets Isinreview field to given value.

### HasIsinreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIsinreview() bool`

HasIsinreview returns a boolean if a field has been set.

### GetIsreopenallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsreopenallowed() bool`

GetIsreopenallowed returns the Isreopenallowed field if non-nil, zero value otherwise.

### GetIsreopenallowedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsreopenallowedOk() (*bool, bool)`

GetIsreopenallowedOk returns a tuple with the Isreopenallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsreopenallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIsreopenallowed(v bool)`

SetIsreopenallowed sets Isreopenallowed field to given value.

### HasIsreopenallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIsreopenallowed() bool`

HasIsreopenallowed returns a boolean if a field has been set.

### GetIsrequestreviewallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsrequestreviewallowed() bool`

GetIsrequestreviewallowed returns the Isrequestreviewallowed field if non-nil, zero value otherwise.

### GetIsrequestreviewallowedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsrequestreviewallowedOk() (*bool, bool)`

GetIsrequestreviewallowedOk returns a tuple with the Isrequestreviewallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsrequestreviewallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIsrequestreviewallowed(v bool)`

SetIsrequestreviewallowed sets Isrequestreviewallowed field to given value.

### HasIsrequestreviewallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIsrequestreviewallowed() bool`

HasIsrequestreviewallowed returns a boolean if a field has been set.

### GetIsstartreviewallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsstartreviewallowed() bool`

GetIsstartreviewallowed returns the Isstartreviewallowed field if non-nil, zero value otherwise.

### GetIsstartreviewallowedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsstartreviewallowedOk() (*bool, bool)`

GetIsstartreviewallowedOk returns a tuple with the Isstartreviewallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsstartreviewallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIsstartreviewallowed(v bool)`

SetIsstartreviewallowed sets Isstartreviewallowed field to given value.

### HasIsstartreviewallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIsstartreviewallowed() bool`

HasIsstartreviewallowed returns a boolean if a field has been set.

### GetIsstopreviewallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsstopreviewallowed() bool`

GetIsstopreviewallowed returns the Isstopreviewallowed field if non-nil, zero value otherwise.

### GetIsstopreviewallowedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsstopreviewallowedOk() (*bool, bool)`

GetIsstopreviewallowedOk returns a tuple with the Isstopreviewallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsstopreviewallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIsstopreviewallowed(v bool)`

SetIsstopreviewallowed sets Isstopreviewallowed field to given value.

### HasIsstopreviewallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIsstopreviewallowed() bool`

HasIsstopreviewallowed returns a boolean if a field has been set.

### GetIsunapproveallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsunapproveallowed() bool`

GetIsunapproveallowed returns the Isunapproveallowed field if non-nil, zero value otherwise.

### GetIsunapproveallowedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsunapproveallowedOk() (*bool, bool)`

GetIsunapproveallowedOk returns a tuple with the Isunapproveallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsunapproveallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIsunapproveallowed(v bool)`

SetIsunapproveallowed sets Isunapproveallowed field to given value.

### HasIsunapproveallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIsunapproveallowed() bool`

HasIsunapproveallowed returns a boolean if a field has been set.

### GetIsunlinkallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsunlinkallowed() bool`

GetIsunlinkallowed returns the Isunlinkallowed field if non-nil, zero value otherwise.

### GetIsunlinkallowedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIsunlinkallowedOk() (*bool, bool)`

GetIsunlinkallowedOk returns a tuple with the Isunlinkallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsunlinkallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIsunlinkallowed(v bool)`

SetIsunlinkallowed sets Isunlinkallowed field to given value.

### HasIsunlinkallowed

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIsunlinkallowed() bool`

HasIsunlinkallowed returns a boolean if a field has been set.

### GetIswaitingforreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIswaitingforreview() bool`

GetIswaitingforreview returns the Iswaitingforreview field if non-nil, zero value otherwise.

### GetIswaitingforreviewOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetIswaitingforreviewOk() (*bool, bool)`

GetIswaitingforreviewOk returns a tuple with the Iswaitingforreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIswaitingforreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetIswaitingforreview(v bool)`

SetIswaitingforreview sets Iswaitingforreview field to given value.

### HasIswaitingforreview

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasIswaitingforreview() bool`

HasIswaitingforreview returns a boolean if a field has been set.

### GetName

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOrigtemplateid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetOrigtemplateid() int32`

GetOrigtemplateid returns the Origtemplateid field if non-nil, zero value otherwise.

### GetOrigtemplateidOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetOrigtemplateidOk() (*int32, bool)`

GetOrigtemplateidOk returns a tuple with the Origtemplateid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrigtemplateid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetOrigtemplateid(v int32)`

SetOrigtemplateid sets Origtemplateid field to given value.

### HasOrigtemplateid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasOrigtemplateid() bool`

HasOrigtemplateid returns a boolean if a field has been set.

### GetReviewer

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetReviewer() CoreCompetencyGradeCompetency200ResponseActionuser`

GetReviewer returns the Reviewer field if non-nil, zero value otherwise.

### GetReviewerOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetReviewerOk() (*CoreCompetencyGradeCompetency200ResponseActionuser, bool)`

GetReviewerOk returns a tuple with the Reviewer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewer

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetReviewer(v CoreCompetencyGradeCompetency200ResponseActionuser)`

SetReviewer sets Reviewer field to given value.

### HasReviewer

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasReviewer() bool`

HasReviewer returns a boolean if a field has been set.

### GetReviewerid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetReviewerid() int32`

GetReviewerid returns the Reviewerid field if non-nil, zero value otherwise.

### GetRevieweridOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetRevieweridOk() (*int32, bool)`

GetRevieweridOk returns a tuple with the Reviewerid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewerid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetReviewerid(v int32)`

SetReviewerid sets Reviewerid field to given value.

### HasReviewerid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasReviewerid() bool`

HasReviewerid returns a boolean if a field has been set.

### GetStatus

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetStatus(v int32)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetStatusname

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetStatusname() string`

GetStatusname returns the Statusname field if non-nil, zero value otherwise.

### GetStatusnameOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetStatusnameOk() (*string, bool)`

GetStatusnameOk returns a tuple with the Statusname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusname

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetStatusname(v string)`

SetStatusname sets Statusname field to given value.

### HasStatusname

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasStatusname() bool`

HasStatusname returns a boolean if a field has been set.

### GetTemplate

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetTemplate() CoreCompetencyCreateTemplate200Response`

GetTemplate returns the Template field if non-nil, zero value otherwise.

### GetTemplateOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetTemplateOk() (*CoreCompetencyCreateTemplate200Response, bool)`

GetTemplateOk returns a tuple with the Template field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplate

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetTemplate(v CoreCompetencyCreateTemplate200Response)`

SetTemplate sets Template field to given value.

### HasTemplate

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasTemplate() bool`

HasTemplate returns a boolean if a field has been set.

### GetTemplateid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetTemplateid() int32`

GetTemplateid returns the Templateid field if non-nil, zero value otherwise.

### GetTemplateidOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetTemplateidOk() (*int32, bool)`

GetTemplateidOk returns a tuple with the Templateid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetTemplateid(v int32)`

SetTemplateid sets Templateid field to given value.

### HasTemplateid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasTemplateid() bool`

HasTemplateid returns a boolean if a field has been set.

### GetTimecreated

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUrl

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetUserid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUsermodified

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


