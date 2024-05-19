# CoreCalendarGetCalendarEvents200ResponseEventsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | Pointer to **int32** | Category id (only for category events). | [optional] [default to null]
**Courseid** | Pointer to **int32** | course id | [optional] 
**Description** | Pointer to **string** | Description | [optional] 
**Eventtype** | Pointer to **string** | Event type | [optional] 
**Format** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Groupid** | Pointer to **int32** | group id | [optional] 
**Id** | Pointer to **int32** | event id | [optional] 
**Instance** | Pointer to **int32** | instance id | [optional] 
**Modulename** | Pointer to **string** | module name | [optional] 
**Name** | Pointer to **string** | event name | [optional] 
**Repeatid** | Pointer to **int32** | repeat id | [optional] 
**Sequence** | Pointer to **int32** | sequence | [optional] 
**Subscriptionid** | Pointer to **int32** | Subscription id | [optional] 
**Timeduration** | Pointer to **int32** | time duration | [optional] 
**Timemodified** | Pointer to **int32** | time modified | [optional] 
**Timestart** | Pointer to **int32** | timestart | [optional] 
**Userid** | Pointer to **int32** | user id | [optional] 
**Uuid** | Pointer to **string** | unique id of ical events | [optional] [default to "null"]
**Visible** | Pointer to **int32** | visible | [optional] 

## Methods

### NewCoreCalendarGetCalendarEvents200ResponseEventsInner

`func NewCoreCalendarGetCalendarEvents200ResponseEventsInner() *CoreCalendarGetCalendarEvents200ResponseEventsInner`

NewCoreCalendarGetCalendarEvents200ResponseEventsInner instantiates a new CoreCalendarGetCalendarEvents200ResponseEventsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarEvents200ResponseEventsInnerWithDefaults

`func NewCoreCalendarGetCalendarEvents200ResponseEventsInnerWithDefaults() *CoreCalendarGetCalendarEvents200ResponseEventsInner`

NewCoreCalendarGetCalendarEvents200ResponseEventsInnerWithDefaults instantiates a new CoreCalendarGetCalendarEvents200ResponseEventsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetEventtype

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetEventtype() string`

GetEventtype returns the Eventtype field if non-nil, zero value otherwise.

### GetEventtypeOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetEventtypeOk() (*string, bool)`

GetEventtypeOk returns a tuple with the Eventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventtype

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetEventtype(v string)`

SetEventtype sets Eventtype field to given value.

### HasEventtype

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasEventtype() bool`

HasEventtype returns a boolean if a field has been set.

### GetFormat

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetFormat() int32`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetFormatOk() (*int32, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetFormat(v int32)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetGroupid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetId

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInstance

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetInstance() int32`

GetInstance returns the Instance field if non-nil, zero value otherwise.

### GetInstanceOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetInstanceOk() (*int32, bool)`

GetInstanceOk returns a tuple with the Instance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstance

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetInstance(v int32)`

SetInstance sets Instance field to given value.

### HasInstance

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasInstance() bool`

HasInstance returns a boolean if a field has been set.

### GetModulename

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetModulename() string`

GetModulename returns the Modulename field if non-nil, zero value otherwise.

### GetModulenameOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetModulenameOk() (*string, bool)`

GetModulenameOk returns a tuple with the Modulename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModulename

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetModulename(v string)`

SetModulename sets Modulename field to given value.

### HasModulename

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasModulename() bool`

HasModulename returns a boolean if a field has been set.

### GetName

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRepeatid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetRepeatid() int32`

GetRepeatid returns the Repeatid field if non-nil, zero value otherwise.

### GetRepeatidOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetRepeatidOk() (*int32, bool)`

GetRepeatidOk returns a tuple with the Repeatid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepeatid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetRepeatid(v int32)`

SetRepeatid sets Repeatid field to given value.

### HasRepeatid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasRepeatid() bool`

HasRepeatid returns a boolean if a field has been set.

### GetSequence

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetSequence() int32`

GetSequence returns the Sequence field if non-nil, zero value otherwise.

### GetSequenceOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetSequenceOk() (*int32, bool)`

GetSequenceOk returns a tuple with the Sequence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSequence

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetSequence(v int32)`

SetSequence sets Sequence field to given value.

### HasSequence

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasSequence() bool`

HasSequence returns a boolean if a field has been set.

### GetSubscriptionid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetSubscriptionid() int32`

GetSubscriptionid returns the Subscriptionid field if non-nil, zero value otherwise.

### GetSubscriptionidOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetSubscriptionidOk() (*int32, bool)`

GetSubscriptionidOk returns a tuple with the Subscriptionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscriptionid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetSubscriptionid(v int32)`

SetSubscriptionid sets Subscriptionid field to given value.

### HasSubscriptionid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasSubscriptionid() bool`

HasSubscriptionid returns a boolean if a field has been set.

### GetTimeduration

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetTimeduration() int32`

GetTimeduration returns the Timeduration field if non-nil, zero value otherwise.

### GetTimedurationOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetTimedurationOk() (*int32, bool)`

GetTimedurationOk returns a tuple with the Timeduration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeduration

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetTimeduration(v int32)`

SetTimeduration sets Timeduration field to given value.

### HasTimeduration

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasTimeduration() bool`

HasTimeduration returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimestart

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUuid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetUuid(v string)`

SetUuid sets Uuid field to given value.

### HasUuid

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasUuid() bool`

HasUuid returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCalendarGetCalendarEvents200ResponseEventsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


