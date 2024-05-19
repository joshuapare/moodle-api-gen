# ModWorkshopGetSubmissionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groupid** | Pointer to **int32** | Group id, 0 means that the function will determine the user group.                                                    It will return submissions done by users in the given group. | [optional] [default to 0]
**Page** | Pointer to **int32** | The page of records to return. | [optional] [default to 0]
**Perpage** | Pointer to **int32** | The number of records to return per page. | [optional] [default to 0]
**Userid** | Pointer to **int32** | Get submissions done by this user. Use 0 or empty for the current user | [optional] [default to 0]
**Workshopid** | **int32** | Workshop instance id. | 

## Methods

### NewModWorkshopGetSubmissionsRequest

`func NewModWorkshopGetSubmissionsRequest(workshopid int32, ) *ModWorkshopGetSubmissionsRequest`

NewModWorkshopGetSubmissionsRequest instantiates a new ModWorkshopGetSubmissionsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetSubmissionsRequestWithDefaults

`func NewModWorkshopGetSubmissionsRequestWithDefaults() *ModWorkshopGetSubmissionsRequest`

NewModWorkshopGetSubmissionsRequestWithDefaults instantiates a new ModWorkshopGetSubmissionsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroupid

`func (o *ModWorkshopGetSubmissionsRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModWorkshopGetSubmissionsRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModWorkshopGetSubmissionsRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModWorkshopGetSubmissionsRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetPage

`func (o *ModWorkshopGetSubmissionsRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModWorkshopGetSubmissionsRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModWorkshopGetSubmissionsRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModWorkshopGetSubmissionsRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *ModWorkshopGetSubmissionsRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *ModWorkshopGetSubmissionsRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *ModWorkshopGetSubmissionsRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *ModWorkshopGetSubmissionsRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetUserid

`func (o *ModWorkshopGetSubmissionsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModWorkshopGetSubmissionsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModWorkshopGetSubmissionsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModWorkshopGetSubmissionsRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetWorkshopid

`func (o *ModWorkshopGetSubmissionsRequest) GetWorkshopid() int32`

GetWorkshopid returns the Workshopid field if non-nil, zero value otherwise.

### GetWorkshopidOk

`func (o *ModWorkshopGetSubmissionsRequest) GetWorkshopidOk() (*int32, bool)`

GetWorkshopidOk returns a tuple with the Workshopid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkshopid

`func (o *ModWorkshopGetSubmissionsRequest) SetWorkshopid(v int32)`

SetWorkshopid sets Workshopid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


