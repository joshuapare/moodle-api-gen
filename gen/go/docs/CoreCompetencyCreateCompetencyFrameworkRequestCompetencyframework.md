# CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | Pointer to **int32** | The context id | [optional] [default to null]
**Contextlevel** | Pointer to **string** | The context level | [optional] [default to "null"]
**Description** | Pointer to **string** | description | [optional] [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Idnumber** | **string** | idnumber | 
**Instanceid** | Pointer to **int32** | The Instance id | [optional] [default to null]
**Scaleconfiguration** | **string** | scaleconfiguration | [default to "null"]
**Scaleid** | **int32** | scaleid | [default to null]
**Shortname** | **string** | shortname | 
**Taxonomies** | Pointer to **string** | taxonomies | [optional] [default to ""]
**Timecreated** | Pointer to **int32** | timecreated | [optional] [default to 0]
**Timemodified** | Pointer to **int32** | timemodified | [optional] [default to 0]
**Usermodified** | Pointer to **int32** | usermodified | [optional] [default to 0]
**Visible** | Pointer to **bool** | visible | [optional] [default to 1]

## Methods

### NewCoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework

`func NewCoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework(idnumber string, scaleconfiguration string, scaleid int32, shortname string, ) *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework`

NewCoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework instantiates a new CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyCreateCompetencyFrameworkRequestCompetencyframeworkWithDefaults

`func NewCoreCompetencyCreateCompetencyFrameworkRequestCompetencyframeworkWithDefaults() *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework`

NewCoreCompetencyCreateCompetencyFrameworkRequestCompetencyframeworkWithDefaults instantiates a new CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextid

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetContextlevel

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.

### HasContextlevel

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) HasContextlevel() bool`

HasContextlevel returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.


### GetInstanceid

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetScaleconfiguration

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetScaleconfiguration() string`

GetScaleconfiguration returns the Scaleconfiguration field if non-nil, zero value otherwise.

### GetScaleconfigurationOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetScaleconfigurationOk() (*string, bool)`

GetScaleconfigurationOk returns a tuple with the Scaleconfiguration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleconfiguration

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetScaleconfiguration(v string)`

SetScaleconfiguration sets Scaleconfiguration field to given value.


### GetScaleid

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.


### GetShortname

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetShortname(v string)`

SetShortname sets Shortname field to given value.


### GetTaxonomies

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetTaxonomies() string`

GetTaxonomies returns the Taxonomies field if non-nil, zero value otherwise.

### GetTaxonomiesOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetTaxonomiesOk() (*string, bool)`

GetTaxonomiesOk returns a tuple with the Taxonomies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxonomies

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetTaxonomies(v string)`

SetTaxonomies sets Taxonomies field to given value.

### HasTaxonomies

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) HasTaxonomies() bool`

HasTaxonomies returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


