# ModForumAddDiscussionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Forumid** | **int32** | Forum instance ID | [default to null]
**Groupid** | Pointer to **int32** | The group, default to 0 | [optional] [default to 0]
**Message** | **string** | New Discussion message (only html format allowed) | [default to "null"]
**Options** | Pointer to [**[]ModForumAddDiscussionRequestOptionsInner**](ModForumAddDiscussionRequestOptionsInner.md) |  | [optional] 
**Subject** | **string** | New Discussion subject | [default to "null"]

## Methods

### NewModForumAddDiscussionRequest

`func NewModForumAddDiscussionRequest(forumid int32, message string, subject string, ) *ModForumAddDiscussionRequest`

NewModForumAddDiscussionRequest instantiates a new ModForumAddDiscussionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumAddDiscussionRequestWithDefaults

`func NewModForumAddDiscussionRequestWithDefaults() *ModForumAddDiscussionRequest`

NewModForumAddDiscussionRequestWithDefaults instantiates a new ModForumAddDiscussionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetForumid

`func (o *ModForumAddDiscussionRequest) GetForumid() int32`

GetForumid returns the Forumid field if non-nil, zero value otherwise.

### GetForumidOk

`func (o *ModForumAddDiscussionRequest) GetForumidOk() (*int32, bool)`

GetForumidOk returns a tuple with the Forumid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForumid

`func (o *ModForumAddDiscussionRequest) SetForumid(v int32)`

SetForumid sets Forumid field to given value.


### GetGroupid

`func (o *ModForumAddDiscussionRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModForumAddDiscussionRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModForumAddDiscussionRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModForumAddDiscussionRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetMessage

`func (o *ModForumAddDiscussionRequest) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModForumAddDiscussionRequest) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModForumAddDiscussionRequest) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetOptions

`func (o *ModForumAddDiscussionRequest) GetOptions() []ModForumAddDiscussionRequestOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModForumAddDiscussionRequest) GetOptionsOk() (*[]ModForumAddDiscussionRequestOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModForumAddDiscussionRequest) SetOptions(v []ModForumAddDiscussionRequestOptionsInner)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModForumAddDiscussionRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetSubject

`func (o *ModForumAddDiscussionRequest) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *ModForumAddDiscussionRequest) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *ModForumAddDiscussionRequest) SetSubject(v string)`

SetSubject sets Subject field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


