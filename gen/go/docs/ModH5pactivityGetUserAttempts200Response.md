# ModH5pactivityGetUserAttempts200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Activityid** | **int32** | Activity course module ID | 
**Usersattempts** | [**[]ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner**](ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModH5pactivityGetUserAttempts200Response

`func NewModH5pactivityGetUserAttempts200Response(activityid int32, usersattempts []ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner, ) *ModH5pactivityGetUserAttempts200Response`

NewModH5pactivityGetUserAttempts200Response instantiates a new ModH5pactivityGetUserAttempts200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModH5pactivityGetUserAttempts200ResponseWithDefaults

`func NewModH5pactivityGetUserAttempts200ResponseWithDefaults() *ModH5pactivityGetUserAttempts200Response`

NewModH5pactivityGetUserAttempts200ResponseWithDefaults instantiates a new ModH5pactivityGetUserAttempts200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivityid

`func (o *ModH5pactivityGetUserAttempts200Response) GetActivityid() int32`

GetActivityid returns the Activityid field if non-nil, zero value otherwise.

### GetActivityidOk

`func (o *ModH5pactivityGetUserAttempts200Response) GetActivityidOk() (*int32, bool)`

GetActivityidOk returns a tuple with the Activityid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityid

`func (o *ModH5pactivityGetUserAttempts200Response) SetActivityid(v int32)`

SetActivityid sets Activityid field to given value.


### GetUsersattempts

`func (o *ModH5pactivityGetUserAttempts200Response) GetUsersattempts() []ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner`

GetUsersattempts returns the Usersattempts field if non-nil, zero value otherwise.

### GetUsersattemptsOk

`func (o *ModH5pactivityGetUserAttempts200Response) GetUsersattemptsOk() (*[]ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner, bool)`

GetUsersattemptsOk returns a tuple with the Usersattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsersattempts

`func (o *ModH5pactivityGetUserAttempts200Response) SetUsersattempts(v []ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner)`

SetUsersattempts sets Usersattempts field to given value.


### GetWarnings

`func (o *ModH5pactivityGetUserAttempts200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModH5pactivityGetUserAttempts200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModH5pactivityGetUserAttempts200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModH5pactivityGetUserAttempts200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


