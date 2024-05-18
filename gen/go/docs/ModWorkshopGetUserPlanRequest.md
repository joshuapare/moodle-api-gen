# ModWorkshopGetUserPlanRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Userid** | Pointer to **int32** | User id (empty or 0 for current user). | [optional] [default to 0]
**Workshopid** | **int32** | Workshop instance id. | 

## Methods

### NewModWorkshopGetUserPlanRequest

`func NewModWorkshopGetUserPlanRequest(workshopid int32, ) *ModWorkshopGetUserPlanRequest`

NewModWorkshopGetUserPlanRequest instantiates a new ModWorkshopGetUserPlanRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetUserPlanRequestWithDefaults

`func NewModWorkshopGetUserPlanRequestWithDefaults() *ModWorkshopGetUserPlanRequest`

NewModWorkshopGetUserPlanRequestWithDefaults instantiates a new ModWorkshopGetUserPlanRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserid

`func (o *ModWorkshopGetUserPlanRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModWorkshopGetUserPlanRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModWorkshopGetUserPlanRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModWorkshopGetUserPlanRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetWorkshopid

`func (o *ModWorkshopGetUserPlanRequest) GetWorkshopid() int32`

GetWorkshopid returns the Workshopid field if non-nil, zero value otherwise.

### GetWorkshopidOk

`func (o *ModWorkshopGetUserPlanRequest) GetWorkshopidOk() (*int32, bool)`

GetWorkshopidOk returns a tuple with the Workshopid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkshopid

`func (o *ModWorkshopGetUserPlanRequest) SetWorkshopid(v int32)`

SetWorkshopid sets Workshopid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


