# MessagePopupGetPopupNotifications200ResponseNotificationsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | Pointer to **string** | The component that generated the notification | [optional] 
**Contexturl** | Pointer to **string** | Context URL | [optional] 
**Contexturlname** | Pointer to **string** | Context URL link name | [optional] 
**Customdata** | Pointer to **string** | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). | [optional] 
**Deleted** | Pointer to **bool** | notification deletion status | [optional] [default to null]
**Eventtype** | Pointer to **string** | The type of notification | [optional] 
**Fullmessage** | Pointer to **string** | The message | [optional] 
**Fullmessageformat** | Pointer to **int32** | fullmessage format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Fullmessagehtml** | Pointer to **string** | The message in html | [optional] 
**Iconurl** | Pointer to **string** | URL for notification icon | [optional] [default to "null"]
**Id** | Pointer to **int32** | Notification id (this is not guaranteed to be unique                                 within this result set) | [optional] [default to null]
**Read** | Pointer to **bool** | notification read status | [optional] [default to null]
**Shortenedsubject** | Pointer to **string** | The notification subject shortened                                 with ellipsis | [optional] [default to "null"]
**Smallmessage** | Pointer to **string** | The shorten message | [optional] 
**Subject** | Pointer to **string** | The notification subject | [optional] [default to "null"]
**Text** | Pointer to **string** | The message text formated | [optional] 
**Timecreated** | Pointer to **int32** | Time created | [optional] 
**Timecreatedpretty** | Pointer to **string** | Time created in a pretty format | [optional] [default to "null"]
**Timeread** | Pointer to **int32** | Time read | [optional] 
**Useridfrom** | Pointer to **int32** | User from id | [optional] 
**Useridto** | Pointer to **int32** | User to id | [optional] 

## Methods

### NewMessagePopupGetPopupNotifications200ResponseNotificationsInner

`func NewMessagePopupGetPopupNotifications200ResponseNotificationsInner() *MessagePopupGetPopupNotifications200ResponseNotificationsInner`

NewMessagePopupGetPopupNotifications200ResponseNotificationsInner instantiates a new MessagePopupGetPopupNotifications200ResponseNotificationsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessagePopupGetPopupNotifications200ResponseNotificationsInnerWithDefaults

`func NewMessagePopupGetPopupNotifications200ResponseNotificationsInnerWithDefaults() *MessagePopupGetPopupNotifications200ResponseNotificationsInner`

NewMessagePopupGetPopupNotifications200ResponseNotificationsInnerWithDefaults instantiates a new MessagePopupGetPopupNotifications200ResponseNotificationsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetContexturl

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetContexturl() string`

GetContexturl returns the Contexturl field if non-nil, zero value otherwise.

### GetContexturlOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetContexturlOk() (*string, bool)`

GetContexturlOk returns a tuple with the Contexturl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContexturl

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetContexturl(v string)`

SetContexturl sets Contexturl field to given value.

### HasContexturl

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasContexturl() bool`

HasContexturl returns a boolean if a field has been set.

### GetContexturlname

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetContexturlname() string`

GetContexturlname returns the Contexturlname field if non-nil, zero value otherwise.

### GetContexturlnameOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetContexturlnameOk() (*string, bool)`

GetContexturlnameOk returns a tuple with the Contexturlname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContexturlname

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetContexturlname(v string)`

SetContexturlname sets Contexturlname field to given value.

### HasContexturlname

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasContexturlname() bool`

HasContexturlname returns a boolean if a field has been set.

### GetCustomdata

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetCustomdata() string`

GetCustomdata returns the Customdata field if non-nil, zero value otherwise.

### GetCustomdataOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetCustomdataOk() (*string, bool)`

GetCustomdataOk returns a tuple with the Customdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomdata

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetCustomdata(v string)`

SetCustomdata sets Customdata field to given value.

### HasCustomdata

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasCustomdata() bool`

HasCustomdata returns a boolean if a field has been set.

### GetDeleted

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetDeleted() bool`

GetDeleted returns the Deleted field if non-nil, zero value otherwise.

### GetDeletedOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetDeletedOk() (*bool, bool)`

GetDeletedOk returns a tuple with the Deleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleted

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetDeleted(v bool)`

SetDeleted sets Deleted field to given value.

### HasDeleted

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasDeleted() bool`

HasDeleted returns a boolean if a field has been set.

### GetEventtype

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetEventtype() string`

GetEventtype returns the Eventtype field if non-nil, zero value otherwise.

### GetEventtypeOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetEventtypeOk() (*string, bool)`

GetEventtypeOk returns a tuple with the Eventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventtype

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetEventtype(v string)`

SetEventtype sets Eventtype field to given value.

### HasEventtype

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasEventtype() bool`

HasEventtype returns a boolean if a field has been set.

### GetFullmessage

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetFullmessage() string`

GetFullmessage returns the Fullmessage field if non-nil, zero value otherwise.

### GetFullmessageOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetFullmessageOk() (*string, bool)`

GetFullmessageOk returns a tuple with the Fullmessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullmessage

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetFullmessage(v string)`

SetFullmessage sets Fullmessage field to given value.

### HasFullmessage

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasFullmessage() bool`

HasFullmessage returns a boolean if a field has been set.

### GetFullmessageformat

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetFullmessageformat() int32`

GetFullmessageformat returns the Fullmessageformat field if non-nil, zero value otherwise.

### GetFullmessageformatOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetFullmessageformatOk() (*int32, bool)`

GetFullmessageformatOk returns a tuple with the Fullmessageformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullmessageformat

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetFullmessageformat(v int32)`

SetFullmessageformat sets Fullmessageformat field to given value.

### HasFullmessageformat

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasFullmessageformat() bool`

HasFullmessageformat returns a boolean if a field has been set.

### GetFullmessagehtml

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetFullmessagehtml() string`

GetFullmessagehtml returns the Fullmessagehtml field if non-nil, zero value otherwise.

### GetFullmessagehtmlOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetFullmessagehtmlOk() (*string, bool)`

GetFullmessagehtmlOk returns a tuple with the Fullmessagehtml field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullmessagehtml

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetFullmessagehtml(v string)`

SetFullmessagehtml sets Fullmessagehtml field to given value.

### HasFullmessagehtml

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasFullmessagehtml() bool`

HasFullmessagehtml returns a boolean if a field has been set.

### GetIconurl

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetIconurl() string`

GetIconurl returns the Iconurl field if non-nil, zero value otherwise.

### GetIconurlOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetIconurlOk() (*string, bool)`

GetIconurlOk returns a tuple with the Iconurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIconurl

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetIconurl(v string)`

SetIconurl sets Iconurl field to given value.

### HasIconurl

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasIconurl() bool`

HasIconurl returns a boolean if a field has been set.

### GetId

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetRead

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetRead() bool`

GetRead returns the Read field if non-nil, zero value otherwise.

### GetReadOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetReadOk() (*bool, bool)`

GetReadOk returns a tuple with the Read field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRead

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetRead(v bool)`

SetRead sets Read field to given value.

### HasRead

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasRead() bool`

HasRead returns a boolean if a field has been set.

### GetShortenedsubject

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetShortenedsubject() string`

GetShortenedsubject returns the Shortenedsubject field if non-nil, zero value otherwise.

### GetShortenedsubjectOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetShortenedsubjectOk() (*string, bool)`

GetShortenedsubjectOk returns a tuple with the Shortenedsubject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortenedsubject

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetShortenedsubject(v string)`

SetShortenedsubject sets Shortenedsubject field to given value.

### HasShortenedsubject

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasShortenedsubject() bool`

HasShortenedsubject returns a boolean if a field has been set.

### GetSmallmessage

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetSmallmessage() string`

GetSmallmessage returns the Smallmessage field if non-nil, zero value otherwise.

### GetSmallmessageOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetSmallmessageOk() (*string, bool)`

GetSmallmessageOk returns a tuple with the Smallmessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSmallmessage

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetSmallmessage(v string)`

SetSmallmessage sets Smallmessage field to given value.

### HasSmallmessage

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasSmallmessage() bool`

HasSmallmessage returns a boolean if a field has been set.

### GetSubject

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetText

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetTimecreated

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimecreatedpretty

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetTimecreatedpretty() string`

GetTimecreatedpretty returns the Timecreatedpretty field if non-nil, zero value otherwise.

### GetTimecreatedprettyOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetTimecreatedprettyOk() (*string, bool)`

GetTimecreatedprettyOk returns a tuple with the Timecreatedpretty field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreatedpretty

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetTimecreatedpretty(v string)`

SetTimecreatedpretty sets Timecreatedpretty field to given value.

### HasTimecreatedpretty

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasTimecreatedpretty() bool`

HasTimecreatedpretty returns a boolean if a field has been set.

### GetTimeread

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetTimeread() int32`

GetTimeread returns the Timeread field if non-nil, zero value otherwise.

### GetTimereadOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetTimereadOk() (*int32, bool)`

GetTimereadOk returns a tuple with the Timeread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeread

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetTimeread(v int32)`

SetTimeread sets Timeread field to given value.

### HasTimeread

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasTimeread() bool`

HasTimeread returns a boolean if a field has been set.

### GetUseridfrom

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetUseridfrom() int32`

GetUseridfrom returns the Useridfrom field if non-nil, zero value otherwise.

### GetUseridfromOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetUseridfromOk() (*int32, bool)`

GetUseridfromOk returns a tuple with the Useridfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseridfrom

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetUseridfrom(v int32)`

SetUseridfrom sets Useridfrom field to given value.

### HasUseridfrom

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasUseridfrom() bool`

HasUseridfrom returns a boolean if a field has been set.

### GetUseridto

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetUseridto() int32`

GetUseridto returns the Useridto field if non-nil, zero value otherwise.

### GetUseridtoOk

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) GetUseridtoOk() (*int32, bool)`

GetUseridtoOk returns a tuple with the Useridto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseridto

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) SetUseridto(v int32)`

SetUseridto sets Useridto field to given value.

### HasUseridto

`func (o *MessagePopupGetPopupNotifications200ResponseNotificationsInner) HasUseridto() bool`

HasUseridto returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


