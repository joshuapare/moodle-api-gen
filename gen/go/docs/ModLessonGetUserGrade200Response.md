# ModLessonGetUserGrade200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Formattedgrade** | **string** | The lesson final grade formatted | [default to "null"]
**Grade** | **float32** | The lesson final raw grade | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonGetUserGrade200Response

`func NewModLessonGetUserGrade200Response(formattedgrade string, grade float32, ) *ModLessonGetUserGrade200Response`

NewModLessonGetUserGrade200Response instantiates a new ModLessonGetUserGrade200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetUserGrade200ResponseWithDefaults

`func NewModLessonGetUserGrade200ResponseWithDefaults() *ModLessonGetUserGrade200Response`

NewModLessonGetUserGrade200ResponseWithDefaults instantiates a new ModLessonGetUserGrade200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFormattedgrade

`func (o *ModLessonGetUserGrade200Response) GetFormattedgrade() string`

GetFormattedgrade returns the Formattedgrade field if non-nil, zero value otherwise.

### GetFormattedgradeOk

`func (o *ModLessonGetUserGrade200Response) GetFormattedgradeOk() (*string, bool)`

GetFormattedgradeOk returns a tuple with the Formattedgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedgrade

`func (o *ModLessonGetUserGrade200Response) SetFormattedgrade(v string)`

SetFormattedgrade sets Formattedgrade field to given value.


### GetGrade

`func (o *ModLessonGetUserGrade200Response) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModLessonGetUserGrade200Response) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModLessonGetUserGrade200Response) SetGrade(v float32)`

SetGrade sets Grade field to given value.


### GetWarnings

`func (o *ModLessonGetUserGrade200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonGetUserGrade200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonGetUserGrade200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonGetUserGrade200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


