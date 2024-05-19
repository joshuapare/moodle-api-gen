# CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Copiedfromid** | Pointer to **int32** | copied from id | [optional] [default to null]
**Description** | Pointer to **string** | description | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Guide** | Pointer to [**CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide**](CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide.md) |  | [optional] 
**Id** | Pointer to **int32** | definition id | [optional] [default to null]
**Method** | Pointer to **string** | method | [optional] [default to "null"]
**Name** | Pointer to **string** | name | [optional] 
**Rubric** | Pointer to [**CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric**](CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric.md) |  | [optional] 
**Status** | Pointer to **int32** | status | [optional] [default to null]
**Timecopied** | Pointer to **int32** | time copied | [optional] [default to null]
**Timecreated** | Pointer to **int32** | creation time | [optional] [default to null]
**Timemodified** | Pointer to **int32** | last modified time | [optional] [default to null]
**Usercreated** | Pointer to **int32** | user who created definition | [optional] [default to null]
**Usermodified** | Pointer to **int32** | user who modified definition | [optional] [default to null]

## Methods

### NewCoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner

`func NewCoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner() *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner`

NewCoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner instantiates a new CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerWithDefaults

`func NewCoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerWithDefaults() *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner`

NewCoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerWithDefaults instantiates a new CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCopiedfromid

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetCopiedfromid() int32`

GetCopiedfromid returns the Copiedfromid field if non-nil, zero value otherwise.

### GetCopiedfromidOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetCopiedfromidOk() (*int32, bool)`

GetCopiedfromidOk returns a tuple with the Copiedfromid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCopiedfromid

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetCopiedfromid(v int32)`

SetCopiedfromid sets Copiedfromid field to given value.

### HasCopiedfromid

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasCopiedfromid() bool`

HasCopiedfromid returns a boolean if a field has been set.

### GetDescription

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetGuide

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetGuide() CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide`

GetGuide returns the Guide field if non-nil, zero value otherwise.

### GetGuideOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetGuideOk() (*CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide, bool)`

GetGuideOk returns a tuple with the Guide field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuide

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetGuide(v CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide)`

SetGuide sets Guide field to given value.

### HasGuide

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasGuide() bool`

HasGuide returns a boolean if a field has been set.

### GetId

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetMethod

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetMethod() string`

GetMethod returns the Method field if non-nil, zero value otherwise.

### GetMethodOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetMethodOk() (*string, bool)`

GetMethodOk returns a tuple with the Method field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMethod

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetMethod(v string)`

SetMethod sets Method field to given value.

### HasMethod

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasMethod() bool`

HasMethod returns a boolean if a field has been set.

### GetName

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRubric

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetRubric() CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric`

GetRubric returns the Rubric field if non-nil, zero value otherwise.

### GetRubricOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetRubricOk() (*CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric, bool)`

GetRubricOk returns a tuple with the Rubric field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRubric

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetRubric(v CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric)`

SetRubric sets Rubric field to given value.

### HasRubric

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasRubric() bool`

HasRubric returns a boolean if a field has been set.

### GetStatus

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetStatus(v int32)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTimecopied

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetTimecopied() int32`

GetTimecopied returns the Timecopied field if non-nil, zero value otherwise.

### GetTimecopiedOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetTimecopiedOk() (*int32, bool)`

GetTimecopiedOk returns a tuple with the Timecopied field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecopied

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetTimecopied(v int32)`

SetTimecopied sets Timecopied field to given value.

### HasTimecopied

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasTimecopied() bool`

HasTimecopied returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsercreated

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetUsercreated() int32`

GetUsercreated returns the Usercreated field if non-nil, zero value otherwise.

### GetUsercreatedOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetUsercreatedOk() (*int32, bool)`

GetUsercreatedOk returns a tuple with the Usercreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercreated

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetUsercreated(v int32)`

SetUsercreated sets Usercreated field to given value.

### HasUsercreated

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasUsercreated() bool`

HasUsercreated returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


