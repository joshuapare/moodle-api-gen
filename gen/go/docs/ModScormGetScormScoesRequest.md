# ModScormGetScormScoesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Organization** | Pointer to **string** | organization id | [optional] [default to ""]
**Scormid** | **int32** | scorm instance id | [default to null]

## Methods

### NewModScormGetScormScoesRequest

`func NewModScormGetScormScoesRequest(scormid int32, ) *ModScormGetScormScoesRequest`

NewModScormGetScormScoesRequest instantiates a new ModScormGetScormScoesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormScoesRequestWithDefaults

`func NewModScormGetScormScoesRequestWithDefaults() *ModScormGetScormScoesRequest`

NewModScormGetScormScoesRequestWithDefaults instantiates a new ModScormGetScormScoesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrganization

`func (o *ModScormGetScormScoesRequest) GetOrganization() string`

GetOrganization returns the Organization field if non-nil, zero value otherwise.

### GetOrganizationOk

`func (o *ModScormGetScormScoesRequest) GetOrganizationOk() (*string, bool)`

GetOrganizationOk returns a tuple with the Organization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrganization

`func (o *ModScormGetScormScoesRequest) SetOrganization(v string)`

SetOrganization sets Organization field to given value.

### HasOrganization

`func (o *ModScormGetScormScoesRequest) HasOrganization() bool`

HasOrganization returns a boolean if a field has been set.

### GetScormid

`func (o *ModScormGetScormScoesRequest) GetScormid() int32`

GetScormid returns the Scormid field if non-nil, zero value otherwise.

### GetScormidOk

`func (o *ModScormGetScormScoesRequest) GetScormidOk() (*int32, bool)`

GetScormidOk returns a tuple with the Scormid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScormid

`func (o *ModScormGetScormScoesRequest) SetScormid(v int32)`

SetScormid sets Scormid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


