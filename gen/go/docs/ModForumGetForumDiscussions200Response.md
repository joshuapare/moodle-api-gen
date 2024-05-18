# ModForumGetForumDiscussions200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Discussions** | [**[]ModForumGetForumDiscussions200ResponseDiscussionsInner**](ModForumGetForumDiscussions200ResponseDiscussionsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModForumGetForumDiscussions200Response

`func NewModForumGetForumDiscussions200Response(discussions []ModForumGetForumDiscussions200ResponseDiscussionsInner, ) *ModForumGetForumDiscussions200Response`

NewModForumGetForumDiscussions200Response instantiates a new ModForumGetForumDiscussions200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetForumDiscussions200ResponseWithDefaults

`func NewModForumGetForumDiscussions200ResponseWithDefaults() *ModForumGetForumDiscussions200Response`

NewModForumGetForumDiscussions200ResponseWithDefaults instantiates a new ModForumGetForumDiscussions200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscussions

`func (o *ModForumGetForumDiscussions200Response) GetDiscussions() []ModForumGetForumDiscussions200ResponseDiscussionsInner`

GetDiscussions returns the Discussions field if non-nil, zero value otherwise.

### GetDiscussionsOk

`func (o *ModForumGetForumDiscussions200Response) GetDiscussionsOk() (*[]ModForumGetForumDiscussions200ResponseDiscussionsInner, bool)`

GetDiscussionsOk returns a tuple with the Discussions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussions

`func (o *ModForumGetForumDiscussions200Response) SetDiscussions(v []ModForumGetForumDiscussions200ResponseDiscussionsInner)`

SetDiscussions sets Discussions field to given value.


### GetWarnings

`func (o *ModForumGetForumDiscussions200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModForumGetForumDiscussions200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModForumGetForumDiscussions200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModForumGetForumDiscussions200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


