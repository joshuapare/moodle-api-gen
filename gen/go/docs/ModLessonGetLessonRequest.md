# ModLessonGetLessonRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Lessonid** | **int32** | lesson instance id | 
**Password** | Pointer to **string** | lesson password | [optional] [default to ""]

## Methods

### NewModLessonGetLessonRequest

`func NewModLessonGetLessonRequest(lessonid int32, ) *ModLessonGetLessonRequest`

NewModLessonGetLessonRequest instantiates a new ModLessonGetLessonRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetLessonRequestWithDefaults

`func NewModLessonGetLessonRequestWithDefaults() *ModLessonGetLessonRequest`

NewModLessonGetLessonRequestWithDefaults instantiates a new ModLessonGetLessonRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLessonid

`func (o *ModLessonGetLessonRequest) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetLessonRequest) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetLessonRequest) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetPassword

`func (o *ModLessonGetLessonRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ModLessonGetLessonRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ModLessonGetLessonRequest) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ModLessonGetLessonRequest) HasPassword() bool`

HasPassword returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


