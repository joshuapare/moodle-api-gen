# ModQuizGetAttemptAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Endtime** | Pointer to **int32** | When the attempt must be submitted (determined by rules). | [optional] [default to null]
**Isfinished** | **bool** | Whether there is no way the user will ever be allowed to attempt. | [default to null]
**Ispreflightcheckrequired** | Pointer to **bool** | whether a check is required before the user                                                                     starts/continues his attempt. | [optional] [default to null]
**Preventnewattemptreasons** | **[]map[string]interface{}** |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModQuizGetAttemptAccessInformation200Response

`func NewModQuizGetAttemptAccessInformation200Response(isfinished bool, preventnewattemptreasons []map[string]interface{}, ) *ModQuizGetAttemptAccessInformation200Response`

NewModQuizGetAttemptAccessInformation200Response instantiates a new ModQuizGetAttemptAccessInformation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetAttemptAccessInformation200ResponseWithDefaults

`func NewModQuizGetAttemptAccessInformation200ResponseWithDefaults() *ModQuizGetAttemptAccessInformation200Response`

NewModQuizGetAttemptAccessInformation200ResponseWithDefaults instantiates a new ModQuizGetAttemptAccessInformation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEndtime

`func (o *ModQuizGetAttemptAccessInformation200Response) GetEndtime() int32`

GetEndtime returns the Endtime field if non-nil, zero value otherwise.

### GetEndtimeOk

`func (o *ModQuizGetAttemptAccessInformation200Response) GetEndtimeOk() (*int32, bool)`

GetEndtimeOk returns a tuple with the Endtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndtime

`func (o *ModQuizGetAttemptAccessInformation200Response) SetEndtime(v int32)`

SetEndtime sets Endtime field to given value.

### HasEndtime

`func (o *ModQuizGetAttemptAccessInformation200Response) HasEndtime() bool`

HasEndtime returns a boolean if a field has been set.

### GetIsfinished

`func (o *ModQuizGetAttemptAccessInformation200Response) GetIsfinished() bool`

GetIsfinished returns the Isfinished field if non-nil, zero value otherwise.

### GetIsfinishedOk

`func (o *ModQuizGetAttemptAccessInformation200Response) GetIsfinishedOk() (*bool, bool)`

GetIsfinishedOk returns a tuple with the Isfinished field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsfinished

`func (o *ModQuizGetAttemptAccessInformation200Response) SetIsfinished(v bool)`

SetIsfinished sets Isfinished field to given value.


### GetIspreflightcheckrequired

`func (o *ModQuizGetAttemptAccessInformation200Response) GetIspreflightcheckrequired() bool`

GetIspreflightcheckrequired returns the Ispreflightcheckrequired field if non-nil, zero value otherwise.

### GetIspreflightcheckrequiredOk

`func (o *ModQuizGetAttemptAccessInformation200Response) GetIspreflightcheckrequiredOk() (*bool, bool)`

GetIspreflightcheckrequiredOk returns a tuple with the Ispreflightcheckrequired field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIspreflightcheckrequired

`func (o *ModQuizGetAttemptAccessInformation200Response) SetIspreflightcheckrequired(v bool)`

SetIspreflightcheckrequired sets Ispreflightcheckrequired field to given value.

### HasIspreflightcheckrequired

`func (o *ModQuizGetAttemptAccessInformation200Response) HasIspreflightcheckrequired() bool`

HasIspreflightcheckrequired returns a boolean if a field has been set.

### GetPreventnewattemptreasons

`func (o *ModQuizGetAttemptAccessInformation200Response) GetPreventnewattemptreasons() []map[string]interface{}`

GetPreventnewattemptreasons returns the Preventnewattemptreasons field if non-nil, zero value otherwise.

### GetPreventnewattemptreasonsOk

`func (o *ModQuizGetAttemptAccessInformation200Response) GetPreventnewattemptreasonsOk() (*[]map[string]interface{}, bool)`

GetPreventnewattemptreasonsOk returns a tuple with the Preventnewattemptreasons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreventnewattemptreasons

`func (o *ModQuizGetAttemptAccessInformation200Response) SetPreventnewattemptreasons(v []map[string]interface{})`

SetPreventnewattemptreasons sets Preventnewattemptreasons field to given value.


### GetWarnings

`func (o *ModQuizGetAttemptAccessInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModQuizGetAttemptAccessInformation200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModQuizGetAttemptAccessInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModQuizGetAttemptAccessInformation200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


