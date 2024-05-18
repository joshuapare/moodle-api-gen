# ModForumAddDiscussionPostRequestOptionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The allowed keys (value format) are:                                         discussionsubscribe (bool); subscribe to the discussion?, default to true                                         private (bool); make this reply private to the author of the parent post, default to false.                                         inlineattachmentsid              (int); the draft file area id for inline attachments                                         attachmentsid       (int); the draft file area id for attachments                                         topreferredformat (bool); convert the message &amp; messageformat to FORMAT_HTML, defaults to false                              | [optional] [default to "null"]
**Value** | Pointer to **string** | the value of the option,                                                             this param is validated in the external function. | [optional] [default to "null"]

## Methods

### NewModForumAddDiscussionPostRequestOptionsInner

`func NewModForumAddDiscussionPostRequestOptionsInner() *ModForumAddDiscussionPostRequestOptionsInner`

NewModForumAddDiscussionPostRequestOptionsInner instantiates a new ModForumAddDiscussionPostRequestOptionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumAddDiscussionPostRequestOptionsInnerWithDefaults

`func NewModForumAddDiscussionPostRequestOptionsInnerWithDefaults() *ModForumAddDiscussionPostRequestOptionsInner`

NewModForumAddDiscussionPostRequestOptionsInnerWithDefaults instantiates a new ModForumAddDiscussionPostRequestOptionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ModForumAddDiscussionPostRequestOptionsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModForumAddDiscussionPostRequestOptionsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModForumAddDiscussionPostRequestOptionsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModForumAddDiscussionPostRequestOptionsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetValue

`func (o *ModForumAddDiscussionPostRequestOptionsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ModForumAddDiscussionPostRequestOptionsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ModForumAddDiscussionPostRequestOptionsInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *ModForumAddDiscussionPostRequestOptionsInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


