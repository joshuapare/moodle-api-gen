# CoreCompetencyCreateTemplate200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanage** | **bool** | canmanage | 
**Canread** | **bool** | canread | 
**Cohortscount** | **int32** | cohortscount | 
**Contextid** | **int32** | contextid | 
**Contextname** | **string** | contextname | 
**Contextnamenoprefix** | **string** | contextnamenoprefix | 
**Description** | **string** | description | [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Duedate** | **int32** | duedate | [default to 0]
**Duedateformatted** | **string** | duedateformatted | 
**Id** | **int32** | id | [default to 0]
**Planscount** | **int32** | planscount | 
**Shortname** | **string** | shortname | 
**Timecreated** | **int32** | timecreated | [default to 0]
**Timemodified** | **int32** | timemodified | [default to 0]
**Usermodified** | **int32** | usermodified | [default to 0]
**Visible** | **bool** | visible | [default to 1]

## Methods

### NewCoreCompetencyCreateTemplate200Response

`func NewCoreCompetencyCreateTemplate200Response(canmanage bool, canread bool, cohortscount int32, contextid int32, contextname string, contextnamenoprefix string, description string, duedate int32, duedateformatted string, id int32, planscount int32, shortname string, timecreated int32, timemodified int32, usermodified int32, visible bool, ) *CoreCompetencyCreateTemplate200Response`

NewCoreCompetencyCreateTemplate200Response instantiates a new CoreCompetencyCreateTemplate200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyCreateTemplate200ResponseWithDefaults

`func NewCoreCompetencyCreateTemplate200ResponseWithDefaults() *CoreCompetencyCreateTemplate200Response`

NewCoreCompetencyCreateTemplate200ResponseWithDefaults instantiates a new CoreCompetencyCreateTemplate200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanage

`func (o *CoreCompetencyCreateTemplate200Response) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *CoreCompetencyCreateTemplate200Response) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *CoreCompetencyCreateTemplate200Response) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.


### GetCanread

`func (o *CoreCompetencyCreateTemplate200Response) GetCanread() bool`

GetCanread returns the Canread field if non-nil, zero value otherwise.

### GetCanreadOk

`func (o *CoreCompetencyCreateTemplate200Response) GetCanreadOk() (*bool, bool)`

GetCanreadOk returns a tuple with the Canread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanread

`func (o *CoreCompetencyCreateTemplate200Response) SetCanread(v bool)`

SetCanread sets Canread field to given value.


### GetCohortscount

`func (o *CoreCompetencyCreateTemplate200Response) GetCohortscount() int32`

GetCohortscount returns the Cohortscount field if non-nil, zero value otherwise.

### GetCohortscountOk

`func (o *CoreCompetencyCreateTemplate200Response) GetCohortscountOk() (*int32, bool)`

GetCohortscountOk returns a tuple with the Cohortscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCohortscount

`func (o *CoreCompetencyCreateTemplate200Response) SetCohortscount(v int32)`

SetCohortscount sets Cohortscount field to given value.


### GetContextid

`func (o *CoreCompetencyCreateTemplate200Response) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreCompetencyCreateTemplate200Response) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreCompetencyCreateTemplate200Response) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetContextname

`func (o *CoreCompetencyCreateTemplate200Response) GetContextname() string`

GetContextname returns the Contextname field if non-nil, zero value otherwise.

### GetContextnameOk

`func (o *CoreCompetencyCreateTemplate200Response) GetContextnameOk() (*string, bool)`

GetContextnameOk returns a tuple with the Contextname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextname

`func (o *CoreCompetencyCreateTemplate200Response) SetContextname(v string)`

SetContextname sets Contextname field to given value.


### GetContextnamenoprefix

`func (o *CoreCompetencyCreateTemplate200Response) GetContextnamenoprefix() string`

GetContextnamenoprefix returns the Contextnamenoprefix field if non-nil, zero value otherwise.

### GetContextnamenoprefixOk

`func (o *CoreCompetencyCreateTemplate200Response) GetContextnamenoprefixOk() (*string, bool)`

GetContextnamenoprefixOk returns a tuple with the Contextnamenoprefix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextnamenoprefix

`func (o *CoreCompetencyCreateTemplate200Response) SetContextnamenoprefix(v string)`

SetContextnamenoprefix sets Contextnamenoprefix field to given value.


### GetDescription

`func (o *CoreCompetencyCreateTemplate200Response) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyCreateTemplate200Response) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyCreateTemplate200Response) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetDescriptionformat

`func (o *CoreCompetencyCreateTemplate200Response) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyCreateTemplate200Response) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyCreateTemplate200Response) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyCreateTemplate200Response) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetDuedate

`func (o *CoreCompetencyCreateTemplate200Response) GetDuedate() int32`

GetDuedate returns the Duedate field if non-nil, zero value otherwise.

### GetDuedateOk

`func (o *CoreCompetencyCreateTemplate200Response) GetDuedateOk() (*int32, bool)`

GetDuedateOk returns a tuple with the Duedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedate

`func (o *CoreCompetencyCreateTemplate200Response) SetDuedate(v int32)`

SetDuedate sets Duedate field to given value.


### GetDuedateformatted

`func (o *CoreCompetencyCreateTemplate200Response) GetDuedateformatted() string`

GetDuedateformatted returns the Duedateformatted field if non-nil, zero value otherwise.

### GetDuedateformattedOk

`func (o *CoreCompetencyCreateTemplate200Response) GetDuedateformattedOk() (*string, bool)`

GetDuedateformattedOk returns a tuple with the Duedateformatted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedateformatted

`func (o *CoreCompetencyCreateTemplate200Response) SetDuedateformatted(v string)`

SetDuedateformatted sets Duedateformatted field to given value.


### GetId

`func (o *CoreCompetencyCreateTemplate200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCompetencyCreateTemplate200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCompetencyCreateTemplate200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetPlanscount

`func (o *CoreCompetencyCreateTemplate200Response) GetPlanscount() int32`

GetPlanscount returns the Planscount field if non-nil, zero value otherwise.

### GetPlanscountOk

`func (o *CoreCompetencyCreateTemplate200Response) GetPlanscountOk() (*int32, bool)`

GetPlanscountOk returns a tuple with the Planscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlanscount

`func (o *CoreCompetencyCreateTemplate200Response) SetPlanscount(v int32)`

SetPlanscount sets Planscount field to given value.


### GetShortname

`func (o *CoreCompetencyCreateTemplate200Response) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCompetencyCreateTemplate200Response) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCompetencyCreateTemplate200Response) SetShortname(v string)`

SetShortname sets Shortname field to given value.


### GetTimecreated

`func (o *CoreCompetencyCreateTemplate200Response) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyCreateTemplate200Response) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyCreateTemplate200Response) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *CoreCompetencyCreateTemplate200Response) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyCreateTemplate200Response) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyCreateTemplate200Response) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUsermodified

`func (o *CoreCompetencyCreateTemplate200Response) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyCreateTemplate200Response) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyCreateTemplate200Response) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.


### GetVisible

`func (o *CoreCompetencyCreateTemplate200Response) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCompetencyCreateTemplate200Response) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCompetencyCreateTemplate200Response) SetVisible(v bool)`

SetVisible sets Visible field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


