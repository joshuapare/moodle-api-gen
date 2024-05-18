# CoreMessageMarkNotificationReadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Notificationid** | **int32** | id of the notification | [default to null]
**Timeread** | Pointer to **int32** | timestamp for when the notification should be marked read | [optional] [default to 0]

## Methods

### NewCoreMessageMarkNotificationReadRequest

`func NewCoreMessageMarkNotificationReadRequest(notificationid int32, ) *CoreMessageMarkNotificationReadRequest`

NewCoreMessageMarkNotificationReadRequest instantiates a new CoreMessageMarkNotificationReadRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageMarkNotificationReadRequestWithDefaults

`func NewCoreMessageMarkNotificationReadRequestWithDefaults() *CoreMessageMarkNotificationReadRequest`

NewCoreMessageMarkNotificationReadRequestWithDefaults instantiates a new CoreMessageMarkNotificationReadRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNotificationid

`func (o *CoreMessageMarkNotificationReadRequest) GetNotificationid() int32`

GetNotificationid returns the Notificationid field if non-nil, zero value otherwise.

### GetNotificationidOk

`func (o *CoreMessageMarkNotificationReadRequest) GetNotificationidOk() (*int32, bool)`

GetNotificationidOk returns a tuple with the Notificationid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotificationid

`func (o *CoreMessageMarkNotificationReadRequest) SetNotificationid(v int32)`

SetNotificationid sets Notificationid field to given value.


### GetTimeread

`func (o *CoreMessageMarkNotificationReadRequest) GetTimeread() int32`

GetTimeread returns the Timeread field if non-nil, zero value otherwise.

### GetTimereadOk

`func (o *CoreMessageMarkNotificationReadRequest) GetTimereadOk() (*int32, bool)`

GetTimereadOk returns a tuple with the Timeread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeread

`func (o *CoreMessageMarkNotificationReadRequest) SetTimeread(v int32)`

SetTimeread sets Timeread field to given value.

### HasTimeread

`func (o *CoreMessageMarkNotificationReadRequest) HasTimeread() bool`

HasTimeread returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


