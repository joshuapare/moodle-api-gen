# ModLessonProcessPageRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]ModLessonProcessPageRequestDataInner**](ModLessonProcessPageRequestDataInner.md) |  | 
**Lessonid** | **int32** | lesson instance id | 
**Pageid** | **int32** | the page id | 
**Password** | Pointer to **string** | optional password (the lesson may be protected) | [optional] [default to ""]
**Review** | Pointer to **bool** | if we want to review just after finishing (1 hour margin) | [optional] [default to false]

## Methods

### NewModLessonProcessPageRequest

`func NewModLessonProcessPageRequest(data []ModLessonProcessPageRequestDataInner, lessonid int32, pageid int32, ) *ModLessonProcessPageRequest`

NewModLessonProcessPageRequest instantiates a new ModLessonProcessPageRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonProcessPageRequestWithDefaults

`func NewModLessonProcessPageRequestWithDefaults() *ModLessonProcessPageRequest`

NewModLessonProcessPageRequestWithDefaults instantiates a new ModLessonProcessPageRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ModLessonProcessPageRequest) GetData() []ModLessonProcessPageRequestDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ModLessonProcessPageRequest) GetDataOk() (*[]ModLessonProcessPageRequestDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ModLessonProcessPageRequest) SetData(v []ModLessonProcessPageRequestDataInner)`

SetData sets Data field to given value.


### GetLessonid

`func (o *ModLessonProcessPageRequest) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonProcessPageRequest) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonProcessPageRequest) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetPageid

`func (o *ModLessonProcessPageRequest) GetPageid() int32`

GetPageid returns the Pageid field if non-nil, zero value otherwise.

### GetPageidOk

`func (o *ModLessonProcessPageRequest) GetPageidOk() (*int32, bool)`

GetPageidOk returns a tuple with the Pageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageid

`func (o *ModLessonProcessPageRequest) SetPageid(v int32)`

SetPageid sets Pageid field to given value.


### GetPassword

`func (o *ModLessonProcessPageRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ModLessonProcessPageRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ModLessonProcessPageRequest) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ModLessonProcessPageRequest) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetReview

`func (o *ModLessonProcessPageRequest) GetReview() bool`

GetReview returns the Review field if non-nil, zero value otherwise.

### GetReviewOk

`func (o *ModLessonProcessPageRequest) GetReviewOk() (*bool, bool)`

GetReviewOk returns a tuple with the Review field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReview

`func (o *ModLessonProcessPageRequest) SetReview(v bool)`

SetReview sets Review field to given value.

### HasReview

`func (o *ModLessonProcessPageRequest) HasReview() bool`

HasReview returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


