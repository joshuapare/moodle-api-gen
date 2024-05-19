# ModForumGetDiscussionPostsByUserid200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Discussions** | [**[]ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner**](ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModForumGetDiscussionPostsByUserid200Response

`func NewModForumGetDiscussionPostsByUserid200Response(discussions []ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner, ) *ModForumGetDiscussionPostsByUserid200Response`

NewModForumGetDiscussionPostsByUserid200Response instantiates a new ModForumGetDiscussionPostsByUserid200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetDiscussionPostsByUserid200ResponseWithDefaults

`func NewModForumGetDiscussionPostsByUserid200ResponseWithDefaults() *ModForumGetDiscussionPostsByUserid200Response`

NewModForumGetDiscussionPostsByUserid200ResponseWithDefaults instantiates a new ModForumGetDiscussionPostsByUserid200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscussions

`func (o *ModForumGetDiscussionPostsByUserid200Response) GetDiscussions() []ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner`

GetDiscussions returns the Discussions field if non-nil, zero value otherwise.

### GetDiscussionsOk

`func (o *ModForumGetDiscussionPostsByUserid200Response) GetDiscussionsOk() (*[]ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner, bool)`

GetDiscussionsOk returns a tuple with the Discussions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussions

`func (o *ModForumGetDiscussionPostsByUserid200Response) SetDiscussions(v []ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner)`

SetDiscussions sets Discussions field to given value.


### GetWarnings

`func (o *ModForumGetDiscussionPostsByUserid200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModForumGetDiscussionPostsByUserid200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModForumGetDiscussionPostsByUserid200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModForumGetDiscussionPostsByUserid200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


