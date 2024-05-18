# ModForumUpdateDiscussionPostRequestOptionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The allowed keys (value format) are:                                 pinned (bool); (only for discussions) whether to pin this discussion or not                                 discussionsubscribe (bool); whether to subscribe to the post or not                                 inlineattachmentsid (int); the draft file area id for inline attachments in the text                                 attachmentsid (int); the draft file area id for attachments | [optional] [default to "null"]
**Value** | Pointer to **string** | The value of the option. | [optional] [default to "null"]

## Methods

### NewModForumUpdateDiscussionPostRequestOptionsInner

`func NewModForumUpdateDiscussionPostRequestOptionsInner() *ModForumUpdateDiscussionPostRequestOptionsInner`

NewModForumUpdateDiscussionPostRequestOptionsInner instantiates a new ModForumUpdateDiscussionPostRequestOptionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumUpdateDiscussionPostRequestOptionsInnerWithDefaults

`func NewModForumUpdateDiscussionPostRequestOptionsInnerWithDefaults() *ModForumUpdateDiscussionPostRequestOptionsInner`

NewModForumUpdateDiscussionPostRequestOptionsInnerWithDefaults instantiates a new ModForumUpdateDiscussionPostRequestOptionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ModForumUpdateDiscussionPostRequestOptionsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModForumUpdateDiscussionPostRequestOptionsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModForumUpdateDiscussionPostRequestOptionsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModForumUpdateDiscussionPostRequestOptionsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetValue

`func (o *ModForumUpdateDiscussionPostRequestOptionsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ModForumUpdateDiscussionPostRequestOptionsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ModForumUpdateDiscussionPostRequestOptionsInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *ModForumUpdateDiscussionPostRequestOptionsInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


