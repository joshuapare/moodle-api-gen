# CoreCompetencyReadPlan200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canbeedited** | **bool** | canbeedited | 
**Canmanage** | **bool** | canmanage | 
**Canrequestreview** | **bool** | canrequestreview | 
**Canreview** | **bool** | canreview | 
**Commentarea** | [**CoreCompetencyReadPlan200ResponseCommentarea**](CoreCompetencyReadPlan200ResponseCommentarea.md) |  | 
**Description** | **string** | description | [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Duedate** | **int32** | duedate | [default to 0]
**Duedateformatted** | **string** | duedateformatted | 
**Id** | **int32** | id | [default to 0]
**Isactive** | **bool** | isactive | 
**Isapproveallowed** | **bool** | isapproveallowed | 
**Isbasedontemplate** | **bool** | isbasedontemplate | 
**Iscancelreviewrequestallowed** | **bool** | iscancelreviewrequestallowed | 
**Iscompleteallowed** | **bool** | iscompleteallowed | 
**Iscompleted** | **bool** | iscompleted | 
**Isdraft** | **bool** | isdraft | 
**Isinreview** | **bool** | isinreview | 
**Isreopenallowed** | **bool** | isreopenallowed | 
**Isrequestreviewallowed** | **bool** | isrequestreviewallowed | 
**Isstartreviewallowed** | **bool** | isstartreviewallowed | 
**Isstopreviewallowed** | **bool** | isstopreviewallowed | 
**Isunapproveallowed** | **bool** | isunapproveallowed | 
**Isunlinkallowed** | **bool** | isunlinkallowed | 
**Iswaitingforreview** | **bool** | iswaitingforreview | 
**Name** | **string** | name | 
**Origtemplateid** | **int32** | origtemplateid | 
**Reviewer** | Pointer to [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**Reviewerid** | **int32** | reviewerid | 
**Status** | **int32** | status | [default to 0]
**Statusname** | **string** | statusname | 
**Template** | Pointer to [**CoreCompetencyCreateTemplate200Response**](CoreCompetencyCreateTemplate200Response.md) |  | [optional] 
**Templateid** | **int32** | templateid | 
**Timecreated** | **int32** | timecreated | [default to 0]
**Timemodified** | **int32** | timemodified | [default to 0]
**Url** | **string** | url | 
**Userid** | **int32** | userid | 
**Usermodified** | **int32** | usermodified | [default to 0]

## Methods

### NewCoreCompetencyReadPlan200Response

`func NewCoreCompetencyReadPlan200Response(canbeedited bool, canmanage bool, canrequestreview bool, canreview bool, commentarea CoreCompetencyReadPlan200ResponseCommentarea, description string, duedate int32, duedateformatted string, id int32, isactive bool, isapproveallowed bool, isbasedontemplate bool, iscancelreviewrequestallowed bool, iscompleteallowed bool, iscompleted bool, isdraft bool, isinreview bool, isreopenallowed bool, isrequestreviewallowed bool, isstartreviewallowed bool, isstopreviewallowed bool, isunapproveallowed bool, isunlinkallowed bool, iswaitingforreview bool, name string, origtemplateid int32, reviewerid int32, status int32, statusname string, templateid int32, timecreated int32, timemodified int32, url string, userid int32, usermodified int32, ) *CoreCompetencyReadPlan200Response`

NewCoreCompetencyReadPlan200Response instantiates a new CoreCompetencyReadPlan200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyReadPlan200ResponseWithDefaults

`func NewCoreCompetencyReadPlan200ResponseWithDefaults() *CoreCompetencyReadPlan200Response`

NewCoreCompetencyReadPlan200ResponseWithDefaults instantiates a new CoreCompetencyReadPlan200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanbeedited

`func (o *CoreCompetencyReadPlan200Response) GetCanbeedited() bool`

GetCanbeedited returns the Canbeedited field if non-nil, zero value otherwise.

### GetCanbeeditedOk

`func (o *CoreCompetencyReadPlan200Response) GetCanbeeditedOk() (*bool, bool)`

GetCanbeeditedOk returns a tuple with the Canbeedited field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanbeedited

`func (o *CoreCompetencyReadPlan200Response) SetCanbeedited(v bool)`

SetCanbeedited sets Canbeedited field to given value.


### GetCanmanage

`func (o *CoreCompetencyReadPlan200Response) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *CoreCompetencyReadPlan200Response) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *CoreCompetencyReadPlan200Response) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.


### GetCanrequestreview

`func (o *CoreCompetencyReadPlan200Response) GetCanrequestreview() bool`

GetCanrequestreview returns the Canrequestreview field if non-nil, zero value otherwise.

### GetCanrequestreviewOk

`func (o *CoreCompetencyReadPlan200Response) GetCanrequestreviewOk() (*bool, bool)`

GetCanrequestreviewOk returns a tuple with the Canrequestreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanrequestreview

`func (o *CoreCompetencyReadPlan200Response) SetCanrequestreview(v bool)`

SetCanrequestreview sets Canrequestreview field to given value.


### GetCanreview

`func (o *CoreCompetencyReadPlan200Response) GetCanreview() bool`

GetCanreview returns the Canreview field if non-nil, zero value otherwise.

### GetCanreviewOk

`func (o *CoreCompetencyReadPlan200Response) GetCanreviewOk() (*bool, bool)`

GetCanreviewOk returns a tuple with the Canreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanreview

`func (o *CoreCompetencyReadPlan200Response) SetCanreview(v bool)`

SetCanreview sets Canreview field to given value.


### GetCommentarea

`func (o *CoreCompetencyReadPlan200Response) GetCommentarea() CoreCompetencyReadPlan200ResponseCommentarea`

GetCommentarea returns the Commentarea field if non-nil, zero value otherwise.

### GetCommentareaOk

`func (o *CoreCompetencyReadPlan200Response) GetCommentareaOk() (*CoreCompetencyReadPlan200ResponseCommentarea, bool)`

GetCommentareaOk returns a tuple with the Commentarea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommentarea

`func (o *CoreCompetencyReadPlan200Response) SetCommentarea(v CoreCompetencyReadPlan200ResponseCommentarea)`

SetCommentarea sets Commentarea field to given value.


### GetDescription

`func (o *CoreCompetencyReadPlan200Response) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyReadPlan200Response) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyReadPlan200Response) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetDescriptionformat

`func (o *CoreCompetencyReadPlan200Response) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyReadPlan200Response) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyReadPlan200Response) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyReadPlan200Response) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetDuedate

`func (o *CoreCompetencyReadPlan200Response) GetDuedate() int32`

GetDuedate returns the Duedate field if non-nil, zero value otherwise.

### GetDuedateOk

`func (o *CoreCompetencyReadPlan200Response) GetDuedateOk() (*int32, bool)`

GetDuedateOk returns a tuple with the Duedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedate

`func (o *CoreCompetencyReadPlan200Response) SetDuedate(v int32)`

SetDuedate sets Duedate field to given value.


### GetDuedateformatted

`func (o *CoreCompetencyReadPlan200Response) GetDuedateformatted() string`

GetDuedateformatted returns the Duedateformatted field if non-nil, zero value otherwise.

### GetDuedateformattedOk

`func (o *CoreCompetencyReadPlan200Response) GetDuedateformattedOk() (*string, bool)`

GetDuedateformattedOk returns a tuple with the Duedateformatted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedateformatted

`func (o *CoreCompetencyReadPlan200Response) SetDuedateformatted(v string)`

SetDuedateformatted sets Duedateformatted field to given value.


### GetId

`func (o *CoreCompetencyReadPlan200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCompetencyReadPlan200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCompetencyReadPlan200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetIsactive

`func (o *CoreCompetencyReadPlan200Response) GetIsactive() bool`

GetIsactive returns the Isactive field if non-nil, zero value otherwise.

### GetIsactiveOk

`func (o *CoreCompetencyReadPlan200Response) GetIsactiveOk() (*bool, bool)`

GetIsactiveOk returns a tuple with the Isactive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsactive

`func (o *CoreCompetencyReadPlan200Response) SetIsactive(v bool)`

SetIsactive sets Isactive field to given value.


### GetIsapproveallowed

`func (o *CoreCompetencyReadPlan200Response) GetIsapproveallowed() bool`

GetIsapproveallowed returns the Isapproveallowed field if non-nil, zero value otherwise.

### GetIsapproveallowedOk

`func (o *CoreCompetencyReadPlan200Response) GetIsapproveallowedOk() (*bool, bool)`

GetIsapproveallowedOk returns a tuple with the Isapproveallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsapproveallowed

`func (o *CoreCompetencyReadPlan200Response) SetIsapproveallowed(v bool)`

SetIsapproveallowed sets Isapproveallowed field to given value.


### GetIsbasedontemplate

`func (o *CoreCompetencyReadPlan200Response) GetIsbasedontemplate() bool`

GetIsbasedontemplate returns the Isbasedontemplate field if non-nil, zero value otherwise.

### GetIsbasedontemplateOk

`func (o *CoreCompetencyReadPlan200Response) GetIsbasedontemplateOk() (*bool, bool)`

GetIsbasedontemplateOk returns a tuple with the Isbasedontemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsbasedontemplate

`func (o *CoreCompetencyReadPlan200Response) SetIsbasedontemplate(v bool)`

SetIsbasedontemplate sets Isbasedontemplate field to given value.


### GetIscancelreviewrequestallowed

`func (o *CoreCompetencyReadPlan200Response) GetIscancelreviewrequestallowed() bool`

GetIscancelreviewrequestallowed returns the Iscancelreviewrequestallowed field if non-nil, zero value otherwise.

### GetIscancelreviewrequestallowedOk

`func (o *CoreCompetencyReadPlan200Response) GetIscancelreviewrequestallowedOk() (*bool, bool)`

GetIscancelreviewrequestallowedOk returns a tuple with the Iscancelreviewrequestallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscancelreviewrequestallowed

`func (o *CoreCompetencyReadPlan200Response) SetIscancelreviewrequestallowed(v bool)`

SetIscancelreviewrequestallowed sets Iscancelreviewrequestallowed field to given value.


### GetIscompleteallowed

`func (o *CoreCompetencyReadPlan200Response) GetIscompleteallowed() bool`

GetIscompleteallowed returns the Iscompleteallowed field if non-nil, zero value otherwise.

### GetIscompleteallowedOk

`func (o *CoreCompetencyReadPlan200Response) GetIscompleteallowedOk() (*bool, bool)`

GetIscompleteallowedOk returns a tuple with the Iscompleteallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscompleteallowed

`func (o *CoreCompetencyReadPlan200Response) SetIscompleteallowed(v bool)`

SetIscompleteallowed sets Iscompleteallowed field to given value.


### GetIscompleted

`func (o *CoreCompetencyReadPlan200Response) GetIscompleted() bool`

GetIscompleted returns the Iscompleted field if non-nil, zero value otherwise.

### GetIscompletedOk

`func (o *CoreCompetencyReadPlan200Response) GetIscompletedOk() (*bool, bool)`

GetIscompletedOk returns a tuple with the Iscompleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscompleted

`func (o *CoreCompetencyReadPlan200Response) SetIscompleted(v bool)`

SetIscompleted sets Iscompleted field to given value.


### GetIsdraft

`func (o *CoreCompetencyReadPlan200Response) GetIsdraft() bool`

GetIsdraft returns the Isdraft field if non-nil, zero value otherwise.

### GetIsdraftOk

`func (o *CoreCompetencyReadPlan200Response) GetIsdraftOk() (*bool, bool)`

GetIsdraftOk returns a tuple with the Isdraft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsdraft

`func (o *CoreCompetencyReadPlan200Response) SetIsdraft(v bool)`

SetIsdraft sets Isdraft field to given value.


### GetIsinreview

`func (o *CoreCompetencyReadPlan200Response) GetIsinreview() bool`

GetIsinreview returns the Isinreview field if non-nil, zero value otherwise.

### GetIsinreviewOk

`func (o *CoreCompetencyReadPlan200Response) GetIsinreviewOk() (*bool, bool)`

GetIsinreviewOk returns a tuple with the Isinreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsinreview

`func (o *CoreCompetencyReadPlan200Response) SetIsinreview(v bool)`

SetIsinreview sets Isinreview field to given value.


### GetIsreopenallowed

`func (o *CoreCompetencyReadPlan200Response) GetIsreopenallowed() bool`

GetIsreopenallowed returns the Isreopenallowed field if non-nil, zero value otherwise.

### GetIsreopenallowedOk

`func (o *CoreCompetencyReadPlan200Response) GetIsreopenallowedOk() (*bool, bool)`

GetIsreopenallowedOk returns a tuple with the Isreopenallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsreopenallowed

`func (o *CoreCompetencyReadPlan200Response) SetIsreopenallowed(v bool)`

SetIsreopenallowed sets Isreopenallowed field to given value.


### GetIsrequestreviewallowed

`func (o *CoreCompetencyReadPlan200Response) GetIsrequestreviewallowed() bool`

GetIsrequestreviewallowed returns the Isrequestreviewallowed field if non-nil, zero value otherwise.

### GetIsrequestreviewallowedOk

`func (o *CoreCompetencyReadPlan200Response) GetIsrequestreviewallowedOk() (*bool, bool)`

GetIsrequestreviewallowedOk returns a tuple with the Isrequestreviewallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsrequestreviewallowed

`func (o *CoreCompetencyReadPlan200Response) SetIsrequestreviewallowed(v bool)`

SetIsrequestreviewallowed sets Isrequestreviewallowed field to given value.


### GetIsstartreviewallowed

`func (o *CoreCompetencyReadPlan200Response) GetIsstartreviewallowed() bool`

GetIsstartreviewallowed returns the Isstartreviewallowed field if non-nil, zero value otherwise.

### GetIsstartreviewallowedOk

`func (o *CoreCompetencyReadPlan200Response) GetIsstartreviewallowedOk() (*bool, bool)`

GetIsstartreviewallowedOk returns a tuple with the Isstartreviewallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsstartreviewallowed

`func (o *CoreCompetencyReadPlan200Response) SetIsstartreviewallowed(v bool)`

SetIsstartreviewallowed sets Isstartreviewallowed field to given value.


### GetIsstopreviewallowed

`func (o *CoreCompetencyReadPlan200Response) GetIsstopreviewallowed() bool`

GetIsstopreviewallowed returns the Isstopreviewallowed field if non-nil, zero value otherwise.

### GetIsstopreviewallowedOk

`func (o *CoreCompetencyReadPlan200Response) GetIsstopreviewallowedOk() (*bool, bool)`

GetIsstopreviewallowedOk returns a tuple with the Isstopreviewallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsstopreviewallowed

`func (o *CoreCompetencyReadPlan200Response) SetIsstopreviewallowed(v bool)`

SetIsstopreviewallowed sets Isstopreviewallowed field to given value.


### GetIsunapproveallowed

`func (o *CoreCompetencyReadPlan200Response) GetIsunapproveallowed() bool`

GetIsunapproveallowed returns the Isunapproveallowed field if non-nil, zero value otherwise.

### GetIsunapproveallowedOk

`func (o *CoreCompetencyReadPlan200Response) GetIsunapproveallowedOk() (*bool, bool)`

GetIsunapproveallowedOk returns a tuple with the Isunapproveallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsunapproveallowed

`func (o *CoreCompetencyReadPlan200Response) SetIsunapproveallowed(v bool)`

SetIsunapproveallowed sets Isunapproveallowed field to given value.


### GetIsunlinkallowed

`func (o *CoreCompetencyReadPlan200Response) GetIsunlinkallowed() bool`

GetIsunlinkallowed returns the Isunlinkallowed field if non-nil, zero value otherwise.

### GetIsunlinkallowedOk

`func (o *CoreCompetencyReadPlan200Response) GetIsunlinkallowedOk() (*bool, bool)`

GetIsunlinkallowedOk returns a tuple with the Isunlinkallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsunlinkallowed

`func (o *CoreCompetencyReadPlan200Response) SetIsunlinkallowed(v bool)`

SetIsunlinkallowed sets Isunlinkallowed field to given value.


### GetIswaitingforreview

`func (o *CoreCompetencyReadPlan200Response) GetIswaitingforreview() bool`

GetIswaitingforreview returns the Iswaitingforreview field if non-nil, zero value otherwise.

### GetIswaitingforreviewOk

`func (o *CoreCompetencyReadPlan200Response) GetIswaitingforreviewOk() (*bool, bool)`

GetIswaitingforreviewOk returns a tuple with the Iswaitingforreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIswaitingforreview

`func (o *CoreCompetencyReadPlan200Response) SetIswaitingforreview(v bool)`

SetIswaitingforreview sets Iswaitingforreview field to given value.


### GetName

`func (o *CoreCompetencyReadPlan200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCompetencyReadPlan200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCompetencyReadPlan200Response) SetName(v string)`

SetName sets Name field to given value.


### GetOrigtemplateid

`func (o *CoreCompetencyReadPlan200Response) GetOrigtemplateid() int32`

GetOrigtemplateid returns the Origtemplateid field if non-nil, zero value otherwise.

### GetOrigtemplateidOk

`func (o *CoreCompetencyReadPlan200Response) GetOrigtemplateidOk() (*int32, bool)`

GetOrigtemplateidOk returns a tuple with the Origtemplateid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrigtemplateid

`func (o *CoreCompetencyReadPlan200Response) SetOrigtemplateid(v int32)`

SetOrigtemplateid sets Origtemplateid field to given value.


### GetReviewer

`func (o *CoreCompetencyReadPlan200Response) GetReviewer() CoreCompetencyGradeCompetency200ResponseActionuser`

GetReviewer returns the Reviewer field if non-nil, zero value otherwise.

### GetReviewerOk

`func (o *CoreCompetencyReadPlan200Response) GetReviewerOk() (*CoreCompetencyGradeCompetency200ResponseActionuser, bool)`

GetReviewerOk returns a tuple with the Reviewer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewer

`func (o *CoreCompetencyReadPlan200Response) SetReviewer(v CoreCompetencyGradeCompetency200ResponseActionuser)`

SetReviewer sets Reviewer field to given value.

### HasReviewer

`func (o *CoreCompetencyReadPlan200Response) HasReviewer() bool`

HasReviewer returns a boolean if a field has been set.

### GetReviewerid

`func (o *CoreCompetencyReadPlan200Response) GetReviewerid() int32`

GetReviewerid returns the Reviewerid field if non-nil, zero value otherwise.

### GetRevieweridOk

`func (o *CoreCompetencyReadPlan200Response) GetRevieweridOk() (*int32, bool)`

GetRevieweridOk returns a tuple with the Reviewerid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewerid

`func (o *CoreCompetencyReadPlan200Response) SetReviewerid(v int32)`

SetReviewerid sets Reviewerid field to given value.


### GetStatus

`func (o *CoreCompetencyReadPlan200Response) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreCompetencyReadPlan200Response) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreCompetencyReadPlan200Response) SetStatus(v int32)`

SetStatus sets Status field to given value.


### GetStatusname

`func (o *CoreCompetencyReadPlan200Response) GetStatusname() string`

GetStatusname returns the Statusname field if non-nil, zero value otherwise.

### GetStatusnameOk

`func (o *CoreCompetencyReadPlan200Response) GetStatusnameOk() (*string, bool)`

GetStatusnameOk returns a tuple with the Statusname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusname

`func (o *CoreCompetencyReadPlan200Response) SetStatusname(v string)`

SetStatusname sets Statusname field to given value.


### GetTemplate

`func (o *CoreCompetencyReadPlan200Response) GetTemplate() CoreCompetencyCreateTemplate200Response`

GetTemplate returns the Template field if non-nil, zero value otherwise.

### GetTemplateOk

`func (o *CoreCompetencyReadPlan200Response) GetTemplateOk() (*CoreCompetencyCreateTemplate200Response, bool)`

GetTemplateOk returns a tuple with the Template field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplate

`func (o *CoreCompetencyReadPlan200Response) SetTemplate(v CoreCompetencyCreateTemplate200Response)`

SetTemplate sets Template field to given value.

### HasTemplate

`func (o *CoreCompetencyReadPlan200Response) HasTemplate() bool`

HasTemplate returns a boolean if a field has been set.

### GetTemplateid

`func (o *CoreCompetencyReadPlan200Response) GetTemplateid() int32`

GetTemplateid returns the Templateid field if non-nil, zero value otherwise.

### GetTemplateidOk

`func (o *CoreCompetencyReadPlan200Response) GetTemplateidOk() (*int32, bool)`

GetTemplateidOk returns a tuple with the Templateid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateid

`func (o *CoreCompetencyReadPlan200Response) SetTemplateid(v int32)`

SetTemplateid sets Templateid field to given value.


### GetTimecreated

`func (o *CoreCompetencyReadPlan200Response) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyReadPlan200Response) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyReadPlan200Response) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *CoreCompetencyReadPlan200Response) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyReadPlan200Response) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyReadPlan200Response) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUrl

`func (o *CoreCompetencyReadPlan200Response) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CoreCompetencyReadPlan200Response) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CoreCompetencyReadPlan200Response) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetUserid

`func (o *CoreCompetencyReadPlan200Response) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCompetencyReadPlan200Response) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCompetencyReadPlan200Response) SetUserid(v int32)`

SetUserid sets Userid field to given value.


### GetUsermodified

`func (o *CoreCompetencyReadPlan200Response) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyReadPlan200Response) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyReadPlan200Response) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


