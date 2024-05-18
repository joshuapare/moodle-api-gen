# CoreCalendarGetCalendarAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanageentries** | **bool** | Whether the user can manage entries. | [default to null]
**Canmanagegroupentries** | **bool** | Whether the user can manage group entries. | [default to null]
**Canmanageownentries** | **bool** | Whether the user can manage its own entries. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCalendarGetCalendarAccessInformation200Response

`func NewCoreCalendarGetCalendarAccessInformation200Response(canmanageentries bool, canmanagegroupentries bool, canmanageownentries bool, ) *CoreCalendarGetCalendarAccessInformation200Response`

NewCoreCalendarGetCalendarAccessInformation200Response instantiates a new CoreCalendarGetCalendarAccessInformation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarAccessInformation200ResponseWithDefaults

`func NewCoreCalendarGetCalendarAccessInformation200ResponseWithDefaults() *CoreCalendarGetCalendarAccessInformation200Response`

NewCoreCalendarGetCalendarAccessInformation200ResponseWithDefaults instantiates a new CoreCalendarGetCalendarAccessInformation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanageentries

`func (o *CoreCalendarGetCalendarAccessInformation200Response) GetCanmanageentries() bool`

GetCanmanageentries returns the Canmanageentries field if non-nil, zero value otherwise.

### GetCanmanageentriesOk

`func (o *CoreCalendarGetCalendarAccessInformation200Response) GetCanmanageentriesOk() (*bool, bool)`

GetCanmanageentriesOk returns a tuple with the Canmanageentries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanageentries

`func (o *CoreCalendarGetCalendarAccessInformation200Response) SetCanmanageentries(v bool)`

SetCanmanageentries sets Canmanageentries field to given value.


### GetCanmanagegroupentries

`func (o *CoreCalendarGetCalendarAccessInformation200Response) GetCanmanagegroupentries() bool`

GetCanmanagegroupentries returns the Canmanagegroupentries field if non-nil, zero value otherwise.

### GetCanmanagegroupentriesOk

`func (o *CoreCalendarGetCalendarAccessInformation200Response) GetCanmanagegroupentriesOk() (*bool, bool)`

GetCanmanagegroupentriesOk returns a tuple with the Canmanagegroupentries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanagegroupentries

`func (o *CoreCalendarGetCalendarAccessInformation200Response) SetCanmanagegroupentries(v bool)`

SetCanmanagegroupentries sets Canmanagegroupentries field to given value.


### GetCanmanageownentries

`func (o *CoreCalendarGetCalendarAccessInformation200Response) GetCanmanageownentries() bool`

GetCanmanageownentries returns the Canmanageownentries field if non-nil, zero value otherwise.

### GetCanmanageownentriesOk

`func (o *CoreCalendarGetCalendarAccessInformation200Response) GetCanmanageownentriesOk() (*bool, bool)`

GetCanmanageownentriesOk returns a tuple with the Canmanageownentries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanageownentries

`func (o *CoreCalendarGetCalendarAccessInformation200Response) SetCanmanageownentries(v bool)`

SetCanmanageownentries sets Canmanageownentries field to given value.


### GetWarnings

`func (o *CoreCalendarGetCalendarAccessInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCalendarGetCalendarAccessInformation200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCalendarGetCalendarAccessInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCalendarGetCalendarAccessInformation200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


