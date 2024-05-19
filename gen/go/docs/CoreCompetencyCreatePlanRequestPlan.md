# CoreCompetencyCreatePlanRequestPlan

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | description | [optional] [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Duedate** | Pointer to **int32** | duedate | [optional] [default to 0]
**Name** | **string** | name | 
**Origtemplateid** | Pointer to **int32** | origtemplateid | [optional] [default to null]
**Reviewerid** | Pointer to **int32** | reviewerid | [optional] [default to null]
**Status** | Pointer to **int32** | status | [optional] [default to 0]
**Templateid** | Pointer to **int32** | templateid | [optional] [default to null]
**Timecreated** | Pointer to **int32** | timecreated | [optional] [default to 0]
**Timemodified** | Pointer to **int32** | timemodified | [optional] [default to 0]
**Userid** | **int32** | userid | [default to null]
**Usermodified** | Pointer to **int32** | usermodified | [optional] [default to 0]

## Methods

### NewCoreCompetencyCreatePlanRequestPlan

`func NewCoreCompetencyCreatePlanRequestPlan(name string, userid int32, ) *CoreCompetencyCreatePlanRequestPlan`

NewCoreCompetencyCreatePlanRequestPlan instantiates a new CoreCompetencyCreatePlanRequestPlan object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyCreatePlanRequestPlanWithDefaults

`func NewCoreCompetencyCreatePlanRequestPlanWithDefaults() *CoreCompetencyCreatePlanRequestPlan`

NewCoreCompetencyCreatePlanRequestPlanWithDefaults instantiates a new CoreCompetencyCreatePlanRequestPlan object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *CoreCompetencyCreatePlanRequestPlan) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyCreatePlanRequestPlan) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCompetencyCreatePlanRequestPlan) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCompetencyCreatePlanRequestPlan) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyCreatePlanRequestPlan) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyCreatePlanRequestPlan) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetDuedate

`func (o *CoreCompetencyCreatePlanRequestPlan) GetDuedate() int32`

GetDuedate returns the Duedate field if non-nil, zero value otherwise.

### GetDuedateOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetDuedateOk() (*int32, bool)`

GetDuedateOk returns a tuple with the Duedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedate

`func (o *CoreCompetencyCreatePlanRequestPlan) SetDuedate(v int32)`

SetDuedate sets Duedate field to given value.

### HasDuedate

`func (o *CoreCompetencyCreatePlanRequestPlan) HasDuedate() bool`

HasDuedate returns a boolean if a field has been set.

### GetName

`func (o *CoreCompetencyCreatePlanRequestPlan) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCompetencyCreatePlanRequestPlan) SetName(v string)`

SetName sets Name field to given value.


### GetOrigtemplateid

`func (o *CoreCompetencyCreatePlanRequestPlan) GetOrigtemplateid() int32`

GetOrigtemplateid returns the Origtemplateid field if non-nil, zero value otherwise.

### GetOrigtemplateidOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetOrigtemplateidOk() (*int32, bool)`

GetOrigtemplateidOk returns a tuple with the Origtemplateid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrigtemplateid

`func (o *CoreCompetencyCreatePlanRequestPlan) SetOrigtemplateid(v int32)`

SetOrigtemplateid sets Origtemplateid field to given value.

### HasOrigtemplateid

`func (o *CoreCompetencyCreatePlanRequestPlan) HasOrigtemplateid() bool`

HasOrigtemplateid returns a boolean if a field has been set.

### GetReviewerid

`func (o *CoreCompetencyCreatePlanRequestPlan) GetReviewerid() int32`

GetReviewerid returns the Reviewerid field if non-nil, zero value otherwise.

### GetRevieweridOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetRevieweridOk() (*int32, bool)`

GetRevieweridOk returns a tuple with the Reviewerid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewerid

`func (o *CoreCompetencyCreatePlanRequestPlan) SetReviewerid(v int32)`

SetReviewerid sets Reviewerid field to given value.

### HasReviewerid

`func (o *CoreCompetencyCreatePlanRequestPlan) HasReviewerid() bool`

HasReviewerid returns a boolean if a field has been set.

### GetStatus

`func (o *CoreCompetencyCreatePlanRequestPlan) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreCompetencyCreatePlanRequestPlan) SetStatus(v int32)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CoreCompetencyCreatePlanRequestPlan) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTemplateid

`func (o *CoreCompetencyCreatePlanRequestPlan) GetTemplateid() int32`

GetTemplateid returns the Templateid field if non-nil, zero value otherwise.

### GetTemplateidOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetTemplateidOk() (*int32, bool)`

GetTemplateidOk returns a tuple with the Templateid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateid

`func (o *CoreCompetencyCreatePlanRequestPlan) SetTemplateid(v int32)`

SetTemplateid sets Templateid field to given value.

### HasTemplateid

`func (o *CoreCompetencyCreatePlanRequestPlan) HasTemplateid() bool`

HasTemplateid returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreCompetencyCreatePlanRequestPlan) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyCreatePlanRequestPlan) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreCompetencyCreatePlanRequestPlan) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCompetencyCreatePlanRequestPlan) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyCreatePlanRequestPlan) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCompetencyCreatePlanRequestPlan) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCompetencyCreatePlanRequestPlan) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCompetencyCreatePlanRequestPlan) SetUserid(v int32)`

SetUserid sets Userid field to given value.


### GetUsermodified

`func (o *CoreCompetencyCreatePlanRequestPlan) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyCreatePlanRequestPlan) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyCreatePlanRequestPlan) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreCompetencyCreatePlanRequestPlan) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


