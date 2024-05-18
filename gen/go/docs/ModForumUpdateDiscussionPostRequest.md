# ModForumUpdateDiscussionPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | Pointer to **string** | Updated post message (HTML assumed if messageformat is not provided) | [optional] [default to ""]
**Messageformat** | Pointer to **int32** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Options** | Pointer to [**[]ModForumUpdateDiscussionPostRequestOptionsInner**](ModForumUpdateDiscussionPostRequestOptionsInner.md) |  | [optional] 
**Postid** | **int32** | Post to be updated. It can be a discussion topic post. | [default to null]
**Subject** | Pointer to **string** | Updated post subject | [optional] [default to ""]

## Methods

### NewModForumUpdateDiscussionPostRequest

`func NewModForumUpdateDiscussionPostRequest(postid int32, ) *ModForumUpdateDiscussionPostRequest`

NewModForumUpdateDiscussionPostRequest instantiates a new ModForumUpdateDiscussionPostRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumUpdateDiscussionPostRequestWithDefaults

`func NewModForumUpdateDiscussionPostRequestWithDefaults() *ModForumUpdateDiscussionPostRequest`

NewModForumUpdateDiscussionPostRequestWithDefaults instantiates a new ModForumUpdateDiscussionPostRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *ModForumUpdateDiscussionPostRequest) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModForumUpdateDiscussionPostRequest) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModForumUpdateDiscussionPostRequest) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ModForumUpdateDiscussionPostRequest) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetMessageformat

`func (o *ModForumUpdateDiscussionPostRequest) GetMessageformat() int32`

GetMessageformat returns the Messageformat field if non-nil, zero value otherwise.

### GetMessageformatOk

`func (o *ModForumUpdateDiscussionPostRequest) GetMessageformatOk() (*int32, bool)`

GetMessageformatOk returns a tuple with the Messageformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageformat

`func (o *ModForumUpdateDiscussionPostRequest) SetMessageformat(v int32)`

SetMessageformat sets Messageformat field to given value.

### HasMessageformat

`func (o *ModForumUpdateDiscussionPostRequest) HasMessageformat() bool`

HasMessageformat returns a boolean if a field has been set.

### GetOptions

`func (o *ModForumUpdateDiscussionPostRequest) GetOptions() []ModForumUpdateDiscussionPostRequestOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModForumUpdateDiscussionPostRequest) GetOptionsOk() (*[]ModForumUpdateDiscussionPostRequestOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModForumUpdateDiscussionPostRequest) SetOptions(v []ModForumUpdateDiscussionPostRequestOptionsInner)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModForumUpdateDiscussionPostRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetPostid

`func (o *ModForumUpdateDiscussionPostRequest) GetPostid() int32`

GetPostid returns the Postid field if non-nil, zero value otherwise.

### GetPostidOk

`func (o *ModForumUpdateDiscussionPostRequest) GetPostidOk() (*int32, bool)`

GetPostidOk returns a tuple with the Postid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostid

`func (o *ModForumUpdateDiscussionPostRequest) SetPostid(v int32)`

SetPostid sets Postid field to given value.


### GetSubject

`func (o *ModForumUpdateDiscussionPostRequest) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *ModForumUpdateDiscussionPostRequest) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *ModForumUpdateDiscussionPostRequest) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *ModForumUpdateDiscussionPostRequest) HasSubject() bool`

HasSubject returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


