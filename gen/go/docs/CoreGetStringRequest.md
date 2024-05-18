# CoreGetStringRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | Pointer to **string** | component | [optional] [default to "moodle"]
**Lang** | Pointer to **string** | lang | [optional] 
**Stringid** | **string** | string identifier | [default to "null"]
**Stringparams** | Pointer to [**[]CoreGetStringRequestStringparamsInner**](CoreGetStringRequestStringparamsInner.md) |  | [optional] 

## Methods

### NewCoreGetStringRequest

`func NewCoreGetStringRequest(stringid string, ) *CoreGetStringRequest`

NewCoreGetStringRequest instantiates a new CoreGetStringRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGetStringRequestWithDefaults

`func NewCoreGetStringRequestWithDefaults() *CoreGetStringRequest`

NewCoreGetStringRequestWithDefaults instantiates a new CoreGetStringRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreGetStringRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreGetStringRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreGetStringRequest) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreGetStringRequest) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetLang

`func (o *CoreGetStringRequest) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreGetStringRequest) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreGetStringRequest) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *CoreGetStringRequest) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetStringid

`func (o *CoreGetStringRequest) GetStringid() string`

GetStringid returns the Stringid field if non-nil, zero value otherwise.

### GetStringidOk

`func (o *CoreGetStringRequest) GetStringidOk() (*string, bool)`

GetStringidOk returns a tuple with the Stringid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStringid

`func (o *CoreGetStringRequest) SetStringid(v string)`

SetStringid sets Stringid field to given value.


### GetStringparams

`func (o *CoreGetStringRequest) GetStringparams() []CoreGetStringRequestStringparamsInner`

GetStringparams returns the Stringparams field if non-nil, zero value otherwise.

### GetStringparamsOk

`func (o *CoreGetStringRequest) GetStringparamsOk() (*[]CoreGetStringRequestStringparamsInner, bool)`

GetStringparamsOk returns a tuple with the Stringparams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStringparams

`func (o *CoreGetStringRequest) SetStringparams(v []CoreGetStringRequestStringparamsInner)`

SetStringparams sets Stringparams field to given value.

### HasStringparams

`func (o *CoreGetStringRequest) HasStringparams() bool`

HasStringparams returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


