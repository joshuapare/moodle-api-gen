# ModForumDeletePostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Postid** | **int32** | Post to be deleted. It can be a discussion topic post. | [default to null]

## Methods

### NewModForumDeletePostRequest

`func NewModForumDeletePostRequest(postid int32, ) *ModForumDeletePostRequest`

NewModForumDeletePostRequest instantiates a new ModForumDeletePostRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumDeletePostRequestWithDefaults

`func NewModForumDeletePostRequestWithDefaults() *ModForumDeletePostRequest`

NewModForumDeletePostRequestWithDefaults instantiates a new ModForumDeletePostRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPostid

`func (o *ModForumDeletePostRequest) GetPostid() int32`

GetPostid returns the Postid field if non-nil, zero value otherwise.

### GetPostidOk

`func (o *ModForumDeletePostRequest) GetPostidOk() (*int32, bool)`

GetPostidOk returns a tuple with the Postid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostid

`func (o *ModForumDeletePostRequest) SetPostid(v int32)`

SetPostid sets Postid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


