# ModScormGetScormAttemptCount200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptscount** | **int32** | Attempts count | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModScormGetScormAttemptCount200Response

`func NewModScormGetScormAttemptCount200Response(attemptscount int32, ) *ModScormGetScormAttemptCount200Response`

NewModScormGetScormAttemptCount200Response instantiates a new ModScormGetScormAttemptCount200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormAttemptCount200ResponseWithDefaults

`func NewModScormGetScormAttemptCount200ResponseWithDefaults() *ModScormGetScormAttemptCount200Response`

NewModScormGetScormAttemptCount200ResponseWithDefaults instantiates a new ModScormGetScormAttemptCount200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptscount

`func (o *ModScormGetScormAttemptCount200Response) GetAttemptscount() int32`

GetAttemptscount returns the Attemptscount field if non-nil, zero value otherwise.

### GetAttemptscountOk

`func (o *ModScormGetScormAttemptCount200Response) GetAttemptscountOk() (*int32, bool)`

GetAttemptscountOk returns a tuple with the Attemptscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptscount

`func (o *ModScormGetScormAttemptCount200Response) SetAttemptscount(v int32)`

SetAttemptscount sets Attemptscount field to given value.


### GetWarnings

`func (o *ModScormGetScormAttemptCount200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModScormGetScormAttemptCount200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModScormGetScormAttemptCount200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModScormGetScormAttemptCount200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


