# CoreMessageSendMessagesToConversationRequestMessagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | Pointer to **string** | the text of the message | [optional] 
**Textformat** | Pointer to **int32** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]

## Methods

### NewCoreMessageSendMessagesToConversationRequestMessagesInner

`func NewCoreMessageSendMessagesToConversationRequestMessagesInner() *CoreMessageSendMessagesToConversationRequestMessagesInner`

NewCoreMessageSendMessagesToConversationRequestMessagesInner instantiates a new CoreMessageSendMessagesToConversationRequestMessagesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageSendMessagesToConversationRequestMessagesInnerWithDefaults

`func NewCoreMessageSendMessagesToConversationRequestMessagesInnerWithDefaults() *CoreMessageSendMessagesToConversationRequestMessagesInner`

NewCoreMessageSendMessagesToConversationRequestMessagesInnerWithDefaults instantiates a new CoreMessageSendMessagesToConversationRequestMessagesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetText

`func (o *CoreMessageSendMessagesToConversationRequestMessagesInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CoreMessageSendMessagesToConversationRequestMessagesInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CoreMessageSendMessagesToConversationRequestMessagesInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *CoreMessageSendMessagesToConversationRequestMessagesInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetTextformat

`func (o *CoreMessageSendMessagesToConversationRequestMessagesInner) GetTextformat() int32`

GetTextformat returns the Textformat field if non-nil, zero value otherwise.

### GetTextformatOk

`func (o *CoreMessageSendMessagesToConversationRequestMessagesInner) GetTextformatOk() (*int32, bool)`

GetTextformatOk returns a tuple with the Textformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTextformat

`func (o *CoreMessageSendMessagesToConversationRequestMessagesInner) SetTextformat(v int32)`

SetTextformat sets Textformat field to given value.

### HasTextformat

`func (o *CoreMessageSendMessagesToConversationRequestMessagesInner) HasTextformat() bool`

HasTextformat returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


