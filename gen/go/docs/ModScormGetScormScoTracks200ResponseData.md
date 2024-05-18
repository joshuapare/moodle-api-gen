# ModScormGetScormScoTracks200ResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attempt** | **int32** | Attempt number | 
**Tracks** | [**[]ModScormGetScormScoTracks200ResponseDataTracksInner**](ModScormGetScormScoTracks200ResponseDataTracksInner.md) |  | 

## Methods

### NewModScormGetScormScoTracks200ResponseData

`func NewModScormGetScormScoTracks200ResponseData(attempt int32, tracks []ModScormGetScormScoTracks200ResponseDataTracksInner, ) *ModScormGetScormScoTracks200ResponseData`

NewModScormGetScormScoTracks200ResponseData instantiates a new ModScormGetScormScoTracks200ResponseData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormScoTracks200ResponseDataWithDefaults

`func NewModScormGetScormScoTracks200ResponseDataWithDefaults() *ModScormGetScormScoTracks200ResponseData`

NewModScormGetScormScoTracks200ResponseDataWithDefaults instantiates a new ModScormGetScormScoTracks200ResponseData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttempt

`func (o *ModScormGetScormScoTracks200ResponseData) GetAttempt() int32`

GetAttempt returns the Attempt field if non-nil, zero value otherwise.

### GetAttemptOk

`func (o *ModScormGetScormScoTracks200ResponseData) GetAttemptOk() (*int32, bool)`

GetAttemptOk returns a tuple with the Attempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempt

`func (o *ModScormGetScormScoTracks200ResponseData) SetAttempt(v int32)`

SetAttempt sets Attempt field to given value.


### GetTracks

`func (o *ModScormGetScormScoTracks200ResponseData) GetTracks() []ModScormGetScormScoTracks200ResponseDataTracksInner`

GetTracks returns the Tracks field if non-nil, zero value otherwise.

### GetTracksOk

`func (o *ModScormGetScormScoTracks200ResponseData) GetTracksOk() (*[]ModScormGetScormScoTracks200ResponseDataTracksInner, bool)`

GetTracksOk returns a tuple with the Tracks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTracks

`func (o *ModScormGetScormScoTracks200ResponseData) SetTracks(v []ModScormGetScormScoTracks200ResponseDataTracksInner)`

SetTracks sets Tracks field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


