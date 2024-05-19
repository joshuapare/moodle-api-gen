# CoreCalendarCreateCalendarEvents200ResponseEventsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | course id | [optional] 
**Description** | Pointer to **string** | Description | [optional] 
**Eventtype** | Pointer to **string** | Event type | [optional] [default to "null"]
**Format** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Groupid** | Pointer to **int32** | group id | [optional] [default to null]
**Id** | Pointer to **int32** | event id | [optional] [default to null]
**Instance** | Pointer to **int32** | instance id | [optional] [default to null]
**Modulename** | Pointer to **string** | module name | [optional] [default to "null"]
**Name** | Pointer to **string** | event name | [optional] [default to "null"]
**Repeatid** | Pointer to **int32** | repeat id | [optional] [default to null]
**Sequence** | Pointer to **int32** | sequence | [optional] [default to null]
**Subscriptionid** | Pointer to **int32** | Subscription id | [optional] [default to null]
**Timeduration** | Pointer to **int32** | time duration | [optional] [default to null]
**Timemodified** | Pointer to **int32** | time modified | [optional] [default to null]
**Timestart** | Pointer to **int32** | timestart | [optional] [default to null]
**Userid** | Pointer to **int32** | user id | [optional] [default to null]
**Uuid** | Pointer to **string** | unique id of ical events | [optional] [default to ""]
**Visible** | Pointer to **int32** | visible | [optional] [default to null]

## Methods

### NewCoreCalendarCreateCalendarEvents200ResponseEventsInner

`func NewCoreCalendarCreateCalendarEvents200ResponseEventsInner() *CoreCalendarCreateCalendarEvents200ResponseEventsInner`

NewCoreCalendarCreateCalendarEvents200ResponseEventsInner instantiates a new CoreCalendarCreateCalendarEvents200ResponseEventsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarCreateCalendarEvents200ResponseEventsInnerWithDefaults

`func NewCoreCalendarCreateCalendarEvents200ResponseEventsInnerWithDefaults() *CoreCalendarCreateCalendarEvents200ResponseEventsInner`

NewCoreCalendarCreateCalendarEvents200ResponseEventsInnerWithDefaults instantiates a new CoreCalendarCreateCalendarEvents200ResponseEventsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetEventtype

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetEventtype() string`

GetEventtype returns the Eventtype field if non-nil, zero value otherwise.

### GetEventtypeOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetEventtypeOk() (*string, bool)`

GetEventtypeOk returns a tuple with the Eventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventtype

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetEventtype(v string)`

SetEventtype sets Eventtype field to given value.

### HasEventtype

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasEventtype() bool`

HasEventtype returns a boolean if a field has been set.

### GetFormat

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetFormat() int32`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetFormatOk() (*int32, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetFormat(v int32)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetGroupid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetId

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInstance

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetInstance() int32`

GetInstance returns the Instance field if non-nil, zero value otherwise.

### GetInstanceOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetInstanceOk() (*int32, bool)`

GetInstanceOk returns a tuple with the Instance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstance

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetInstance(v int32)`

SetInstance sets Instance field to given value.

### HasInstance

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasInstance() bool`

HasInstance returns a boolean if a field has been set.

### GetModulename

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetModulename() string`

GetModulename returns the Modulename field if non-nil, zero value otherwise.

### GetModulenameOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetModulenameOk() (*string, bool)`

GetModulenameOk returns a tuple with the Modulename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModulename

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetModulename(v string)`

SetModulename sets Modulename field to given value.

### HasModulename

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasModulename() bool`

HasModulename returns a boolean if a field has been set.

### GetName

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRepeatid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetRepeatid() int32`

GetRepeatid returns the Repeatid field if non-nil, zero value otherwise.

### GetRepeatidOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetRepeatidOk() (*int32, bool)`

GetRepeatidOk returns a tuple with the Repeatid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepeatid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetRepeatid(v int32)`

SetRepeatid sets Repeatid field to given value.

### HasRepeatid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasRepeatid() bool`

HasRepeatid returns a boolean if a field has been set.

### GetSequence

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetSequence() int32`

GetSequence returns the Sequence field if non-nil, zero value otherwise.

### GetSequenceOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetSequenceOk() (*int32, bool)`

GetSequenceOk returns a tuple with the Sequence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSequence

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetSequence(v int32)`

SetSequence sets Sequence field to given value.

### HasSequence

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasSequence() bool`

HasSequence returns a boolean if a field has been set.

### GetSubscriptionid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetSubscriptionid() int32`

GetSubscriptionid returns the Subscriptionid field if non-nil, zero value otherwise.

### GetSubscriptionidOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetSubscriptionidOk() (*int32, bool)`

GetSubscriptionidOk returns a tuple with the Subscriptionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscriptionid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetSubscriptionid(v int32)`

SetSubscriptionid sets Subscriptionid field to given value.

### HasSubscriptionid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasSubscriptionid() bool`

HasSubscriptionid returns a boolean if a field has been set.

### GetTimeduration

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetTimeduration() int32`

GetTimeduration returns the Timeduration field if non-nil, zero value otherwise.

### GetTimedurationOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetTimedurationOk() (*int32, bool)`

GetTimedurationOk returns a tuple with the Timeduration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeduration

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetTimeduration(v int32)`

SetTimeduration sets Timeduration field to given value.

### HasTimeduration

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasTimeduration() bool`

HasTimeduration returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimestart

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUuid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetUuid(v string)`

SetUuid sets Uuid field to given value.

### HasUuid

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasUuid() bool`

HasUuid returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCalendarCreateCalendarEvents200ResponseEventsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


