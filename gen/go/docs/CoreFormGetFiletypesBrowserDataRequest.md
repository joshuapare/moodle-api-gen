# CoreFormGetFiletypesBrowserDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allowall** | Pointer to **bool** | Allows to select All file types, does not apply with onlytypes are set. | [optional] [default to true]
**Current** | Pointer to **string** | Current types that should be selected. | [optional] [default to ""]
**Onlytypes** | Pointer to **string** | Limit the browser to the given groups and extensions | [optional] [default to ""]

## Methods

### NewCoreFormGetFiletypesBrowserDataRequest

`func NewCoreFormGetFiletypesBrowserDataRequest() *CoreFormGetFiletypesBrowserDataRequest`

NewCoreFormGetFiletypesBrowserDataRequest instantiates a new CoreFormGetFiletypesBrowserDataRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFormGetFiletypesBrowserDataRequestWithDefaults

`func NewCoreFormGetFiletypesBrowserDataRequestWithDefaults() *CoreFormGetFiletypesBrowserDataRequest`

NewCoreFormGetFiletypesBrowserDataRequestWithDefaults instantiates a new CoreFormGetFiletypesBrowserDataRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAllowall

`func (o *CoreFormGetFiletypesBrowserDataRequest) GetAllowall() bool`

GetAllowall returns the Allowall field if non-nil, zero value otherwise.

### GetAllowallOk

`func (o *CoreFormGetFiletypesBrowserDataRequest) GetAllowallOk() (*bool, bool)`

GetAllowallOk returns a tuple with the Allowall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowall

`func (o *CoreFormGetFiletypesBrowserDataRequest) SetAllowall(v bool)`

SetAllowall sets Allowall field to given value.

### HasAllowall

`func (o *CoreFormGetFiletypesBrowserDataRequest) HasAllowall() bool`

HasAllowall returns a boolean if a field has been set.

### GetCurrent

`func (o *CoreFormGetFiletypesBrowserDataRequest) GetCurrent() string`

GetCurrent returns the Current field if non-nil, zero value otherwise.

### GetCurrentOk

`func (o *CoreFormGetFiletypesBrowserDataRequest) GetCurrentOk() (*string, bool)`

GetCurrentOk returns a tuple with the Current field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrent

`func (o *CoreFormGetFiletypesBrowserDataRequest) SetCurrent(v string)`

SetCurrent sets Current field to given value.

### HasCurrent

`func (o *CoreFormGetFiletypesBrowserDataRequest) HasCurrent() bool`

HasCurrent returns a boolean if a field has been set.

### GetOnlytypes

`func (o *CoreFormGetFiletypesBrowserDataRequest) GetOnlytypes() string`

GetOnlytypes returns the Onlytypes field if non-nil, zero value otherwise.

### GetOnlytypesOk

`func (o *CoreFormGetFiletypesBrowserDataRequest) GetOnlytypesOk() (*string, bool)`

GetOnlytypesOk returns a tuple with the Onlytypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnlytypes

`func (o *CoreFormGetFiletypesBrowserDataRequest) SetOnlytypes(v string)`

SetOnlytypes sets Onlytypes field to given value.

### HasOnlytypes

`func (o *CoreFormGetFiletypesBrowserDataRequest) HasOnlytypes() bool`

HasOnlytypes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


