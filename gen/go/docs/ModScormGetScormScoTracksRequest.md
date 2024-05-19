# ModScormGetScormScoTracksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attempt** | Pointer to **int32** | attempt number (0 for last attempt) | [optional] [default to 0]
**Scoid** | **int32** | sco id | [default to null]
**Userid** | **int32** | user id | 

## Methods

### NewModScormGetScormScoTracksRequest

`func NewModScormGetScormScoTracksRequest(scoid int32, userid int32, ) *ModScormGetScormScoTracksRequest`

NewModScormGetScormScoTracksRequest instantiates a new ModScormGetScormScoTracksRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormScoTracksRequestWithDefaults

`func NewModScormGetScormScoTracksRequestWithDefaults() *ModScormGetScormScoTracksRequest`

NewModScormGetScormScoTracksRequestWithDefaults instantiates a new ModScormGetScormScoTracksRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttempt

`func (o *ModScormGetScormScoTracksRequest) GetAttempt() int32`

GetAttempt returns the Attempt field if non-nil, zero value otherwise.

### GetAttemptOk

`func (o *ModScormGetScormScoTracksRequest) GetAttemptOk() (*int32, bool)`

GetAttemptOk returns a tuple with the Attempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempt

`func (o *ModScormGetScormScoTracksRequest) SetAttempt(v int32)`

SetAttempt sets Attempt field to given value.

### HasAttempt

`func (o *ModScormGetScormScoTracksRequest) HasAttempt() bool`

HasAttempt returns a boolean if a field has been set.

### GetScoid

`func (o *ModScormGetScormScoTracksRequest) GetScoid() int32`

GetScoid returns the Scoid field if non-nil, zero value otherwise.

### GetScoidOk

`func (o *ModScormGetScormScoTracksRequest) GetScoidOk() (*int32, bool)`

GetScoidOk returns a tuple with the Scoid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScoid

`func (o *ModScormGetScormScoTracksRequest) SetScoid(v int32)`

SetScoid sets Scoid field to given value.


### GetUserid

`func (o *ModScormGetScormScoTracksRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModScormGetScormScoTracksRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModScormGetScormScoTracksRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


