# CoreMessageGetMessages200ResponseMessagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | Pointer to **string** | The component that generated the notification | [optional] [default to "null"]
**Contexturl** | Pointer to **string** | Context URL | [optional] [default to "null"]
**Contexturlname** | Pointer to **string** | Context URL link name | [optional] [default to "null"]
**Customdata** | Pointer to **string** | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). | [optional] [default to "null"]
**Eventtype** | Pointer to **string** | The type of notification | [optional] [default to "null"]
**Fullmessage** | Pointer to **string** | The message | [optional] [default to "null"]
**Fullmessageformat** | Pointer to **int32** | fullmessage format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Fullmessagehtml** | Pointer to **string** | The message in html | [optional] [default to "null"]
**Iconurl** | Pointer to **string** | URL for icon, only for notifications. | [optional] [default to "null"]
**Id** | Pointer to **int32** | Message id | [optional] 
**Notification** | Pointer to **int32** | Is a notification? | [optional] [default to null]
**Smallmessage** | Pointer to **string** | The shorten message | [optional] [default to "null"]
**Subject** | Pointer to **string** | The message subject | [optional] [default to "null"]
**Text** | Pointer to **string** | The message text formated | [optional] [default to "null"]
**Timecreated** | Pointer to **int32** | Time created | [optional] 
**Timeread** | Pointer to **int32** | Time read | [optional] [default to null]
**Userfromfullname** | Pointer to **string** | User from full name | [optional] [default to "null"]
**Useridfrom** | Pointer to **int32** | User from id | [optional] 
**Useridto** | Pointer to **int32** | User to id | [optional] 
**Usertofullname** | Pointer to **string** | User to full name | [optional] [default to "null"]

## Methods

### NewCoreMessageGetMessages200ResponseMessagesInner

`func NewCoreMessageGetMessages200ResponseMessagesInner() *CoreMessageGetMessages200ResponseMessagesInner`

NewCoreMessageGetMessages200ResponseMessagesInner instantiates a new CoreMessageGetMessages200ResponseMessagesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetMessages200ResponseMessagesInnerWithDefaults

`func NewCoreMessageGetMessages200ResponseMessagesInnerWithDefaults() *CoreMessageGetMessages200ResponseMessagesInner`

NewCoreMessageGetMessages200ResponseMessagesInnerWithDefaults instantiates a new CoreMessageGetMessages200ResponseMessagesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetContexturl

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetContexturl() string`

GetContexturl returns the Contexturl field if non-nil, zero value otherwise.

### GetContexturlOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetContexturlOk() (*string, bool)`

GetContexturlOk returns a tuple with the Contexturl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContexturl

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetContexturl(v string)`

SetContexturl sets Contexturl field to given value.

### HasContexturl

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasContexturl() bool`

HasContexturl returns a boolean if a field has been set.

### GetContexturlname

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetContexturlname() string`

GetContexturlname returns the Contexturlname field if non-nil, zero value otherwise.

### GetContexturlnameOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetContexturlnameOk() (*string, bool)`

GetContexturlnameOk returns a tuple with the Contexturlname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContexturlname

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetContexturlname(v string)`

SetContexturlname sets Contexturlname field to given value.

### HasContexturlname

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasContexturlname() bool`

HasContexturlname returns a boolean if a field has been set.

### GetCustomdata

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetCustomdata() string`

GetCustomdata returns the Customdata field if non-nil, zero value otherwise.

### GetCustomdataOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetCustomdataOk() (*string, bool)`

GetCustomdataOk returns a tuple with the Customdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomdata

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetCustomdata(v string)`

SetCustomdata sets Customdata field to given value.

### HasCustomdata

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasCustomdata() bool`

HasCustomdata returns a boolean if a field has been set.

### GetEventtype

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetEventtype() string`

GetEventtype returns the Eventtype field if non-nil, zero value otherwise.

### GetEventtypeOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetEventtypeOk() (*string, bool)`

GetEventtypeOk returns a tuple with the Eventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventtype

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetEventtype(v string)`

SetEventtype sets Eventtype field to given value.

### HasEventtype

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasEventtype() bool`

HasEventtype returns a boolean if a field has been set.

### GetFullmessage

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetFullmessage() string`

GetFullmessage returns the Fullmessage field if non-nil, zero value otherwise.

### GetFullmessageOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetFullmessageOk() (*string, bool)`

GetFullmessageOk returns a tuple with the Fullmessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullmessage

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetFullmessage(v string)`

SetFullmessage sets Fullmessage field to given value.

### HasFullmessage

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasFullmessage() bool`

HasFullmessage returns a boolean if a field has been set.

### GetFullmessageformat

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetFullmessageformat() int32`

GetFullmessageformat returns the Fullmessageformat field if non-nil, zero value otherwise.

### GetFullmessageformatOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetFullmessageformatOk() (*int32, bool)`

GetFullmessageformatOk returns a tuple with the Fullmessageformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullmessageformat

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetFullmessageformat(v int32)`

SetFullmessageformat sets Fullmessageformat field to given value.

### HasFullmessageformat

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasFullmessageformat() bool`

HasFullmessageformat returns a boolean if a field has been set.

### GetFullmessagehtml

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetFullmessagehtml() string`

GetFullmessagehtml returns the Fullmessagehtml field if non-nil, zero value otherwise.

### GetFullmessagehtmlOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetFullmessagehtmlOk() (*string, bool)`

GetFullmessagehtmlOk returns a tuple with the Fullmessagehtml field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullmessagehtml

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetFullmessagehtml(v string)`

SetFullmessagehtml sets Fullmessagehtml field to given value.

### HasFullmessagehtml

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasFullmessagehtml() bool`

HasFullmessagehtml returns a boolean if a field has been set.

### GetIconurl

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetIconurl() string`

GetIconurl returns the Iconurl field if non-nil, zero value otherwise.

### GetIconurlOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetIconurlOk() (*string, bool)`

GetIconurlOk returns a tuple with the Iconurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIconurl

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetIconurl(v string)`

SetIconurl sets Iconurl field to given value.

### HasIconurl

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasIconurl() bool`

HasIconurl returns a boolean if a field has been set.

### GetId

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetNotification

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetNotification() int32`

GetNotification returns the Notification field if non-nil, zero value otherwise.

### GetNotificationOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetNotificationOk() (*int32, bool)`

GetNotificationOk returns a tuple with the Notification field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotification

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetNotification(v int32)`

SetNotification sets Notification field to given value.

### HasNotification

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasNotification() bool`

HasNotification returns a boolean if a field has been set.

### GetSmallmessage

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetSmallmessage() string`

GetSmallmessage returns the Smallmessage field if non-nil, zero value otherwise.

### GetSmallmessageOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetSmallmessageOk() (*string, bool)`

GetSmallmessageOk returns a tuple with the Smallmessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSmallmessage

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetSmallmessage(v string)`

SetSmallmessage sets Smallmessage field to given value.

### HasSmallmessage

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasSmallmessage() bool`

HasSmallmessage returns a boolean if a field has been set.

### GetSubject

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetText

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimeread

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetTimeread() int32`

GetTimeread returns the Timeread field if non-nil, zero value otherwise.

### GetTimereadOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetTimereadOk() (*int32, bool)`

GetTimereadOk returns a tuple with the Timeread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeread

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetTimeread(v int32)`

SetTimeread sets Timeread field to given value.

### HasTimeread

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasTimeread() bool`

HasTimeread returns a boolean if a field has been set.

### GetUserfromfullname

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetUserfromfullname() string`

GetUserfromfullname returns the Userfromfullname field if non-nil, zero value otherwise.

### GetUserfromfullnameOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetUserfromfullnameOk() (*string, bool)`

GetUserfromfullnameOk returns a tuple with the Userfromfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserfromfullname

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetUserfromfullname(v string)`

SetUserfromfullname sets Userfromfullname field to given value.

### HasUserfromfullname

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasUserfromfullname() bool`

HasUserfromfullname returns a boolean if a field has been set.

### GetUseridfrom

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetUseridfrom() int32`

GetUseridfrom returns the Useridfrom field if non-nil, zero value otherwise.

### GetUseridfromOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetUseridfromOk() (*int32, bool)`

GetUseridfromOk returns a tuple with the Useridfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseridfrom

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetUseridfrom(v int32)`

SetUseridfrom sets Useridfrom field to given value.

### HasUseridfrom

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasUseridfrom() bool`

HasUseridfrom returns a boolean if a field has been set.

### GetUseridto

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetUseridto() int32`

GetUseridto returns the Useridto field if non-nil, zero value otherwise.

### GetUseridtoOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetUseridtoOk() (*int32, bool)`

GetUseridtoOk returns a tuple with the Useridto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseridto

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetUseridto(v int32)`

SetUseridto sets Useridto field to given value.

### HasUseridto

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasUseridto() bool`

HasUseridto returns a boolean if a field has been set.

### GetUsertofullname

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetUsertofullname() string`

GetUsertofullname returns the Usertofullname field if non-nil, zero value otherwise.

### GetUsertofullnameOk

`func (o *CoreMessageGetMessages200ResponseMessagesInner) GetUsertofullnameOk() (*string, bool)`

GetUsertofullnameOk returns a tuple with the Usertofullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsertofullname

`func (o *CoreMessageGetMessages200ResponseMessagesInner) SetUsertofullname(v string)`

SetUsertofullname sets Usertofullname field to given value.

### HasUsertofullname

`func (o *CoreMessageGetMessages200ResponseMessagesInner) HasUsertofullname() bool`

HasUsertofullname returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


