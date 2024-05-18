# CoreSessionTimeRemaining200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Timeremaining** | **int32** | The number of seconds remaining in this session. | [default to null]
**Userid** | **int32** | The current user id. | [default to null]

## Methods

### NewCoreSessionTimeRemaining200Response

`func NewCoreSessionTimeRemaining200Response(timeremaining int32, userid int32, ) *CoreSessionTimeRemaining200Response`

NewCoreSessionTimeRemaining200Response instantiates a new CoreSessionTimeRemaining200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSessionTimeRemaining200ResponseWithDefaults

`func NewCoreSessionTimeRemaining200ResponseWithDefaults() *CoreSessionTimeRemaining200Response`

NewCoreSessionTimeRemaining200ResponseWithDefaults instantiates a new CoreSessionTimeRemaining200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTimeremaining

`func (o *CoreSessionTimeRemaining200Response) GetTimeremaining() int32`

GetTimeremaining returns the Timeremaining field if non-nil, zero value otherwise.

### GetTimeremainingOk

`func (o *CoreSessionTimeRemaining200Response) GetTimeremainingOk() (*int32, bool)`

GetTimeremainingOk returns a tuple with the Timeremaining field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeremaining

`func (o *CoreSessionTimeRemaining200Response) SetTimeremaining(v int32)`

SetTimeremaining sets Timeremaining field to given value.


### GetUserid

`func (o *CoreSessionTimeRemaining200Response) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreSessionTimeRemaining200Response) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreSessionTimeRemaining200Response) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


