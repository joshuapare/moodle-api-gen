# ModLessonGetPageDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Lessonid** | **int32** | lesson instance id | 
**Pageid** | **int32** | the page id | [default to null]
**Password** | Pointer to **string** | optional password (the lesson may be protected) | [optional] [default to ""]
**Returncontents** | Pointer to **bool** | if we must return the complete page contents once rendered | [optional] [default to false]
**Review** | Pointer to **bool** | if we want to review just after finishing (1 hour margin) | [optional] [default to false]

## Methods

### NewModLessonGetPageDataRequest

`func NewModLessonGetPageDataRequest(lessonid int32, pageid int32, ) *ModLessonGetPageDataRequest`

NewModLessonGetPageDataRequest instantiates a new ModLessonGetPageDataRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetPageDataRequestWithDefaults

`func NewModLessonGetPageDataRequestWithDefaults() *ModLessonGetPageDataRequest`

NewModLessonGetPageDataRequestWithDefaults instantiates a new ModLessonGetPageDataRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLessonid

`func (o *ModLessonGetPageDataRequest) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetPageDataRequest) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetPageDataRequest) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetPageid

`func (o *ModLessonGetPageDataRequest) GetPageid() int32`

GetPageid returns the Pageid field if non-nil, zero value otherwise.

### GetPageidOk

`func (o *ModLessonGetPageDataRequest) GetPageidOk() (*int32, bool)`

GetPageidOk returns a tuple with the Pageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageid

`func (o *ModLessonGetPageDataRequest) SetPageid(v int32)`

SetPageid sets Pageid field to given value.


### GetPassword

`func (o *ModLessonGetPageDataRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ModLessonGetPageDataRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ModLessonGetPageDataRequest) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ModLessonGetPageDataRequest) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetReturncontents

`func (o *ModLessonGetPageDataRequest) GetReturncontents() bool`

GetReturncontents returns the Returncontents field if non-nil, zero value otherwise.

### GetReturncontentsOk

`func (o *ModLessonGetPageDataRequest) GetReturncontentsOk() (*bool, bool)`

GetReturncontentsOk returns a tuple with the Returncontents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturncontents

`func (o *ModLessonGetPageDataRequest) SetReturncontents(v bool)`

SetReturncontents sets Returncontents field to given value.

### HasReturncontents

`func (o *ModLessonGetPageDataRequest) HasReturncontents() bool`

HasReturncontents returns a boolean if a field has been set.

### GetReview

`func (o *ModLessonGetPageDataRequest) GetReview() bool`

GetReview returns the Review field if non-nil, zero value otherwise.

### GetReviewOk

`func (o *ModLessonGetPageDataRequest) GetReviewOk() (*bool, bool)`

GetReviewOk returns a tuple with the Review field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReview

`func (o *ModLessonGetPageDataRequest) SetReview(v bool)`

SetReview sets Review field to given value.

### HasReview

`func (o *ModLessonGetPageDataRequest) HasReview() bool`

HasReview returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


