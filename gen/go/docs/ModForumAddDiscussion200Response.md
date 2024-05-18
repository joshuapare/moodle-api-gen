# ModForumAddDiscussion200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Discussionid** | **int32** | New Discussion ID | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModForumAddDiscussion200Response

`func NewModForumAddDiscussion200Response(discussionid int32, ) *ModForumAddDiscussion200Response`

NewModForumAddDiscussion200Response instantiates a new ModForumAddDiscussion200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumAddDiscussion200ResponseWithDefaults

`func NewModForumAddDiscussion200ResponseWithDefaults() *ModForumAddDiscussion200Response`

NewModForumAddDiscussion200ResponseWithDefaults instantiates a new ModForumAddDiscussion200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscussionid

`func (o *ModForumAddDiscussion200Response) GetDiscussionid() int32`

GetDiscussionid returns the Discussionid field if non-nil, zero value otherwise.

### GetDiscussionidOk

`func (o *ModForumAddDiscussion200Response) GetDiscussionidOk() (*int32, bool)`

GetDiscussionidOk returns a tuple with the Discussionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussionid

`func (o *ModForumAddDiscussion200Response) SetDiscussionid(v int32)`

SetDiscussionid sets Discussionid field to given value.


### GetWarnings

`func (o *ModForumAddDiscussion200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModForumAddDiscussion200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModForumAddDiscussion200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModForumAddDiscussion200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


