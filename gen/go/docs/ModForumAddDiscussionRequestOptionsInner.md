# ModForumAddDiscussionRequestOptionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The allowed keys (value format) are:                                         discussionsubscribe (bool); subscribe to the discussion?, default to true                                         discussionpinned    (bool); is the discussion pinned, default to false                                         inlineattachmentsid              (int); the draft file area id for inline attachments                                         attachmentsid       (int); the draft file area id for attachments                              | [optional] [default to "null"]
**Value** | Pointer to **string** | The value of the option,                                                             This param is validated in the external function. | [optional] [default to "null"]

## Methods

### NewModForumAddDiscussionRequestOptionsInner

`func NewModForumAddDiscussionRequestOptionsInner() *ModForumAddDiscussionRequestOptionsInner`

NewModForumAddDiscussionRequestOptionsInner instantiates a new ModForumAddDiscussionRequestOptionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumAddDiscussionRequestOptionsInnerWithDefaults

`func NewModForumAddDiscussionRequestOptionsInnerWithDefaults() *ModForumAddDiscussionRequestOptionsInner`

NewModForumAddDiscussionRequestOptionsInnerWithDefaults instantiates a new ModForumAddDiscussionRequestOptionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ModForumAddDiscussionRequestOptionsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModForumAddDiscussionRequestOptionsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModForumAddDiscussionRequestOptionsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModForumAddDiscussionRequestOptionsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetValue

`func (o *ModForumAddDiscussionRequestOptionsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ModForumAddDiscussionRequestOptionsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ModForumAddDiscussionRequestOptionsInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *ModForumAddDiscussionRequestOptionsInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


