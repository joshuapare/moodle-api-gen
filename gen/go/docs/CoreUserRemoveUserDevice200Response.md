# CoreUserRemoveUserDevice200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Removed** | **bool** | True if removed, false if not removed because it doesn&#39;t exists | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreUserRemoveUserDevice200Response

`func NewCoreUserRemoveUserDevice200Response(removed bool, ) *CoreUserRemoveUserDevice200Response`

NewCoreUserRemoveUserDevice200Response instantiates a new CoreUserRemoveUserDevice200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserRemoveUserDevice200ResponseWithDefaults

`func NewCoreUserRemoveUserDevice200ResponseWithDefaults() *CoreUserRemoveUserDevice200Response`

NewCoreUserRemoveUserDevice200ResponseWithDefaults instantiates a new CoreUserRemoveUserDevice200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRemoved

`func (o *CoreUserRemoveUserDevice200Response) GetRemoved() bool`

GetRemoved returns the Removed field if non-nil, zero value otherwise.

### GetRemovedOk

`func (o *CoreUserRemoveUserDevice200Response) GetRemovedOk() (*bool, bool)`

GetRemovedOk returns a tuple with the Removed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRemoved

`func (o *CoreUserRemoveUserDevice200Response) SetRemoved(v bool)`

SetRemoved sets Removed field to given value.


### GetWarnings

`func (o *CoreUserRemoveUserDevice200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreUserRemoveUserDevice200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreUserRemoveUserDevice200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreUserRemoveUserDevice200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


