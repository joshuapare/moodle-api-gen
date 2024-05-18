# ModDataGetDataAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canaddentry** | **bool** | Whether the user can add entries or not. | [default to null]
**Canapprove** | **bool** | Whether the user can approve entries or not. | [default to null]
**Canmanageentries** | **bool** | Whether the user can manage entries or not. | [default to null]
**Entrieslefttoadd** | **int32** | The number of entries left to complete the activity. | [default to null]
**Entrieslefttoview** | **int32** | The number of entries left to view other users entries. | [default to null]
**Groupid** | **int32** | User current group id (calculated) | [default to null]
**Inreadonlyperiod** | **bool** | Whether the database is in read mode only. | [default to null]
**Numentries** | **int32** | The number of entries the current user added. | [default to null]
**Timeavailable** | **bool** | Whether the database is available or not by time restrictions. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModDataGetDataAccessInformation200Response

`func NewModDataGetDataAccessInformation200Response(canaddentry bool, canapprove bool, canmanageentries bool, entrieslefttoadd int32, entrieslefttoview int32, groupid int32, inreadonlyperiod bool, numentries int32, timeavailable bool, ) *ModDataGetDataAccessInformation200Response`

NewModDataGetDataAccessInformation200Response instantiates a new ModDataGetDataAccessInformation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetDataAccessInformation200ResponseWithDefaults

`func NewModDataGetDataAccessInformation200ResponseWithDefaults() *ModDataGetDataAccessInformation200Response`

NewModDataGetDataAccessInformation200ResponseWithDefaults instantiates a new ModDataGetDataAccessInformation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanaddentry

`func (o *ModDataGetDataAccessInformation200Response) GetCanaddentry() bool`

GetCanaddentry returns the Canaddentry field if non-nil, zero value otherwise.

### GetCanaddentryOk

`func (o *ModDataGetDataAccessInformation200Response) GetCanaddentryOk() (*bool, bool)`

GetCanaddentryOk returns a tuple with the Canaddentry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanaddentry

`func (o *ModDataGetDataAccessInformation200Response) SetCanaddentry(v bool)`

SetCanaddentry sets Canaddentry field to given value.


### GetCanapprove

`func (o *ModDataGetDataAccessInformation200Response) GetCanapprove() bool`

GetCanapprove returns the Canapprove field if non-nil, zero value otherwise.

### GetCanapproveOk

`func (o *ModDataGetDataAccessInformation200Response) GetCanapproveOk() (*bool, bool)`

GetCanapproveOk returns a tuple with the Canapprove field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanapprove

`func (o *ModDataGetDataAccessInformation200Response) SetCanapprove(v bool)`

SetCanapprove sets Canapprove field to given value.


### GetCanmanageentries

`func (o *ModDataGetDataAccessInformation200Response) GetCanmanageentries() bool`

GetCanmanageentries returns the Canmanageentries field if non-nil, zero value otherwise.

### GetCanmanageentriesOk

`func (o *ModDataGetDataAccessInformation200Response) GetCanmanageentriesOk() (*bool, bool)`

GetCanmanageentriesOk returns a tuple with the Canmanageentries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanageentries

`func (o *ModDataGetDataAccessInformation200Response) SetCanmanageentries(v bool)`

SetCanmanageentries sets Canmanageentries field to given value.


### GetEntrieslefttoadd

`func (o *ModDataGetDataAccessInformation200Response) GetEntrieslefttoadd() int32`

GetEntrieslefttoadd returns the Entrieslefttoadd field if non-nil, zero value otherwise.

### GetEntrieslefttoaddOk

`func (o *ModDataGetDataAccessInformation200Response) GetEntrieslefttoaddOk() (*int32, bool)`

GetEntrieslefttoaddOk returns a tuple with the Entrieslefttoadd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntrieslefttoadd

`func (o *ModDataGetDataAccessInformation200Response) SetEntrieslefttoadd(v int32)`

SetEntrieslefttoadd sets Entrieslefttoadd field to given value.


### GetEntrieslefttoview

`func (o *ModDataGetDataAccessInformation200Response) GetEntrieslefttoview() int32`

GetEntrieslefttoview returns the Entrieslefttoview field if non-nil, zero value otherwise.

### GetEntrieslefttoviewOk

`func (o *ModDataGetDataAccessInformation200Response) GetEntrieslefttoviewOk() (*int32, bool)`

GetEntrieslefttoviewOk returns a tuple with the Entrieslefttoview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntrieslefttoview

`func (o *ModDataGetDataAccessInformation200Response) SetEntrieslefttoview(v int32)`

SetEntrieslefttoview sets Entrieslefttoview field to given value.


### GetGroupid

`func (o *ModDataGetDataAccessInformation200Response) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModDataGetDataAccessInformation200Response) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModDataGetDataAccessInformation200Response) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.


### GetInreadonlyperiod

`func (o *ModDataGetDataAccessInformation200Response) GetInreadonlyperiod() bool`

GetInreadonlyperiod returns the Inreadonlyperiod field if non-nil, zero value otherwise.

### GetInreadonlyperiodOk

`func (o *ModDataGetDataAccessInformation200Response) GetInreadonlyperiodOk() (*bool, bool)`

GetInreadonlyperiodOk returns a tuple with the Inreadonlyperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInreadonlyperiod

`func (o *ModDataGetDataAccessInformation200Response) SetInreadonlyperiod(v bool)`

SetInreadonlyperiod sets Inreadonlyperiod field to given value.


### GetNumentries

`func (o *ModDataGetDataAccessInformation200Response) GetNumentries() int32`

GetNumentries returns the Numentries field if non-nil, zero value otherwise.

### GetNumentriesOk

`func (o *ModDataGetDataAccessInformation200Response) GetNumentriesOk() (*int32, bool)`

GetNumentriesOk returns a tuple with the Numentries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumentries

`func (o *ModDataGetDataAccessInformation200Response) SetNumentries(v int32)`

SetNumentries sets Numentries field to given value.


### GetTimeavailable

`func (o *ModDataGetDataAccessInformation200Response) GetTimeavailable() bool`

GetTimeavailable returns the Timeavailable field if non-nil, zero value otherwise.

### GetTimeavailableOk

`func (o *ModDataGetDataAccessInformation200Response) GetTimeavailableOk() (*bool, bool)`

GetTimeavailableOk returns a tuple with the Timeavailable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeavailable

`func (o *ModDataGetDataAccessInformation200Response) SetTimeavailable(v bool)`

SetTimeavailable sets Timeavailable field to given value.


### GetWarnings

`func (o *ModDataGetDataAccessInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModDataGetDataAccessInformation200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModDataGetDataAccessInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModDataGetDataAccessInformation200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


