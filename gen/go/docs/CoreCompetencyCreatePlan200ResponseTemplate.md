# CoreCompetencyCreatePlan200ResponseTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanage** | **bool** | canmanage | 
**Canread** | **bool** | canread | [default to null]
**Cohortscount** | **int32** | cohortscount | [default to null]
**Contextid** | **int32** | contextid | 
**Contextname** | **string** | contextname | 
**Contextnamenoprefix** | **string** | contextnamenoprefix | 
**Description** | **string** | description | [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Duedate** | **int32** | duedate | [default to 0]
**Duedateformatted** | **string** | duedateformatted | 
**Id** | **int32** | id | [default to 0]
**Planscount** | **int32** | planscount | [default to null]
**Shortname** | **string** | shortname | 
**Timecreated** | **int32** | timecreated | [default to 0]
**Timemodified** | **int32** | timemodified | [default to 0]
**Usermodified** | **int32** | usermodified | [default to 0]
**Visible** | **bool** | visible | [default to 1]

## Methods

### NewCoreCompetencyCreatePlan200ResponseTemplate

`func NewCoreCompetencyCreatePlan200ResponseTemplate(canmanage bool, canread bool, cohortscount int32, contextid int32, contextname string, contextnamenoprefix string, description string, duedate int32, duedateformatted string, id int32, planscount int32, shortname string, timecreated int32, timemodified int32, usermodified int32, visible bool, ) *CoreCompetencyCreatePlan200ResponseTemplate`

NewCoreCompetencyCreatePlan200ResponseTemplate instantiates a new CoreCompetencyCreatePlan200ResponseTemplate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyCreatePlan200ResponseTemplateWithDefaults

`func NewCoreCompetencyCreatePlan200ResponseTemplateWithDefaults() *CoreCompetencyCreatePlan200ResponseTemplate`

NewCoreCompetencyCreatePlan200ResponseTemplateWithDefaults instantiates a new CoreCompetencyCreatePlan200ResponseTemplate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanage

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.


### GetCanread

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetCanread() bool`

GetCanread returns the Canread field if non-nil, zero value otherwise.

### GetCanreadOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetCanreadOk() (*bool, bool)`

GetCanreadOk returns a tuple with the Canread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanread

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetCanread(v bool)`

SetCanread sets Canread field to given value.


### GetCohortscount

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetCohortscount() int32`

GetCohortscount returns the Cohortscount field if non-nil, zero value otherwise.

### GetCohortscountOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetCohortscountOk() (*int32, bool)`

GetCohortscountOk returns a tuple with the Cohortscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCohortscount

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetCohortscount(v int32)`

SetCohortscount sets Cohortscount field to given value.


### GetContextid

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetContextname

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetContextname() string`

GetContextname returns the Contextname field if non-nil, zero value otherwise.

### GetContextnameOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetContextnameOk() (*string, bool)`

GetContextnameOk returns a tuple with the Contextname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextname

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetContextname(v string)`

SetContextname sets Contextname field to given value.


### GetContextnamenoprefix

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetContextnamenoprefix() string`

GetContextnamenoprefix returns the Contextnamenoprefix field if non-nil, zero value otherwise.

### GetContextnamenoprefixOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetContextnamenoprefixOk() (*string, bool)`

GetContextnamenoprefixOk returns a tuple with the Contextnamenoprefix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextnamenoprefix

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetContextnamenoprefix(v string)`

SetContextnamenoprefix sets Contextnamenoprefix field to given value.


### GetDescription

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetDescriptionformat

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetDuedate

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetDuedate() int32`

GetDuedate returns the Duedate field if non-nil, zero value otherwise.

### GetDuedateOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetDuedateOk() (*int32, bool)`

GetDuedateOk returns a tuple with the Duedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedate

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetDuedate(v int32)`

SetDuedate sets Duedate field to given value.


### GetDuedateformatted

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetDuedateformatted() string`

GetDuedateformatted returns the Duedateformatted field if non-nil, zero value otherwise.

### GetDuedateformattedOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetDuedateformattedOk() (*string, bool)`

GetDuedateformattedOk returns a tuple with the Duedateformatted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedateformatted

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetDuedateformatted(v string)`

SetDuedateformatted sets Duedateformatted field to given value.


### GetId

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetId(v int32)`

SetId sets Id field to given value.


### GetPlanscount

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetPlanscount() int32`

GetPlanscount returns the Planscount field if non-nil, zero value otherwise.

### GetPlanscountOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetPlanscountOk() (*int32, bool)`

GetPlanscountOk returns a tuple with the Planscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlanscount

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetPlanscount(v int32)`

SetPlanscount sets Planscount field to given value.


### GetShortname

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetShortname(v string)`

SetShortname sets Shortname field to given value.


### GetTimecreated

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUsermodified

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.


### GetVisible

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCompetencyCreatePlan200ResponseTemplate) SetVisible(v bool)`

SetVisible sets Visible field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


