# MessageAirnotifierAreNotificationPreferencesConfigured200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Users** | [**[]MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner**](MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewMessageAirnotifierAreNotificationPreferencesConfigured200Response

`func NewMessageAirnotifierAreNotificationPreferencesConfigured200Response(users []MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner, ) *MessageAirnotifierAreNotificationPreferencesConfigured200Response`

NewMessageAirnotifierAreNotificationPreferencesConfigured200Response instantiates a new MessageAirnotifierAreNotificationPreferencesConfigured200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAirnotifierAreNotificationPreferencesConfigured200ResponseWithDefaults

`func NewMessageAirnotifierAreNotificationPreferencesConfigured200ResponseWithDefaults() *MessageAirnotifierAreNotificationPreferencesConfigured200Response`

NewMessageAirnotifierAreNotificationPreferencesConfigured200ResponseWithDefaults instantiates a new MessageAirnotifierAreNotificationPreferencesConfigured200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsers

`func (o *MessageAirnotifierAreNotificationPreferencesConfigured200Response) GetUsers() []MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner`

GetUsers returns the Users field if non-nil, zero value otherwise.

### GetUsersOk

`func (o *MessageAirnotifierAreNotificationPreferencesConfigured200Response) GetUsersOk() (*[]MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner, bool)`

GetUsersOk returns a tuple with the Users field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsers

`func (o *MessageAirnotifierAreNotificationPreferencesConfigured200Response) SetUsers(v []MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner)`

SetUsers sets Users field to given value.


### GetWarnings

`func (o *MessageAirnotifierAreNotificationPreferencesConfigured200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *MessageAirnotifierAreNotificationPreferencesConfigured200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *MessageAirnotifierAreNotificationPreferencesConfigured200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *MessageAirnotifierAreNotificationPreferencesConfigured200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


