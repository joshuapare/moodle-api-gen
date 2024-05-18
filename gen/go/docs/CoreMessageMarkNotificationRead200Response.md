# CoreMessageMarkNotificationRead200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Notificationid** | **int32** | id of the notification | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreMessageMarkNotificationRead200Response

`func NewCoreMessageMarkNotificationRead200Response(notificationid int32, ) *CoreMessageMarkNotificationRead200Response`

NewCoreMessageMarkNotificationRead200Response instantiates a new CoreMessageMarkNotificationRead200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageMarkNotificationRead200ResponseWithDefaults

`func NewCoreMessageMarkNotificationRead200ResponseWithDefaults() *CoreMessageMarkNotificationRead200Response`

NewCoreMessageMarkNotificationRead200ResponseWithDefaults instantiates a new CoreMessageMarkNotificationRead200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNotificationid

`func (o *CoreMessageMarkNotificationRead200Response) GetNotificationid() int32`

GetNotificationid returns the Notificationid field if non-nil, zero value otherwise.

### GetNotificationidOk

`func (o *CoreMessageMarkNotificationRead200Response) GetNotificationidOk() (*int32, bool)`

GetNotificationidOk returns a tuple with the Notificationid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotificationid

`func (o *CoreMessageMarkNotificationRead200Response) SetNotificationid(v int32)`

SetNotificationid sets Notificationid field to given value.


### GetWarnings

`func (o *CoreMessageMarkNotificationRead200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreMessageMarkNotificationRead200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreMessageMarkNotificationRead200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreMessageMarkNotificationRead200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


