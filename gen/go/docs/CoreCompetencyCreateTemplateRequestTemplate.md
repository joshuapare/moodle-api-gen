# CoreCompetencyCreateTemplateRequestTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | Pointer to **int32** | The context id | [optional] 
**Contextlevel** | Pointer to **string** | The context level | [optional] 
**Description** | Pointer to **string** | description | [optional] [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Duedate** | Pointer to **int32** | duedate | [optional] [default to 0]
**Instanceid** | Pointer to **int32** | The Instance id | [optional] 
**Shortname** | **string** | shortname | 
**Timecreated** | Pointer to **int32** | timecreated | [optional] [default to 0]
**Timemodified** | Pointer to **int32** | timemodified | [optional] [default to 0]
**Usermodified** | Pointer to **int32** | usermodified | [optional] [default to 0]
**Visible** | Pointer to **bool** | visible | [optional] [default to 1]

## Methods

### NewCoreCompetencyCreateTemplateRequestTemplate

`func NewCoreCompetencyCreateTemplateRequestTemplate(shortname string, ) *CoreCompetencyCreateTemplateRequestTemplate`

NewCoreCompetencyCreateTemplateRequestTemplate instantiates a new CoreCompetencyCreateTemplateRequestTemplate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyCreateTemplateRequestTemplateWithDefaults

`func NewCoreCompetencyCreateTemplateRequestTemplateWithDefaults() *CoreCompetencyCreateTemplateRequestTemplate`

NewCoreCompetencyCreateTemplateRequestTemplateWithDefaults instantiates a new CoreCompetencyCreateTemplateRequestTemplate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextid

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreCompetencyCreateTemplateRequestTemplate) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreCompetencyCreateTemplateRequestTemplate) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetContextlevel

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreCompetencyCreateTemplateRequestTemplate) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.

### HasContextlevel

`func (o *CoreCompetencyCreateTemplateRequestTemplate) HasContextlevel() bool`

HasContextlevel returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyCreateTemplateRequestTemplate) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCompetencyCreateTemplateRequestTemplate) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyCreateTemplateRequestTemplate) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyCreateTemplateRequestTemplate) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetDuedate

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetDuedate() int32`

GetDuedate returns the Duedate field if non-nil, zero value otherwise.

### GetDuedateOk

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetDuedateOk() (*int32, bool)`

GetDuedateOk returns a tuple with the Duedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedate

`func (o *CoreCompetencyCreateTemplateRequestTemplate) SetDuedate(v int32)`

SetDuedate sets Duedate field to given value.

### HasDuedate

`func (o *CoreCompetencyCreateTemplateRequestTemplate) HasDuedate() bool`

HasDuedate returns a boolean if a field has been set.

### GetInstanceid

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreCompetencyCreateTemplateRequestTemplate) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreCompetencyCreateTemplateRequestTemplate) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetShortname

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCompetencyCreateTemplateRequestTemplate) SetShortname(v string)`

SetShortname sets Shortname field to given value.


### GetTimecreated

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyCreateTemplateRequestTemplate) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreCompetencyCreateTemplateRequestTemplate) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyCreateTemplateRequestTemplate) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCompetencyCreateTemplateRequestTemplate) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyCreateTemplateRequestTemplate) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreCompetencyCreateTemplateRequestTemplate) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCompetencyCreateTemplateRequestTemplate) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCompetencyCreateTemplateRequestTemplate) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCompetencyCreateTemplateRequestTemplate) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


