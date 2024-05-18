# CoreCalendarCreateCalendarEventsRequestEventsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | course id | [optional] [default to 0]
**Description** | Pointer to **string** | Description | [optional] [default to "null"]
**Eventtype** | Pointer to **string** | Event type | [optional] [default to "user"]
**Format** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Groupid** | Pointer to **int32** | group id | [optional] [default to 0]
**Name** | Pointer to **string** | event name | [optional] [default to ""]
**Repeats** | Pointer to **int32** | number of repeats | [optional] [default to 0]
**Sequence** | Pointer to **int32** | sequence | [optional] [default to 1]
**Timeduration** | Pointer to **int32** | time duration | [optional] [default to 0]
**Timestart** | Pointer to **int32** | timestart | [optional] [default to 1716010508]
**Visible** | Pointer to **int32** | visible | [optional] [default to 1]

## Methods

### NewCoreCalendarCreateCalendarEventsRequestEventsInner

`func NewCoreCalendarCreateCalendarEventsRequestEventsInner() *CoreCalendarCreateCalendarEventsRequestEventsInner`

NewCoreCalendarCreateCalendarEventsRequestEventsInner instantiates a new CoreCalendarCreateCalendarEventsRequestEventsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarCreateCalendarEventsRequestEventsInnerWithDefaults

`func NewCoreCalendarCreateCalendarEventsRequestEventsInnerWithDefaults() *CoreCalendarCreateCalendarEventsRequestEventsInner`

NewCoreCalendarCreateCalendarEventsRequestEventsInnerWithDefaults instantiates a new CoreCalendarCreateCalendarEventsRequestEventsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetEventtype

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetEventtype() string`

GetEventtype returns the Eventtype field if non-nil, zero value otherwise.

### GetEventtypeOk

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetEventtypeOk() (*string, bool)`

GetEventtypeOk returns a tuple with the Eventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventtype

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) SetEventtype(v string)`

SetEventtype sets Eventtype field to given value.

### HasEventtype

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) HasEventtype() bool`

HasEventtype returns a boolean if a field has been set.

### GetFormat

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetFormat() int32`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetFormatOk() (*int32, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) SetFormat(v int32)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetGroupid

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetName

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRepeats

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetRepeats() int32`

GetRepeats returns the Repeats field if non-nil, zero value otherwise.

### GetRepeatsOk

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetRepeatsOk() (*int32, bool)`

GetRepeatsOk returns a tuple with the Repeats field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepeats

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) SetRepeats(v int32)`

SetRepeats sets Repeats field to given value.

### HasRepeats

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) HasRepeats() bool`

HasRepeats returns a boolean if a field has been set.

### GetSequence

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetSequence() int32`

GetSequence returns the Sequence field if non-nil, zero value otherwise.

### GetSequenceOk

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetSequenceOk() (*int32, bool)`

GetSequenceOk returns a tuple with the Sequence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSequence

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) SetSequence(v int32)`

SetSequence sets Sequence field to given value.

### HasSequence

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) HasSequence() bool`

HasSequence returns a boolean if a field has been set.

### GetTimeduration

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetTimeduration() int32`

GetTimeduration returns the Timeduration field if non-nil, zero value otherwise.

### GetTimedurationOk

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetTimedurationOk() (*int32, bool)`

GetTimedurationOk returns a tuple with the Timeduration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeduration

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) SetTimeduration(v int32)`

SetTimeduration sets Timeduration field to given value.

### HasTimeduration

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) HasTimeduration() bool`

HasTimeduration returns a boolean if a field has been set.

### GetTimestart

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCalendarCreateCalendarEventsRequestEventsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


