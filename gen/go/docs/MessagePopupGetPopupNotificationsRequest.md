# MessagePopupGetPopupNotificationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Limit** | Pointer to **int32** | the number of results to return | [optional] [default to 0]
**Newestfirst** | Pointer to **bool** | true for ordering by newest first, false for oldest first | [optional] [default to true]
**Offset** | Pointer to **int32** | offset the result set by a given amount | [optional] [default to 0]
**Useridto** | **int32** | the user id who received the message, 0 for current user | [default to null]

## Methods

### NewMessagePopupGetPopupNotificationsRequest

`func NewMessagePopupGetPopupNotificationsRequest(useridto int32, ) *MessagePopupGetPopupNotificationsRequest`

NewMessagePopupGetPopupNotificationsRequest instantiates a new MessagePopupGetPopupNotificationsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessagePopupGetPopupNotificationsRequestWithDefaults

`func NewMessagePopupGetPopupNotificationsRequestWithDefaults() *MessagePopupGetPopupNotificationsRequest`

NewMessagePopupGetPopupNotificationsRequestWithDefaults instantiates a new MessagePopupGetPopupNotificationsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLimit

`func (o *MessagePopupGetPopupNotificationsRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *MessagePopupGetPopupNotificationsRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *MessagePopupGetPopupNotificationsRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *MessagePopupGetPopupNotificationsRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetNewestfirst

`func (o *MessagePopupGetPopupNotificationsRequest) GetNewestfirst() bool`

GetNewestfirst returns the Newestfirst field if non-nil, zero value otherwise.

### GetNewestfirstOk

`func (o *MessagePopupGetPopupNotificationsRequest) GetNewestfirstOk() (*bool, bool)`

GetNewestfirstOk returns a tuple with the Newestfirst field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewestfirst

`func (o *MessagePopupGetPopupNotificationsRequest) SetNewestfirst(v bool)`

SetNewestfirst sets Newestfirst field to given value.

### HasNewestfirst

`func (o *MessagePopupGetPopupNotificationsRequest) HasNewestfirst() bool`

HasNewestfirst returns a boolean if a field has been set.

### GetOffset

`func (o *MessagePopupGetPopupNotificationsRequest) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *MessagePopupGetPopupNotificationsRequest) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *MessagePopupGetPopupNotificationsRequest) SetOffset(v int32)`

SetOffset sets Offset field to given value.

### HasOffset

`func (o *MessagePopupGetPopupNotificationsRequest) HasOffset() bool`

HasOffset returns a boolean if a field has been set.

### GetUseridto

`func (o *MessagePopupGetPopupNotificationsRequest) GetUseridto() int32`

GetUseridto returns the Useridto field if non-nil, zero value otherwise.

### GetUseridtoOk

`func (o *MessagePopupGetPopupNotificationsRequest) GetUseridtoOk() (*int32, bool)`

GetUseridtoOk returns a tuple with the Useridto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseridto

`func (o *MessagePopupGetPopupNotificationsRequest) SetUseridto(v int32)`

SetUseridto sets Useridto field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


