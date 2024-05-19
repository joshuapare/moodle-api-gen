# CoreGradesUpdateGradesRequestGradesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Grade** | Pointer to **float32** | Student grade | [optional] [default to null]
**StrFeedback** | Pointer to **string** | A string representation of the feedback from the grader | [optional] [default to "null"]
**Studentid** | Pointer to **int32** | Student ID | [optional] [default to null]

## Methods

### NewCoreGradesUpdateGradesRequestGradesInner

`func NewCoreGradesUpdateGradesRequestGradesInner() *CoreGradesUpdateGradesRequestGradesInner`

NewCoreGradesUpdateGradesRequestGradesInner instantiates a new CoreGradesUpdateGradesRequestGradesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesUpdateGradesRequestGradesInnerWithDefaults

`func NewCoreGradesUpdateGradesRequestGradesInnerWithDefaults() *CoreGradesUpdateGradesRequestGradesInner`

NewCoreGradesUpdateGradesRequestGradesInnerWithDefaults instantiates a new CoreGradesUpdateGradesRequestGradesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGrade

`func (o *CoreGradesUpdateGradesRequestGradesInner) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *CoreGradesUpdateGradesRequestGradesInner) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *CoreGradesUpdateGradesRequestGradesInner) SetGrade(v float32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *CoreGradesUpdateGradesRequestGradesInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetStrFeedback

`func (o *CoreGradesUpdateGradesRequestGradesInner) GetStrFeedback() string`

GetStrFeedback returns the StrFeedback field if non-nil, zero value otherwise.

### GetStrFeedbackOk

`func (o *CoreGradesUpdateGradesRequestGradesInner) GetStrFeedbackOk() (*string, bool)`

GetStrFeedbackOk returns a tuple with the StrFeedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStrFeedback

`func (o *CoreGradesUpdateGradesRequestGradesInner) SetStrFeedback(v string)`

SetStrFeedback sets StrFeedback field to given value.

### HasStrFeedback

`func (o *CoreGradesUpdateGradesRequestGradesInner) HasStrFeedback() bool`

HasStrFeedback returns a boolean if a field has been set.

### GetStudentid

`func (o *CoreGradesUpdateGradesRequestGradesInner) GetStudentid() int32`

GetStudentid returns the Studentid field if non-nil, zero value otherwise.

### GetStudentidOk

`func (o *CoreGradesUpdateGradesRequestGradesInner) GetStudentidOk() (*int32, bool)`

GetStudentidOk returns a tuple with the Studentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStudentid

`func (o *CoreGradesUpdateGradesRequestGradesInner) SetStudentid(v int32)`

SetStudentid sets Studentid field to given value.

### HasStudentid

`func (o *CoreGradesUpdateGradesRequestGradesInner) HasStudentid() bool`

HasStudentid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


