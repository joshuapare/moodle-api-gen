# CoreCompetencyUpdatePlanRequestPlan

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | description | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Duedate** | Pointer to **int32** | duedate | [optional] [default to null]
**Id** | **int32** | id | 
**Name** | Pointer to **string** | name | [optional] 
**Origtemplateid** | Pointer to **int32** | origtemplateid | [optional] 
**Reviewerid** | Pointer to **int32** | reviewerid | [optional] 
**Status** | Pointer to **int32** | status | [optional] [default to null]
**Templateid** | Pointer to **int32** | templateid | [optional] 
**Timecreated** | Pointer to **int32** | timecreated | [optional] 
**Timemodified** | Pointer to **int32** | timemodified | [optional] 
**Userid** | Pointer to **int32** | userid | [optional] 
**Usermodified** | Pointer to **int32** | usermodified | [optional] 

## Methods

### NewCoreCompetencyUpdatePlanRequestPlan

`func NewCoreCompetencyUpdatePlanRequestPlan(id int32, ) *CoreCompetencyUpdatePlanRequestPlan`

NewCoreCompetencyUpdatePlanRequestPlan instantiates a new CoreCompetencyUpdatePlanRequestPlan object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyUpdatePlanRequestPlanWithDefaults

`func NewCoreCompetencyUpdatePlanRequestPlanWithDefaults() *CoreCompetencyUpdatePlanRequestPlan`

NewCoreCompetencyUpdatePlanRequestPlanWithDefaults instantiates a new CoreCompetencyUpdatePlanRequestPlan object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetDuedate

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetDuedate() int32`

GetDuedate returns the Duedate field if non-nil, zero value otherwise.

### GetDuedateOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetDuedateOk() (*int32, bool)`

GetDuedateOk returns a tuple with the Duedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedate

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetDuedate(v int32)`

SetDuedate sets Duedate field to given value.

### HasDuedate

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasDuedate() bool`

HasDuedate returns a boolean if a field has been set.

### GetId

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOrigtemplateid

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetOrigtemplateid() int32`

GetOrigtemplateid returns the Origtemplateid field if non-nil, zero value otherwise.

### GetOrigtemplateidOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetOrigtemplateidOk() (*int32, bool)`

GetOrigtemplateidOk returns a tuple with the Origtemplateid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrigtemplateid

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetOrigtemplateid(v int32)`

SetOrigtemplateid sets Origtemplateid field to given value.

### HasOrigtemplateid

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasOrigtemplateid() bool`

HasOrigtemplateid returns a boolean if a field has been set.

### GetReviewerid

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetReviewerid() int32`

GetReviewerid returns the Reviewerid field if non-nil, zero value otherwise.

### GetRevieweridOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetRevieweridOk() (*int32, bool)`

GetRevieweridOk returns a tuple with the Reviewerid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewerid

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetReviewerid(v int32)`

SetReviewerid sets Reviewerid field to given value.

### HasReviewerid

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasReviewerid() bool`

HasReviewerid returns a boolean if a field has been set.

### GetStatus

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetStatus(v int32)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTemplateid

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetTemplateid() int32`

GetTemplateid returns the Templateid field if non-nil, zero value otherwise.

### GetTemplateidOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetTemplateidOk() (*int32, bool)`

GetTemplateidOk returns a tuple with the Templateid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateid

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetTemplateid(v int32)`

SetTemplateid sets Templateid field to given value.

### HasTemplateid

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasTemplateid() bool`

HasTemplateid returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyUpdatePlanRequestPlan) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyUpdatePlanRequestPlan) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreCompetencyUpdatePlanRequestPlan) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


