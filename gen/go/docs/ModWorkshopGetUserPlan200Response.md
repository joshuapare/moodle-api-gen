# ModWorkshopGetUserPlan200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Userplan** | [**ModWorkshopGetUserPlan200ResponseUserplan**](ModWorkshopGetUserPlan200ResponseUserplan.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWorkshopGetUserPlan200Response

`func NewModWorkshopGetUserPlan200Response(userplan ModWorkshopGetUserPlan200ResponseUserplan, ) *ModWorkshopGetUserPlan200Response`

NewModWorkshopGetUserPlan200Response instantiates a new ModWorkshopGetUserPlan200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetUserPlan200ResponseWithDefaults

`func NewModWorkshopGetUserPlan200ResponseWithDefaults() *ModWorkshopGetUserPlan200Response`

NewModWorkshopGetUserPlan200ResponseWithDefaults instantiates a new ModWorkshopGetUserPlan200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserplan

`func (o *ModWorkshopGetUserPlan200Response) GetUserplan() ModWorkshopGetUserPlan200ResponseUserplan`

GetUserplan returns the Userplan field if non-nil, zero value otherwise.

### GetUserplanOk

`func (o *ModWorkshopGetUserPlan200Response) GetUserplanOk() (*ModWorkshopGetUserPlan200ResponseUserplan, bool)`

GetUserplanOk returns a tuple with the Userplan field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserplan

`func (o *ModWorkshopGetUserPlan200Response) SetUserplan(v ModWorkshopGetUserPlan200ResponseUserplan)`

SetUserplan sets Userplan field to given value.


### GetWarnings

`func (o *ModWorkshopGetUserPlan200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWorkshopGetUserPlan200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWorkshopGetUserPlan200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWorkshopGetUserPlan200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


