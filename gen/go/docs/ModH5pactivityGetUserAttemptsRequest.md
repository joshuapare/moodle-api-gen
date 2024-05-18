# ModH5pactivityGetUserAttemptsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Firstinitial** | Pointer to **string** | Users whose first name starts with $firstinitial | [optional] [default to ""]
**H5pactivityid** | **int32** | h5p activity instance id | 
**Lastinitial** | Pointer to **string** | Users whose last name starts with $lastinitial | [optional] [default to ""]
**Page** | Pointer to **int32** | current page | [optional] [default to -1]
**Perpage** | Pointer to **int32** | items per page | [optional] [default to 0]
**Sortorder** | Pointer to **string** | sort by either user id, firstname or lastname (with optional asc/desc) | [optional] [default to "id ASC"]

## Methods

### NewModH5pactivityGetUserAttemptsRequest

`func NewModH5pactivityGetUserAttemptsRequest(h5pactivityid int32, ) *ModH5pactivityGetUserAttemptsRequest`

NewModH5pactivityGetUserAttemptsRequest instantiates a new ModH5pactivityGetUserAttemptsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModH5pactivityGetUserAttemptsRequestWithDefaults

`func NewModH5pactivityGetUserAttemptsRequestWithDefaults() *ModH5pactivityGetUserAttemptsRequest`

NewModH5pactivityGetUserAttemptsRequestWithDefaults instantiates a new ModH5pactivityGetUserAttemptsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFirstinitial

`func (o *ModH5pactivityGetUserAttemptsRequest) GetFirstinitial() string`

GetFirstinitial returns the Firstinitial field if non-nil, zero value otherwise.

### GetFirstinitialOk

`func (o *ModH5pactivityGetUserAttemptsRequest) GetFirstinitialOk() (*string, bool)`

GetFirstinitialOk returns a tuple with the Firstinitial field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstinitial

`func (o *ModH5pactivityGetUserAttemptsRequest) SetFirstinitial(v string)`

SetFirstinitial sets Firstinitial field to given value.

### HasFirstinitial

`func (o *ModH5pactivityGetUserAttemptsRequest) HasFirstinitial() bool`

HasFirstinitial returns a boolean if a field has been set.

### GetH5pactivityid

`func (o *ModH5pactivityGetUserAttemptsRequest) GetH5pactivityid() int32`

GetH5pactivityid returns the H5pactivityid field if non-nil, zero value otherwise.

### GetH5pactivityidOk

`func (o *ModH5pactivityGetUserAttemptsRequest) GetH5pactivityidOk() (*int32, bool)`

GetH5pactivityidOk returns a tuple with the H5pactivityid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetH5pactivityid

`func (o *ModH5pactivityGetUserAttemptsRequest) SetH5pactivityid(v int32)`

SetH5pactivityid sets H5pactivityid field to given value.


### GetLastinitial

`func (o *ModH5pactivityGetUserAttemptsRequest) GetLastinitial() string`

GetLastinitial returns the Lastinitial field if non-nil, zero value otherwise.

### GetLastinitialOk

`func (o *ModH5pactivityGetUserAttemptsRequest) GetLastinitialOk() (*string, bool)`

GetLastinitialOk returns a tuple with the Lastinitial field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastinitial

`func (o *ModH5pactivityGetUserAttemptsRequest) SetLastinitial(v string)`

SetLastinitial sets Lastinitial field to given value.

### HasLastinitial

`func (o *ModH5pactivityGetUserAttemptsRequest) HasLastinitial() bool`

HasLastinitial returns a boolean if a field has been set.

### GetPage

`func (o *ModH5pactivityGetUserAttemptsRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModH5pactivityGetUserAttemptsRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModH5pactivityGetUserAttemptsRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModH5pactivityGetUserAttemptsRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *ModH5pactivityGetUserAttemptsRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *ModH5pactivityGetUserAttemptsRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *ModH5pactivityGetUserAttemptsRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *ModH5pactivityGetUserAttemptsRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetSortorder

`func (o *ModH5pactivityGetUserAttemptsRequest) GetSortorder() string`

GetSortorder returns the Sortorder field if non-nil, zero value otherwise.

### GetSortorderOk

`func (o *ModH5pactivityGetUserAttemptsRequest) GetSortorderOk() (*string, bool)`

GetSortorderOk returns a tuple with the Sortorder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortorder

`func (o *ModH5pactivityGetUserAttemptsRequest) SetSortorder(v string)`

SetSortorder sets Sortorder field to given value.

### HasSortorder

`func (o *ModH5pactivityGetUserAttemptsRequest) HasSortorder() bool`

HasSortorder returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


