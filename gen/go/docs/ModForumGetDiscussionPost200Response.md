# ModForumGetDiscussionPost200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Post** | [**ModForumGetDiscussionPost200ResponsePost**](ModForumGetDiscussionPost200ResponsePost.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModForumGetDiscussionPost200Response

`func NewModForumGetDiscussionPost200Response(post ModForumGetDiscussionPost200ResponsePost, ) *ModForumGetDiscussionPost200Response`

NewModForumGetDiscussionPost200Response instantiates a new ModForumGetDiscussionPost200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetDiscussionPost200ResponseWithDefaults

`func NewModForumGetDiscussionPost200ResponseWithDefaults() *ModForumGetDiscussionPost200Response`

NewModForumGetDiscussionPost200ResponseWithDefaults instantiates a new ModForumGetDiscussionPost200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPost

`func (o *ModForumGetDiscussionPost200Response) GetPost() ModForumGetDiscussionPost200ResponsePost`

GetPost returns the Post field if non-nil, zero value otherwise.

### GetPostOk

`func (o *ModForumGetDiscussionPost200Response) GetPostOk() (*ModForumGetDiscussionPost200ResponsePost, bool)`

GetPostOk returns a tuple with the Post field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPost

`func (o *ModForumGetDiscussionPost200Response) SetPost(v ModForumGetDiscussionPost200ResponsePost)`

SetPost sets Post field to given value.


### GetWarnings

`func (o *ModForumGetDiscussionPost200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModForumGetDiscussionPost200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModForumGetDiscussionPost200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModForumGetDiscussionPost200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


