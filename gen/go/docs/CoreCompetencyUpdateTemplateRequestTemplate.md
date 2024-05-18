# CoreCompetencyUpdateTemplateRequestTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | Pointer to **int32** | The context id | [optional] 
**Contextlevel** | Pointer to **string** | The context level | [optional] 
**Description** | Pointer to **string** | description | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Duedate** | Pointer to **int32** | duedate | [optional] 
**Id** | **int32** | id | 
**Instanceid** | Pointer to **int32** | The Instance id | [optional] 
**Shortname** | Pointer to **string** | shortname | [optional] 
**Timecreated** | Pointer to **int32** | timecreated | [optional] 
**Timemodified** | Pointer to **int32** | timemodified | [optional] 
**Usermodified** | Pointer to **int32** | usermodified | [optional] 
**Visible** | Pointer to **bool** | visible | [optional] 

## Methods

### NewCoreCompetencyUpdateTemplateRequestTemplate

`func NewCoreCompetencyUpdateTemplateRequestTemplate(id int32, ) *CoreCompetencyUpdateTemplateRequestTemplate`

NewCoreCompetencyUpdateTemplateRequestTemplate instantiates a new CoreCompetencyUpdateTemplateRequestTemplate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyUpdateTemplateRequestTemplateWithDefaults

`func NewCoreCompetencyUpdateTemplateRequestTemplateWithDefaults() *CoreCompetencyUpdateTemplateRequestTemplate`

NewCoreCompetencyUpdateTemplateRequestTemplateWithDefaults instantiates a new CoreCompetencyUpdateTemplateRequestTemplate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextid

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetContextlevel

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.

### HasContextlevel

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) HasContextlevel() bool`

HasContextlevel returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetDuedate

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetDuedate() int32`

GetDuedate returns the Duedate field if non-nil, zero value otherwise.

### GetDuedateOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetDuedateOk() (*int32, bool)`

GetDuedateOk returns a tuple with the Duedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedate

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetDuedate(v int32)`

SetDuedate sets Duedate field to given value.

### HasDuedate

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) HasDuedate() bool`

HasDuedate returns a boolean if a field has been set.

### GetId

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetId(v int32)`

SetId sets Id field to given value.


### GetInstanceid

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetShortname

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetShortname(v string)`

SetShortname sets Shortname field to given value.

### HasShortname

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) HasShortname() bool`

HasShortname returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCompetencyUpdateTemplateRequestTemplate) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


