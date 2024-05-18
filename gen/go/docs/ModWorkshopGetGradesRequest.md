# ModWorkshopGetGradesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Userid** | Pointer to **int32** | User id (empty or 0 for current user). | [optional] [default to 0]
**Workshopid** | **int32** | Workshop instance id. | [default to null]

## Methods

### NewModWorkshopGetGradesRequest

`func NewModWorkshopGetGradesRequest(workshopid int32, ) *ModWorkshopGetGradesRequest`

NewModWorkshopGetGradesRequest instantiates a new ModWorkshopGetGradesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetGradesRequestWithDefaults

`func NewModWorkshopGetGradesRequestWithDefaults() *ModWorkshopGetGradesRequest`

NewModWorkshopGetGradesRequestWithDefaults instantiates a new ModWorkshopGetGradesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserid

`func (o *ModWorkshopGetGradesRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModWorkshopGetGradesRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModWorkshopGetGradesRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModWorkshopGetGradesRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetWorkshopid

`func (o *ModWorkshopGetGradesRequest) GetWorkshopid() int32`

GetWorkshopid returns the Workshopid field if non-nil, zero value otherwise.

### GetWorkshopidOk

`func (o *ModWorkshopGetGradesRequest) GetWorkshopidOk() (*int32, bool)`

GetWorkshopidOk returns a tuple with the Workshopid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkshopid

`func (o *ModWorkshopGetGradesRequest) SetWorkshopid(v int32)`

SetWorkshopid sets Workshopid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


