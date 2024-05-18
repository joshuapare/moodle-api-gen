# ModForumAddDiscussionPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **string** | new post message (html assumed if messageformat is not provided) | [default to "null"]
**Messageformat** | Pointer to **int32** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Options** | Pointer to [**[]ModForumAddDiscussionPostRequestOptionsInner**](ModForumAddDiscussionPostRequestOptionsInner.md) |  | [optional] 
**Postid** | **int32** | the post id we are going to reply to                                                 (can be the initial discussion post | [default to null]
**Subject** | **string** | new post subject | [default to "null"]

## Methods

### NewModForumAddDiscussionPostRequest

`func NewModForumAddDiscussionPostRequest(message string, postid int32, subject string, ) *ModForumAddDiscussionPostRequest`

NewModForumAddDiscussionPostRequest instantiates a new ModForumAddDiscussionPostRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumAddDiscussionPostRequestWithDefaults

`func NewModForumAddDiscussionPostRequestWithDefaults() *ModForumAddDiscussionPostRequest`

NewModForumAddDiscussionPostRequestWithDefaults instantiates a new ModForumAddDiscussionPostRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *ModForumAddDiscussionPostRequest) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModForumAddDiscussionPostRequest) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModForumAddDiscussionPostRequest) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetMessageformat

`func (o *ModForumAddDiscussionPostRequest) GetMessageformat() int32`

GetMessageformat returns the Messageformat field if non-nil, zero value otherwise.

### GetMessageformatOk

`func (o *ModForumAddDiscussionPostRequest) GetMessageformatOk() (*int32, bool)`

GetMessageformatOk returns a tuple with the Messageformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageformat

`func (o *ModForumAddDiscussionPostRequest) SetMessageformat(v int32)`

SetMessageformat sets Messageformat field to given value.

### HasMessageformat

`func (o *ModForumAddDiscussionPostRequest) HasMessageformat() bool`

HasMessageformat returns a boolean if a field has been set.

### GetOptions

`func (o *ModForumAddDiscussionPostRequest) GetOptions() []ModForumAddDiscussionPostRequestOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModForumAddDiscussionPostRequest) GetOptionsOk() (*[]ModForumAddDiscussionPostRequestOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModForumAddDiscussionPostRequest) SetOptions(v []ModForumAddDiscussionPostRequestOptionsInner)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModForumAddDiscussionPostRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetPostid

`func (o *ModForumAddDiscussionPostRequest) GetPostid() int32`

GetPostid returns the Postid field if non-nil, zero value otherwise.

### GetPostidOk

`func (o *ModForumAddDiscussionPostRequest) GetPostidOk() (*int32, bool)`

GetPostidOk returns a tuple with the Postid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostid

`func (o *ModForumAddDiscussionPostRequest) SetPostid(v int32)`

SetPostid sets Postid field to given value.


### GetSubject

`func (o *ModForumAddDiscussionPostRequest) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *ModForumAddDiscussionPostRequest) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *ModForumAddDiscussionPostRequest) SetSubject(v string)`

SetSubject sets Subject field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


