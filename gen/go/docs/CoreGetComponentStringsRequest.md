# CoreGetComponentStringsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | component | 
**Lang** | Pointer to **string** | lang | [optional] [default to "null"]

## Methods

### NewCoreGetComponentStringsRequest

`func NewCoreGetComponentStringsRequest(component string, ) *CoreGetComponentStringsRequest`

NewCoreGetComponentStringsRequest instantiates a new CoreGetComponentStringsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGetComponentStringsRequestWithDefaults

`func NewCoreGetComponentStringsRequestWithDefaults() *CoreGetComponentStringsRequest`

NewCoreGetComponentStringsRequestWithDefaults instantiates a new CoreGetComponentStringsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreGetComponentStringsRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreGetComponentStringsRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreGetComponentStringsRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetLang

`func (o *CoreGetComponentStringsRequest) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreGetComponentStringsRequest) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreGetComponentStringsRequest) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *CoreGetComponentStringsRequest) HasLang() bool`

HasLang returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


