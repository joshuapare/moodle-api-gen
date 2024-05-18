# ModLessonLaunchAttemptRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Lessonid** | **int32** | lesson instance id | 
**Pageid** | Pointer to **int32** | page id to continue from (only when continuing an attempt) | [optional] [default to 0]
**Password** | Pointer to **string** | optional password (the lesson may be protected) | [optional] [default to ""]
**Review** | Pointer to **bool** | if we want to review just after finishing | [optional] [default to false]

## Methods

### NewModLessonLaunchAttemptRequest

`func NewModLessonLaunchAttemptRequest(lessonid int32, ) *ModLessonLaunchAttemptRequest`

NewModLessonLaunchAttemptRequest instantiates a new ModLessonLaunchAttemptRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonLaunchAttemptRequestWithDefaults

`func NewModLessonLaunchAttemptRequestWithDefaults() *ModLessonLaunchAttemptRequest`

NewModLessonLaunchAttemptRequestWithDefaults instantiates a new ModLessonLaunchAttemptRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLessonid

`func (o *ModLessonLaunchAttemptRequest) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonLaunchAttemptRequest) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonLaunchAttemptRequest) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetPageid

`func (o *ModLessonLaunchAttemptRequest) GetPageid() int32`

GetPageid returns the Pageid field if non-nil, zero value otherwise.

### GetPageidOk

`func (o *ModLessonLaunchAttemptRequest) GetPageidOk() (*int32, bool)`

GetPageidOk returns a tuple with the Pageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageid

`func (o *ModLessonLaunchAttemptRequest) SetPageid(v int32)`

SetPageid sets Pageid field to given value.

### HasPageid

`func (o *ModLessonLaunchAttemptRequest) HasPageid() bool`

HasPageid returns a boolean if a field has been set.

### GetPassword

`func (o *ModLessonLaunchAttemptRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ModLessonLaunchAttemptRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ModLessonLaunchAttemptRequest) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ModLessonLaunchAttemptRequest) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetReview

`func (o *ModLessonLaunchAttemptRequest) GetReview() bool`

GetReview returns the Review field if non-nil, zero value otherwise.

### GetReviewOk

`func (o *ModLessonLaunchAttemptRequest) GetReviewOk() (*bool, bool)`

GetReviewOk returns a tuple with the Review field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReview

`func (o *ModLessonLaunchAttemptRequest) SetReview(v bool)`

SetReview sets Review field to given value.

### HasReview

`func (o *ModLessonLaunchAttemptRequest) HasReview() bool`

HasReview returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


