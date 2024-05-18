# CoreMessageGetUnreadNotificationCountRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Useridto** | **int32** | user id who received the notification, 0 for any user | [default to null]

## Methods

### NewCoreMessageGetUnreadNotificationCountRequest

`func NewCoreMessageGetUnreadNotificationCountRequest(useridto int32, ) *CoreMessageGetUnreadNotificationCountRequest`

NewCoreMessageGetUnreadNotificationCountRequest instantiates a new CoreMessageGetUnreadNotificationCountRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetUnreadNotificationCountRequestWithDefaults

`func NewCoreMessageGetUnreadNotificationCountRequestWithDefaults() *CoreMessageGetUnreadNotificationCountRequest`

NewCoreMessageGetUnreadNotificationCountRequestWithDefaults instantiates a new CoreMessageGetUnreadNotificationCountRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUseridto

`func (o *CoreMessageGetUnreadNotificationCountRequest) GetUseridto() int32`

GetUseridto returns the Useridto field if non-nil, zero value otherwise.

### GetUseridtoOk

`func (o *CoreMessageGetUnreadNotificationCountRequest) GetUseridtoOk() (*int32, bool)`

GetUseridtoOk returns a tuple with the Useridto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseridto

`func (o *CoreMessageGetUnreadNotificationCountRequest) SetUseridto(v int32)`

SetUseridto sets Useridto field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


