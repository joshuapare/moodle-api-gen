# ModScormInsertScormTracksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attempt** | **int32** | attempt number | 
**Scoid** | **int32** | SCO id | [default to null]
**Tracks** | [**[]ModScormGetScormUserData200ResponseDataInnerDefaultdataInner**](ModScormGetScormUserData200ResponseDataInnerDefaultdataInner.md) |  | 

## Methods

### NewModScormInsertScormTracksRequest

`func NewModScormInsertScormTracksRequest(attempt int32, scoid int32, tracks []ModScormGetScormUserData200ResponseDataInnerDefaultdataInner, ) *ModScormInsertScormTracksRequest`

NewModScormInsertScormTracksRequest instantiates a new ModScormInsertScormTracksRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormInsertScormTracksRequestWithDefaults

`func NewModScormInsertScormTracksRequestWithDefaults() *ModScormInsertScormTracksRequest`

NewModScormInsertScormTracksRequestWithDefaults instantiates a new ModScormInsertScormTracksRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttempt

`func (o *ModScormInsertScormTracksRequest) GetAttempt() int32`

GetAttempt returns the Attempt field if non-nil, zero value otherwise.

### GetAttemptOk

`func (o *ModScormInsertScormTracksRequest) GetAttemptOk() (*int32, bool)`

GetAttemptOk returns a tuple with the Attempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempt

`func (o *ModScormInsertScormTracksRequest) SetAttempt(v int32)`

SetAttempt sets Attempt field to given value.


### GetScoid

`func (o *ModScormInsertScormTracksRequest) GetScoid() int32`

GetScoid returns the Scoid field if non-nil, zero value otherwise.

### GetScoidOk

`func (o *ModScormInsertScormTracksRequest) GetScoidOk() (*int32, bool)`

GetScoidOk returns a tuple with the Scoid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScoid

`func (o *ModScormInsertScormTracksRequest) SetScoid(v int32)`

SetScoid sets Scoid field to given value.


### GetTracks

`func (o *ModScormInsertScormTracksRequest) GetTracks() []ModScormGetScormUserData200ResponseDataInnerDefaultdataInner`

GetTracks returns the Tracks field if non-nil, zero value otherwise.

### GetTracksOk

`func (o *ModScormInsertScormTracksRequest) GetTracksOk() (*[]ModScormGetScormUserData200ResponseDataInnerDefaultdataInner, bool)`

GetTracksOk returns a tuple with the Tracks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTracks

`func (o *ModScormInsertScormTracksRequest) SetTracks(v []ModScormGetScormUserData200ResponseDataInnerDefaultdataInner)`

SetTracks sets Tracks field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


