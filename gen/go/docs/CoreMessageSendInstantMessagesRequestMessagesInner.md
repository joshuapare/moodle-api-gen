# CoreMessageSendInstantMessagesRequestMessagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Clientmsgid** | Pointer to **string** | your own client id for the message. If this id is provided, the fail message id will be returned to you | [optional] [default to "null"]
**Text** | Pointer to **string** | the text of the message | [optional] [default to "null"]
**Textformat** | Pointer to **int32** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Touserid** | Pointer to **int32** | id of the user to send the private message | [optional] [default to null]

## Methods

### NewCoreMessageSendInstantMessagesRequestMessagesInner

`func NewCoreMessageSendInstantMessagesRequestMessagesInner() *CoreMessageSendInstantMessagesRequestMessagesInner`

NewCoreMessageSendInstantMessagesRequestMessagesInner instantiates a new CoreMessageSendInstantMessagesRequestMessagesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageSendInstantMessagesRequestMessagesInnerWithDefaults

`func NewCoreMessageSendInstantMessagesRequestMessagesInnerWithDefaults() *CoreMessageSendInstantMessagesRequestMessagesInner`

NewCoreMessageSendInstantMessagesRequestMessagesInnerWithDefaults instantiates a new CoreMessageSendInstantMessagesRequestMessagesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClientmsgid

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetClientmsgid() string`

GetClientmsgid returns the Clientmsgid field if non-nil, zero value otherwise.

### GetClientmsgidOk

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetClientmsgidOk() (*string, bool)`

GetClientmsgidOk returns a tuple with the Clientmsgid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientmsgid

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) SetClientmsgid(v string)`

SetClientmsgid sets Clientmsgid field to given value.

### HasClientmsgid

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) HasClientmsgid() bool`

HasClientmsgid returns a boolean if a field has been set.

### GetText

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetTextformat

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetTextformat() int32`

GetTextformat returns the Textformat field if non-nil, zero value otherwise.

### GetTextformatOk

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetTextformatOk() (*int32, bool)`

GetTextformatOk returns a tuple with the Textformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTextformat

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) SetTextformat(v int32)`

SetTextformat sets Textformat field to given value.

### HasTextformat

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) HasTextformat() bool`

HasTextformat returns a boolean if a field has been set.

### GetTouserid

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetTouserid() int32`

GetTouserid returns the Touserid field if non-nil, zero value otherwise.

### GetTouseridOk

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetTouseridOk() (*int32, bool)`

GetTouseridOk returns a tuple with the Touserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTouserid

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) SetTouserid(v int32)`

SetTouserid sets Touserid field to given value.

### HasTouserid

`func (o *CoreMessageSendInstantMessagesRequestMessagesInner) HasTouserid() bool`

HasTouserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


