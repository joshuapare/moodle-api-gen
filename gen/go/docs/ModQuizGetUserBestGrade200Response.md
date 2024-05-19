# ModQuizGetUserBestGrade200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Grade** | Pointer to **float32** | The grade (only if the user has a grade). | [optional] [default to null]
**Gradetopass** | Pointer to **float32** | The grade to pass the quiz (only if set). | [optional] [default to null]
**Hasgrade** | **bool** | Whether the user has a grade on the given quiz. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModQuizGetUserBestGrade200Response

`func NewModQuizGetUserBestGrade200Response(hasgrade bool, ) *ModQuizGetUserBestGrade200Response`

NewModQuizGetUserBestGrade200Response instantiates a new ModQuizGetUserBestGrade200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetUserBestGrade200ResponseWithDefaults

`func NewModQuizGetUserBestGrade200ResponseWithDefaults() *ModQuizGetUserBestGrade200Response`

NewModQuizGetUserBestGrade200ResponseWithDefaults instantiates a new ModQuizGetUserBestGrade200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGrade

`func (o *ModQuizGetUserBestGrade200Response) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModQuizGetUserBestGrade200Response) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModQuizGetUserBestGrade200Response) SetGrade(v float32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModQuizGetUserBestGrade200Response) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGradetopass

`func (o *ModQuizGetUserBestGrade200Response) GetGradetopass() float32`

GetGradetopass returns the Gradetopass field if non-nil, zero value otherwise.

### GetGradetopassOk

`func (o *ModQuizGetUserBestGrade200Response) GetGradetopassOk() (*float32, bool)`

GetGradetopassOk returns a tuple with the Gradetopass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradetopass

`func (o *ModQuizGetUserBestGrade200Response) SetGradetopass(v float32)`

SetGradetopass sets Gradetopass field to given value.

### HasGradetopass

`func (o *ModQuizGetUserBestGrade200Response) HasGradetopass() bool`

HasGradetopass returns a boolean if a field has been set.

### GetHasgrade

`func (o *ModQuizGetUserBestGrade200Response) GetHasgrade() bool`

GetHasgrade returns the Hasgrade field if non-nil, zero value otherwise.

### GetHasgradeOk

`func (o *ModQuizGetUserBestGrade200Response) GetHasgradeOk() (*bool, bool)`

GetHasgradeOk returns a tuple with the Hasgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasgrade

`func (o *ModQuizGetUserBestGrade200Response) SetHasgrade(v bool)`

SetHasgrade sets Hasgrade field to given value.


### GetWarnings

`func (o *ModQuizGetUserBestGrade200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModQuizGetUserBestGrade200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModQuizGetUserBestGrade200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModQuizGetUserBestGrade200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


