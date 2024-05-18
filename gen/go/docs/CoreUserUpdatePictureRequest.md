# CoreUserUpdatePictureRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Delete** | Pointer to **bool** | If we should delete the user picture | [optional] [default to false]
**Draftitemid** | **int32** | Id of the user draft file to use as image | [default to null]
**Userid** | Pointer to **int32** | Id of the user, 0 for current user | [optional] [default to 0]

## Methods

### NewCoreUserUpdatePictureRequest

`func NewCoreUserUpdatePictureRequest(draftitemid int32, ) *CoreUserUpdatePictureRequest`

NewCoreUserUpdatePictureRequest instantiates a new CoreUserUpdatePictureRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserUpdatePictureRequestWithDefaults

`func NewCoreUserUpdatePictureRequestWithDefaults() *CoreUserUpdatePictureRequest`

NewCoreUserUpdatePictureRequestWithDefaults instantiates a new CoreUserUpdatePictureRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDelete

`func (o *CoreUserUpdatePictureRequest) GetDelete() bool`

GetDelete returns the Delete field if non-nil, zero value otherwise.

### GetDeleteOk

`func (o *CoreUserUpdatePictureRequest) GetDeleteOk() (*bool, bool)`

GetDeleteOk returns a tuple with the Delete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelete

`func (o *CoreUserUpdatePictureRequest) SetDelete(v bool)`

SetDelete sets Delete field to given value.

### HasDelete

`func (o *CoreUserUpdatePictureRequest) HasDelete() bool`

HasDelete returns a boolean if a field has been set.

### GetDraftitemid

`func (o *CoreUserUpdatePictureRequest) GetDraftitemid() int32`

GetDraftitemid returns the Draftitemid field if non-nil, zero value otherwise.

### GetDraftitemidOk

`func (o *CoreUserUpdatePictureRequest) GetDraftitemidOk() (*int32, bool)`

GetDraftitemidOk returns a tuple with the Draftitemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDraftitemid

`func (o *CoreUserUpdatePictureRequest) SetDraftitemid(v int32)`

SetDraftitemid sets Draftitemid field to given value.


### GetUserid

`func (o *CoreUserUpdatePictureRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreUserUpdatePictureRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreUserUpdatePictureRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreUserUpdatePictureRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


