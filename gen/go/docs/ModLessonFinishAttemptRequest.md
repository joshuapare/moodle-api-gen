# ModLessonFinishAttemptRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Lessonid** | **int32** | Lesson instance id. | [default to null]
**Outoftime** | Pointer to **bool** | If the user run out of time. | [optional] [default to false]
**Password** | Pointer to **string** | Optional password (the lesson may be protected). | [optional] [default to ""]
**Review** | Pointer to **bool** | If we want to review just after finishing (1 hour margin). | [optional] [default to false]

## Methods

### NewModLessonFinishAttemptRequest

`func NewModLessonFinishAttemptRequest(lessonid int32, ) *ModLessonFinishAttemptRequest`

NewModLessonFinishAttemptRequest instantiates a new ModLessonFinishAttemptRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonFinishAttemptRequestWithDefaults

`func NewModLessonFinishAttemptRequestWithDefaults() *ModLessonFinishAttemptRequest`

NewModLessonFinishAttemptRequestWithDefaults instantiates a new ModLessonFinishAttemptRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLessonid

`func (o *ModLessonFinishAttemptRequest) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonFinishAttemptRequest) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonFinishAttemptRequest) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetOutoftime

`func (o *ModLessonFinishAttemptRequest) GetOutoftime() bool`

GetOutoftime returns the Outoftime field if non-nil, zero value otherwise.

### GetOutoftimeOk

`func (o *ModLessonFinishAttemptRequest) GetOutoftimeOk() (*bool, bool)`

GetOutoftimeOk returns a tuple with the Outoftime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutoftime

`func (o *ModLessonFinishAttemptRequest) SetOutoftime(v bool)`

SetOutoftime sets Outoftime field to given value.

### HasOutoftime

`func (o *ModLessonFinishAttemptRequest) HasOutoftime() bool`

HasOutoftime returns a boolean if a field has been set.

### GetPassword

`func (o *ModLessonFinishAttemptRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ModLessonFinishAttemptRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ModLessonFinishAttemptRequest) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ModLessonFinishAttemptRequest) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetReview

`func (o *ModLessonFinishAttemptRequest) GetReview() bool`

GetReview returns the Review field if non-nil, zero value otherwise.

### GetReviewOk

`func (o *ModLessonFinishAttemptRequest) GetReviewOk() (*bool, bool)`

GetReviewOk returns a tuple with the Review field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReview

`func (o *ModLessonFinishAttemptRequest) SetReview(v bool)`

SetReview sets Review field to given value.

### HasReview

`func (o *ModLessonFinishAttemptRequest) HasReview() bool`

HasReview returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


