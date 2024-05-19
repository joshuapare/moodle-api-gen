# CoreGetStringsRequestStringsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | Pointer to **string** | component | [optional] [default to "moodle"]
**Lang** | Pointer to **string** | lang | [optional] 
**Stringid** | Pointer to **string** | string identifier | [optional] 
**Stringparams** | Pointer to [**[]CoreGetStringsRequestStringsInnerStringparamsInner**](CoreGetStringsRequestStringsInnerStringparamsInner.md) |  | [optional] 

## Methods

### NewCoreGetStringsRequestStringsInner

`func NewCoreGetStringsRequestStringsInner() *CoreGetStringsRequestStringsInner`

NewCoreGetStringsRequestStringsInner instantiates a new CoreGetStringsRequestStringsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGetStringsRequestStringsInnerWithDefaults

`func NewCoreGetStringsRequestStringsInnerWithDefaults() *CoreGetStringsRequestStringsInner`

NewCoreGetStringsRequestStringsInnerWithDefaults instantiates a new CoreGetStringsRequestStringsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreGetStringsRequestStringsInner) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreGetStringsRequestStringsInner) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreGetStringsRequestStringsInner) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreGetStringsRequestStringsInner) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetLang

`func (o *CoreGetStringsRequestStringsInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreGetStringsRequestStringsInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreGetStringsRequestStringsInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *CoreGetStringsRequestStringsInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetStringid

`func (o *CoreGetStringsRequestStringsInner) GetStringid() string`

GetStringid returns the Stringid field if non-nil, zero value otherwise.

### GetStringidOk

`func (o *CoreGetStringsRequestStringsInner) GetStringidOk() (*string, bool)`

GetStringidOk returns a tuple with the Stringid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStringid

`func (o *CoreGetStringsRequestStringsInner) SetStringid(v string)`

SetStringid sets Stringid field to given value.

### HasStringid

`func (o *CoreGetStringsRequestStringsInner) HasStringid() bool`

HasStringid returns a boolean if a field has been set.

### GetStringparams

`func (o *CoreGetStringsRequestStringsInner) GetStringparams() []CoreGetStringsRequestStringsInnerStringparamsInner`

GetStringparams returns the Stringparams field if non-nil, zero value otherwise.

### GetStringparamsOk

`func (o *CoreGetStringsRequestStringsInner) GetStringparamsOk() (*[]CoreGetStringsRequestStringsInnerStringparamsInner, bool)`

GetStringparamsOk returns a tuple with the Stringparams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStringparams

`func (o *CoreGetStringsRequestStringsInner) SetStringparams(v []CoreGetStringsRequestStringsInnerStringparamsInner)`

SetStringparams sets Stringparams field to given value.

### HasStringparams

`func (o *CoreGetStringsRequestStringsInner) HasStringparams() bool`

HasStringparams returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


