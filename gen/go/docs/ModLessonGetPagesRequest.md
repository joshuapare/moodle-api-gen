# ModLessonGetPagesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Lessonid** | **int32** | lesson instance id | 
**Password** | Pointer to **string** | optional password (the lesson may be protected) | [optional] [default to ""]

## Methods

### NewModLessonGetPagesRequest

`func NewModLessonGetPagesRequest(lessonid int32, ) *ModLessonGetPagesRequest`

NewModLessonGetPagesRequest instantiates a new ModLessonGetPagesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetPagesRequestWithDefaults

`func NewModLessonGetPagesRequestWithDefaults() *ModLessonGetPagesRequest`

NewModLessonGetPagesRequestWithDefaults instantiates a new ModLessonGetPagesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLessonid

`func (o *ModLessonGetPagesRequest) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetPagesRequest) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetPagesRequest) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetPassword

`func (o *ModLessonGetPagesRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ModLessonGetPagesRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ModLessonGetPagesRequest) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ModLessonGetPagesRequest) HasPassword() bool`

HasPassword returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


