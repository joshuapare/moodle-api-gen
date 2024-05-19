# CoreCommentAddCommentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Comments** | [**[]CoreCommentAddCommentsRequestCommentsInner**](CoreCommentAddCommentsRequestCommentsInner.md) |  | 

## Methods

### NewCoreCommentAddCommentsRequest

`func NewCoreCommentAddCommentsRequest(comments []CoreCommentAddCommentsRequestCommentsInner, ) *CoreCommentAddCommentsRequest`

NewCoreCommentAddCommentsRequest instantiates a new CoreCommentAddCommentsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCommentAddCommentsRequestWithDefaults

`func NewCoreCommentAddCommentsRequestWithDefaults() *CoreCommentAddCommentsRequest`

NewCoreCommentAddCommentsRequestWithDefaults instantiates a new CoreCommentAddCommentsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComments

`func (o *CoreCommentAddCommentsRequest) GetComments() []CoreCommentAddCommentsRequestCommentsInner`

GetComments returns the Comments field if non-nil, zero value otherwise.

### GetCommentsOk

`func (o *CoreCommentAddCommentsRequest) GetCommentsOk() (*[]CoreCommentAddCommentsRequestCommentsInner, bool)`

GetCommentsOk returns a tuple with the Comments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComments

`func (o *CoreCommentAddCommentsRequest) SetComments(v []CoreCommentAddCommentsRequestCommentsInner)`

SetComments sets Comments field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


