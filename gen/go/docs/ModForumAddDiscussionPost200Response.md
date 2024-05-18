# ModForumAddDiscussionPost200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | Pointer to [**[]ModForumAddDiscussionPost200ResponseMessagesInner**](ModForumAddDiscussionPost200ResponseMessagesInner.md) |  | [optional] 
**Post** | [**ModForumAddDiscussionPost200ResponsePost**](ModForumAddDiscussionPost200ResponsePost.md) |  | 
**Postid** | **int32** | new post id | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModForumAddDiscussionPost200Response

`func NewModForumAddDiscussionPost200Response(post ModForumAddDiscussionPost200ResponsePost, postid int32, ) *ModForumAddDiscussionPost200Response`

NewModForumAddDiscussionPost200Response instantiates a new ModForumAddDiscussionPost200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumAddDiscussionPost200ResponseWithDefaults

`func NewModForumAddDiscussionPost200ResponseWithDefaults() *ModForumAddDiscussionPost200Response`

NewModForumAddDiscussionPost200ResponseWithDefaults instantiates a new ModForumAddDiscussionPost200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessages

`func (o *ModForumAddDiscussionPost200Response) GetMessages() []ModForumAddDiscussionPost200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ModForumAddDiscussionPost200Response) GetMessagesOk() (*[]ModForumAddDiscussionPost200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ModForumAddDiscussionPost200Response) SetMessages(v []ModForumAddDiscussionPost200ResponseMessagesInner)`

SetMessages sets Messages field to given value.

### HasMessages

`func (o *ModForumAddDiscussionPost200Response) HasMessages() bool`

HasMessages returns a boolean if a field has been set.

### GetPost

`func (o *ModForumAddDiscussionPost200Response) GetPost() ModForumAddDiscussionPost200ResponsePost`

GetPost returns the Post field if non-nil, zero value otherwise.

### GetPostOk

`func (o *ModForumAddDiscussionPost200Response) GetPostOk() (*ModForumAddDiscussionPost200ResponsePost, bool)`

GetPostOk returns a tuple with the Post field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPost

`func (o *ModForumAddDiscussionPost200Response) SetPost(v ModForumAddDiscussionPost200ResponsePost)`

SetPost sets Post field to given value.


### GetPostid

`func (o *ModForumAddDiscussionPost200Response) GetPostid() int32`

GetPostid returns the Postid field if non-nil, zero value otherwise.

### GetPostidOk

`func (o *ModForumAddDiscussionPost200Response) GetPostidOk() (*int32, bool)`

GetPostidOk returns a tuple with the Postid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostid

`func (o *ModForumAddDiscussionPost200Response) SetPostid(v int32)`

SetPostid sets Postid field to given value.


### GetWarnings

`func (o *ModForumAddDiscussionPost200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModForumAddDiscussionPost200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModForumAddDiscussionPost200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModForumAddDiscussionPost200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


