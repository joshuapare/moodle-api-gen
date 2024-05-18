# CoreMessageMarkAllNotificationsAsReadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Timecreatedto** | Pointer to **int32** | mark messages created before this time as read, 0 for all messages | [optional] [default to 0]
**Useridfrom** | Pointer to **int32** | the user id who send the message, 0 for any user. -10 or -20 for no-reply or support user | [optional] [default to 0]
**Useridto** | **int32** | the user id who received the message, 0 for any user | 

## Methods

### NewCoreMessageMarkAllNotificationsAsReadRequest

`func NewCoreMessageMarkAllNotificationsAsReadRequest(useridto int32, ) *CoreMessageMarkAllNotificationsAsReadRequest`

NewCoreMessageMarkAllNotificationsAsReadRequest instantiates a new CoreMessageMarkAllNotificationsAsReadRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageMarkAllNotificationsAsReadRequestWithDefaults

`func NewCoreMessageMarkAllNotificationsAsReadRequestWithDefaults() *CoreMessageMarkAllNotificationsAsReadRequest`

NewCoreMessageMarkAllNotificationsAsReadRequestWithDefaults instantiates a new CoreMessageMarkAllNotificationsAsReadRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTimecreatedto

`func (o *CoreMessageMarkAllNotificationsAsReadRequest) GetTimecreatedto() int32`

GetTimecreatedto returns the Timecreatedto field if non-nil, zero value otherwise.

### GetTimecreatedtoOk

`func (o *CoreMessageMarkAllNotificationsAsReadRequest) GetTimecreatedtoOk() (*int32, bool)`

GetTimecreatedtoOk returns a tuple with the Timecreatedto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreatedto

`func (o *CoreMessageMarkAllNotificationsAsReadRequest) SetTimecreatedto(v int32)`

SetTimecreatedto sets Timecreatedto field to given value.

### HasTimecreatedto

`func (o *CoreMessageMarkAllNotificationsAsReadRequest) HasTimecreatedto() bool`

HasTimecreatedto returns a boolean if a field has been set.

### GetUseridfrom

`func (o *CoreMessageMarkAllNotificationsAsReadRequest) GetUseridfrom() int32`

GetUseridfrom returns the Useridfrom field if non-nil, zero value otherwise.

### GetUseridfromOk

`func (o *CoreMessageMarkAllNotificationsAsReadRequest) GetUseridfromOk() (*int32, bool)`

GetUseridfromOk returns a tuple with the Useridfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseridfrom

`func (o *CoreMessageMarkAllNotificationsAsReadRequest) SetUseridfrom(v int32)`

SetUseridfrom sets Useridfrom field to given value.

### HasUseridfrom

`func (o *CoreMessageMarkAllNotificationsAsReadRequest) HasUseridfrom() bool`

HasUseridfrom returns a boolean if a field has been set.

### GetUseridto

`func (o *CoreMessageMarkAllNotificationsAsReadRequest) GetUseridto() int32`

GetUseridto returns the Useridto field if non-nil, zero value otherwise.

### GetUseridtoOk

`func (o *CoreMessageMarkAllNotificationsAsReadRequest) GetUseridtoOk() (*int32, bool)`

GetUseridtoOk returns a tuple with the Useridto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseridto

`func (o *CoreMessageMarkAllNotificationsAsReadRequest) SetUseridto(v int32)`

SetUseridto sets Useridto field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


