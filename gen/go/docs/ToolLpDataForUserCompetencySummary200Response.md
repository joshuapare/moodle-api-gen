# ToolLpDataForUserCompetencySummary200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cangrade** | **bool** | cangrade | [default to null]
**Commentarea** | Pointer to [**CoreCompetencyReadPlan200ResponseCommentarea**](CoreCompetencyReadPlan200ResponseCommentarea.md) |  | [optional] 
**Competency** | [**ToolLpDataForCompetencySummary200Response**](ToolLpDataForCompetencySummary200Response.md) |  | 
**Evidence** | [**[]ToolLpDataForUserCompetencySummary200ResponseEvidenceInner**](ToolLpDataForUserCompetencySummary200ResponseEvidenceInner.md) |  | 
**Showrelatedcompetencies** | **bool** | showrelatedcompetencies | [default to null]
**User** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | 
**Usercompetency** | Pointer to [**ToolLpDataForUserCompetencySummary200ResponseUsercompetency**](ToolLpDataForUserCompetencySummary200ResponseUsercompetency.md) |  | [optional] 
**Usercompetencycourse** | Pointer to [**ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse.md) |  | [optional] 
**Usercompetencyplan** | Pointer to [**ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan**](ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan.md) |  | [optional] 

## Methods

### NewToolLpDataForUserCompetencySummary200Response

`func NewToolLpDataForUserCompetencySummary200Response(cangrade bool, competency ToolLpDataForCompetencySummary200Response, evidence []ToolLpDataForUserCompetencySummary200ResponseEvidenceInner, showrelatedcompetencies bool, user CoreCompetencyGradeCompetency200ResponseActionuser, ) *ToolLpDataForUserCompetencySummary200Response`

NewToolLpDataForUserCompetencySummary200Response instantiates a new ToolLpDataForUserCompetencySummary200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForUserCompetencySummary200ResponseWithDefaults

`func NewToolLpDataForUserCompetencySummary200ResponseWithDefaults() *ToolLpDataForUserCompetencySummary200Response`

NewToolLpDataForUserCompetencySummary200ResponseWithDefaults instantiates a new ToolLpDataForUserCompetencySummary200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCangrade

`func (o *ToolLpDataForUserCompetencySummary200Response) GetCangrade() bool`

GetCangrade returns the Cangrade field if non-nil, zero value otherwise.

### GetCangradeOk

`func (o *ToolLpDataForUserCompetencySummary200Response) GetCangradeOk() (*bool, bool)`

GetCangradeOk returns a tuple with the Cangrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCangrade

`func (o *ToolLpDataForUserCompetencySummary200Response) SetCangrade(v bool)`

SetCangrade sets Cangrade field to given value.


### GetCommentarea

`func (o *ToolLpDataForUserCompetencySummary200Response) GetCommentarea() CoreCompetencyReadPlan200ResponseCommentarea`

GetCommentarea returns the Commentarea field if non-nil, zero value otherwise.

### GetCommentareaOk

`func (o *ToolLpDataForUserCompetencySummary200Response) GetCommentareaOk() (*CoreCompetencyReadPlan200ResponseCommentarea, bool)`

GetCommentareaOk returns a tuple with the Commentarea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommentarea

`func (o *ToolLpDataForUserCompetencySummary200Response) SetCommentarea(v CoreCompetencyReadPlan200ResponseCommentarea)`

SetCommentarea sets Commentarea field to given value.

### HasCommentarea

`func (o *ToolLpDataForUserCompetencySummary200Response) HasCommentarea() bool`

HasCommentarea returns a boolean if a field has been set.

### GetCompetency

`func (o *ToolLpDataForUserCompetencySummary200Response) GetCompetency() ToolLpDataForCompetencySummary200Response`

GetCompetency returns the Competency field if non-nil, zero value otherwise.

### GetCompetencyOk

`func (o *ToolLpDataForUserCompetencySummary200Response) GetCompetencyOk() (*ToolLpDataForCompetencySummary200Response, bool)`

GetCompetencyOk returns a tuple with the Competency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetency

`func (o *ToolLpDataForUserCompetencySummary200Response) SetCompetency(v ToolLpDataForCompetencySummary200Response)`

SetCompetency sets Competency field to given value.


### GetEvidence

`func (o *ToolLpDataForUserCompetencySummary200Response) GetEvidence() []ToolLpDataForUserCompetencySummary200ResponseEvidenceInner`

GetEvidence returns the Evidence field if non-nil, zero value otherwise.

### GetEvidenceOk

`func (o *ToolLpDataForUserCompetencySummary200Response) GetEvidenceOk() (*[]ToolLpDataForUserCompetencySummary200ResponseEvidenceInner, bool)`

GetEvidenceOk returns a tuple with the Evidence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvidence

`func (o *ToolLpDataForUserCompetencySummary200Response) SetEvidence(v []ToolLpDataForUserCompetencySummary200ResponseEvidenceInner)`

SetEvidence sets Evidence field to given value.


### GetShowrelatedcompetencies

`func (o *ToolLpDataForUserCompetencySummary200Response) GetShowrelatedcompetencies() bool`

GetShowrelatedcompetencies returns the Showrelatedcompetencies field if non-nil, zero value otherwise.

### GetShowrelatedcompetenciesOk

`func (o *ToolLpDataForUserCompetencySummary200Response) GetShowrelatedcompetenciesOk() (*bool, bool)`

GetShowrelatedcompetenciesOk returns a tuple with the Showrelatedcompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowrelatedcompetencies

`func (o *ToolLpDataForUserCompetencySummary200Response) SetShowrelatedcompetencies(v bool)`

SetShowrelatedcompetencies sets Showrelatedcompetencies field to given value.


### GetUser

`func (o *ToolLpDataForUserCompetencySummary200Response) GetUser() CoreCompetencyGradeCompetency200ResponseActionuser`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ToolLpDataForUserCompetencySummary200Response) GetUserOk() (*CoreCompetencyGradeCompetency200ResponseActionuser, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ToolLpDataForUserCompetencySummary200Response) SetUser(v CoreCompetencyGradeCompetency200ResponseActionuser)`

SetUser sets User field to given value.


### GetUsercompetency

`func (o *ToolLpDataForUserCompetencySummary200Response) GetUsercompetency() ToolLpDataForUserCompetencySummary200ResponseUsercompetency`

GetUsercompetency returns the Usercompetency field if non-nil, zero value otherwise.

### GetUsercompetencyOk

`func (o *ToolLpDataForUserCompetencySummary200Response) GetUsercompetencyOk() (*ToolLpDataForUserCompetencySummary200ResponseUsercompetency, bool)`

GetUsercompetencyOk returns a tuple with the Usercompetency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercompetency

`func (o *ToolLpDataForUserCompetencySummary200Response) SetUsercompetency(v ToolLpDataForUserCompetencySummary200ResponseUsercompetency)`

SetUsercompetency sets Usercompetency field to given value.

### HasUsercompetency

`func (o *ToolLpDataForUserCompetencySummary200Response) HasUsercompetency() bool`

HasUsercompetency returns a boolean if a field has been set.

### GetUsercompetencycourse

`func (o *ToolLpDataForUserCompetencySummary200Response) GetUsercompetencycourse() ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse`

GetUsercompetencycourse returns the Usercompetencycourse field if non-nil, zero value otherwise.

### GetUsercompetencycourseOk

`func (o *ToolLpDataForUserCompetencySummary200Response) GetUsercompetencycourseOk() (*ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse, bool)`

GetUsercompetencycourseOk returns a tuple with the Usercompetencycourse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercompetencycourse

`func (o *ToolLpDataForUserCompetencySummary200Response) SetUsercompetencycourse(v ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse)`

SetUsercompetencycourse sets Usercompetencycourse field to given value.

### HasUsercompetencycourse

`func (o *ToolLpDataForUserCompetencySummary200Response) HasUsercompetencycourse() bool`

HasUsercompetencycourse returns a boolean if a field has been set.

### GetUsercompetencyplan

`func (o *ToolLpDataForUserCompetencySummary200Response) GetUsercompetencyplan() ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan`

GetUsercompetencyplan returns the Usercompetencyplan field if non-nil, zero value otherwise.

### GetUsercompetencyplanOk

`func (o *ToolLpDataForUserCompetencySummary200Response) GetUsercompetencyplanOk() (*ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan, bool)`

GetUsercompetencyplanOk returns a tuple with the Usercompetencyplan field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercompetencyplan

`func (o *ToolLpDataForUserCompetencySummary200Response) SetUsercompetencyplan(v ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan)`

SetUsercompetencyplan sets Usercompetencyplan field to given value.

### HasUsercompetencyplan

`func (o *ToolLpDataForUserCompetencySummary200Response) HasUsercompetencyplan() bool`

HasUsercompetencyplan returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


