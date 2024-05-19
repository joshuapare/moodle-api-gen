# MessagePopupGetPopupNotifications200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Notifications** | [**[]MessagePopupGetPopupNotifications200ResponseNotificationsInner**](MessagePopupGetPopupNotifications200ResponseNotificationsInner.md) |  | 
**Unreadcount** | **int32** | the number of unread message for the given user | [default to null]

## Methods

### NewMessagePopupGetPopupNotifications200Response

`func NewMessagePopupGetPopupNotifications200Response(notifications []MessagePopupGetPopupNotifications200ResponseNotificationsInner, unreadcount int32, ) *MessagePopupGetPopupNotifications200Response`

NewMessagePopupGetPopupNotifications200Response instantiates a new MessagePopupGetPopupNotifications200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessagePopupGetPopupNotifications200ResponseWithDefaults

`func NewMessagePopupGetPopupNotifications200ResponseWithDefaults() *MessagePopupGetPopupNotifications200Response`

NewMessagePopupGetPopupNotifications200ResponseWithDefaults instantiates a new MessagePopupGetPopupNotifications200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNotifications

`func (o *MessagePopupGetPopupNotifications200Response) GetNotifications() []MessagePopupGetPopupNotifications200ResponseNotificationsInner`

GetNotifications returns the Notifications field if non-nil, zero value otherwise.

### GetNotificationsOk

`func (o *MessagePopupGetPopupNotifications200Response) GetNotificationsOk() (*[]MessagePopupGetPopupNotifications200ResponseNotificationsInner, bool)`

GetNotificationsOk returns a tuple with the Notifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotifications

`func (o *MessagePopupGetPopupNotifications200Response) SetNotifications(v []MessagePopupGetPopupNotifications200ResponseNotificationsInner)`

SetNotifications sets Notifications field to given value.


### GetUnreadcount

`func (o *MessagePopupGetPopupNotifications200Response) GetUnreadcount() int32`

GetUnreadcount returns the Unreadcount field if non-nil, zero value otherwise.

### GetUnreadcountOk

`func (o *MessagePopupGetPopupNotifications200Response) GetUnreadcountOk() (*int32, bool)`

GetUnreadcountOk returns a tuple with the Unreadcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadcount

`func (o *MessagePopupGetPopupNotifications200Response) SetUnreadcount(v int32)`

SetUnreadcount sets Unreadcount field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


