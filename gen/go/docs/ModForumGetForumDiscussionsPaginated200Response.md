# ModForumGetForumDiscussionsPaginated200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Discussions** | [**[]ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner**](ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModForumGetForumDiscussionsPaginated200Response

`func NewModForumGetForumDiscussionsPaginated200Response(discussions []ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner, ) *ModForumGetForumDiscussionsPaginated200Response`

NewModForumGetForumDiscussionsPaginated200Response instantiates a new ModForumGetForumDiscussionsPaginated200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetForumDiscussionsPaginated200ResponseWithDefaults

`func NewModForumGetForumDiscussionsPaginated200ResponseWithDefaults() *ModForumGetForumDiscussionsPaginated200Response`

NewModForumGetForumDiscussionsPaginated200ResponseWithDefaults instantiates a new ModForumGetForumDiscussionsPaginated200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscussions

`func (o *ModForumGetForumDiscussionsPaginated200Response) GetDiscussions() []ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner`

GetDiscussions returns the Discussions field if non-nil, zero value otherwise.

### GetDiscussionsOk

`func (o *ModForumGetForumDiscussionsPaginated200Response) GetDiscussionsOk() (*[]ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner, bool)`

GetDiscussionsOk returns a tuple with the Discussions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussions

`func (o *ModForumGetForumDiscussionsPaginated200Response) SetDiscussions(v []ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner)`

SetDiscussions sets Discussions field to given value.


### GetWarnings

`func (o *ModForumGetForumDiscussionsPaginated200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModForumGetForumDiscussionsPaginated200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModForumGetForumDiscussionsPaginated200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModForumGetForumDiscussionsPaginated200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


