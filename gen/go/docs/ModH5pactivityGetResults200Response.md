# ModH5pactivityGetResults200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Activityid** | **int32** | Activity course module ID | 
**Attempts** | [**[]ModH5pactivityGetResults200ResponseAttemptsInner**](ModH5pactivityGetResults200ResponseAttemptsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModH5pactivityGetResults200Response

`func NewModH5pactivityGetResults200Response(activityid int32, attempts []ModH5pactivityGetResults200ResponseAttemptsInner, ) *ModH5pactivityGetResults200Response`

NewModH5pactivityGetResults200Response instantiates a new ModH5pactivityGetResults200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModH5pactivityGetResults200ResponseWithDefaults

`func NewModH5pactivityGetResults200ResponseWithDefaults() *ModH5pactivityGetResults200Response`

NewModH5pactivityGetResults200ResponseWithDefaults instantiates a new ModH5pactivityGetResults200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivityid

`func (o *ModH5pactivityGetResults200Response) GetActivityid() int32`

GetActivityid returns the Activityid field if non-nil, zero value otherwise.

### GetActivityidOk

`func (o *ModH5pactivityGetResults200Response) GetActivityidOk() (*int32, bool)`

GetActivityidOk returns a tuple with the Activityid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityid

`func (o *ModH5pactivityGetResults200Response) SetActivityid(v int32)`

SetActivityid sets Activityid field to given value.


### GetAttempts

`func (o *ModH5pactivityGetResults200Response) GetAttempts() []ModH5pactivityGetResults200ResponseAttemptsInner`

GetAttempts returns the Attempts field if non-nil, zero value otherwise.

### GetAttemptsOk

`func (o *ModH5pactivityGetResults200Response) GetAttemptsOk() (*[]ModH5pactivityGetResults200ResponseAttemptsInner, bool)`

GetAttemptsOk returns a tuple with the Attempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempts

`func (o *ModH5pactivityGetResults200Response) SetAttempts(v []ModH5pactivityGetResults200ResponseAttemptsInner)`

SetAttempts sets Attempts field to given value.


### GetWarnings

`func (o *ModH5pactivityGetResults200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModH5pactivityGetResults200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModH5pactivityGetResults200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModH5pactivityGetResults200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


