# CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Copiedfromid** | Pointer to **int32** | copied from id | [optional] 
**Description** | Pointer to **string** | description | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Guide** | Pointer to [**CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide**](CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide.md) |  | [optional] 
**Id** | Pointer to **int32** | definition id | [optional] 
**Method** | Pointer to **string** | method | [optional] 
**Name** | Pointer to **string** | name | [optional] 
**Rubric** | Pointer to [**CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric**](CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric.md) |  | [optional] 
**Status** | Pointer to **int32** | status | [optional] 
**Timecopied** | Pointer to **int32** | time copied | [optional] 
**Timecreated** | Pointer to **int32** | creation time | [optional] 
**Timemodified** | Pointer to **int32** | last modified time | [optional] 
**Usercreated** | Pointer to **int32** | user who created definition | [optional] 
**Usermodified** | Pointer to **int32** | user who modified definition | [optional] 

## Methods

### NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner

`func NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner() *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner`

NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner instantiates a new CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerWithDefaults

`func NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerWithDefaults() *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner`

NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerWithDefaults instantiates a new CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCopiedfromid

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetCopiedfromid() int32`

GetCopiedfromid returns the Copiedfromid field if non-nil, zero value otherwise.

### GetCopiedfromidOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetCopiedfromidOk() (*int32, bool)`

GetCopiedfromidOk returns a tuple with the Copiedfromid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCopiedfromid

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetCopiedfromid(v int32)`

SetCopiedfromid sets Copiedfromid field to given value.

### HasCopiedfromid

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasCopiedfromid() bool`

HasCopiedfromid returns a boolean if a field has been set.

### GetDescription

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetGuide

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetGuide() CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide`

GetGuide returns the Guide field if non-nil, zero value otherwise.

### GetGuideOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetGuideOk() (*CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide, bool)`

GetGuideOk returns a tuple with the Guide field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuide

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetGuide(v CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide)`

SetGuide sets Guide field to given value.

### HasGuide

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasGuide() bool`

HasGuide returns a boolean if a field has been set.

### GetId

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetMethod

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetMethod() string`

GetMethod returns the Method field if non-nil, zero value otherwise.

### GetMethodOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetMethodOk() (*string, bool)`

GetMethodOk returns a tuple with the Method field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMethod

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetMethod(v string)`

SetMethod sets Method field to given value.

### HasMethod

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasMethod() bool`

HasMethod returns a boolean if a field has been set.

### GetName

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRubric

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetRubric() CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric`

GetRubric returns the Rubric field if non-nil, zero value otherwise.

### GetRubricOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetRubricOk() (*CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric, bool)`

GetRubricOk returns a tuple with the Rubric field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRubric

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetRubric(v CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric)`

SetRubric sets Rubric field to given value.

### HasRubric

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasRubric() bool`

HasRubric returns a boolean if a field has been set.

### GetStatus

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetStatus(v int32)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTimecopied

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetTimecopied() int32`

GetTimecopied returns the Timecopied field if non-nil, zero value otherwise.

### GetTimecopiedOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetTimecopiedOk() (*int32, bool)`

GetTimecopiedOk returns a tuple with the Timecopied field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecopied

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetTimecopied(v int32)`

SetTimecopied sets Timecopied field to given value.

### HasTimecopied

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasTimecopied() bool`

HasTimecopied returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsercreated

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetUsercreated() int32`

GetUsercreated returns the Usercreated field if non-nil, zero value otherwise.

### GetUsercreatedOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetUsercreatedOk() (*int32, bool)`

GetUsercreatedOk returns a tuple with the Usercreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercreated

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetUsercreated(v int32)`

SetUsercreated sets Usercreated field to given value.

### HasUsercreated

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasUsercreated() bool`

HasUsercreated returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


