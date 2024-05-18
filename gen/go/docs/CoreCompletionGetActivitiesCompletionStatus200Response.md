# CoreCompletionGetActivitiesCompletionStatus200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Statuses** | [**[]CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner**](CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCompletionGetActivitiesCompletionStatus200Response

`func NewCoreCompletionGetActivitiesCompletionStatus200Response(statuses []CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner, ) *CoreCompletionGetActivitiesCompletionStatus200Response`

NewCoreCompletionGetActivitiesCompletionStatus200Response instantiates a new CoreCompletionGetActivitiesCompletionStatus200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompletionGetActivitiesCompletionStatus200ResponseWithDefaults

`func NewCoreCompletionGetActivitiesCompletionStatus200ResponseWithDefaults() *CoreCompletionGetActivitiesCompletionStatus200Response`

NewCoreCompletionGetActivitiesCompletionStatus200ResponseWithDefaults instantiates a new CoreCompletionGetActivitiesCompletionStatus200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatuses

`func (o *CoreCompletionGetActivitiesCompletionStatus200Response) GetStatuses() []CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner`

GetStatuses returns the Statuses field if non-nil, zero value otherwise.

### GetStatusesOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200Response) GetStatusesOk() (*[]CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner, bool)`

GetStatusesOk returns a tuple with the Statuses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatuses

`func (o *CoreCompletionGetActivitiesCompletionStatus200Response) SetStatuses(v []CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner)`

SetStatuses sets Statuses field to given value.


### GetWarnings

`func (o *CoreCompletionGetActivitiesCompletionStatus200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCompletionGetActivitiesCompletionStatus200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCompletionGetActivitiesCompletionStatus200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


