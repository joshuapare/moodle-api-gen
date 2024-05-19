# CoreGetUserDatesRequestTimestampsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Fixday** | Pointer to **int32** | Remove leading zero for day | [optional] [default to 1]
**Fixhour** | Pointer to **int32** | Remove leading zero for hour | [optional] [default to 1]
**Format** | Pointer to **string** | format string | [optional] [default to "null"]
**Timestamp** | Pointer to **int32** | unix timestamp | [optional] [default to null]
**Type** | Pointer to **string** | The calendar type | [optional] [default to "null"]

## Methods

### NewCoreGetUserDatesRequestTimestampsInner

`func NewCoreGetUserDatesRequestTimestampsInner() *CoreGetUserDatesRequestTimestampsInner`

NewCoreGetUserDatesRequestTimestampsInner instantiates a new CoreGetUserDatesRequestTimestampsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGetUserDatesRequestTimestampsInnerWithDefaults

`func NewCoreGetUserDatesRequestTimestampsInnerWithDefaults() *CoreGetUserDatesRequestTimestampsInner`

NewCoreGetUserDatesRequestTimestampsInnerWithDefaults instantiates a new CoreGetUserDatesRequestTimestampsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFixday

`func (o *CoreGetUserDatesRequestTimestampsInner) GetFixday() int32`

GetFixday returns the Fixday field if non-nil, zero value otherwise.

### GetFixdayOk

`func (o *CoreGetUserDatesRequestTimestampsInner) GetFixdayOk() (*int32, bool)`

GetFixdayOk returns a tuple with the Fixday field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFixday

`func (o *CoreGetUserDatesRequestTimestampsInner) SetFixday(v int32)`

SetFixday sets Fixday field to given value.

### HasFixday

`func (o *CoreGetUserDatesRequestTimestampsInner) HasFixday() bool`

HasFixday returns a boolean if a field has been set.

### GetFixhour

`func (o *CoreGetUserDatesRequestTimestampsInner) GetFixhour() int32`

GetFixhour returns the Fixhour field if non-nil, zero value otherwise.

### GetFixhourOk

`func (o *CoreGetUserDatesRequestTimestampsInner) GetFixhourOk() (*int32, bool)`

GetFixhourOk returns a tuple with the Fixhour field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFixhour

`func (o *CoreGetUserDatesRequestTimestampsInner) SetFixhour(v int32)`

SetFixhour sets Fixhour field to given value.

### HasFixhour

`func (o *CoreGetUserDatesRequestTimestampsInner) HasFixhour() bool`

HasFixhour returns a boolean if a field has been set.

### GetFormat

`func (o *CoreGetUserDatesRequestTimestampsInner) GetFormat() string`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreGetUserDatesRequestTimestampsInner) GetFormatOk() (*string, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreGetUserDatesRequestTimestampsInner) SetFormat(v string)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreGetUserDatesRequestTimestampsInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetTimestamp

`func (o *CoreGetUserDatesRequestTimestampsInner) GetTimestamp() int32`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *CoreGetUserDatesRequestTimestampsInner) GetTimestampOk() (*int32, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *CoreGetUserDatesRequestTimestampsInner) SetTimestamp(v int32)`

SetTimestamp sets Timestamp field to given value.

### HasTimestamp

`func (o *CoreGetUserDatesRequestTimestampsInner) HasTimestamp() bool`

HasTimestamp returns a boolean if a field has been set.

### GetType

`func (o *CoreGetUserDatesRequestTimestampsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreGetUserDatesRequestTimestampsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreGetUserDatesRequestTimestampsInner) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *CoreGetUserDatesRequestTimestampsInner) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


