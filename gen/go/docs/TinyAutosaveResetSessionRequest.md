# TinyAutosaveResetSessionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | **int32** | The context id that owns the editor | [default to null]
**Elementid** | **string** | The ID of the element | [default to "null"]
**Pagehash** | **string** | The page hash | [default to "null"]
**Pageinstance** | **string** | The page instance | [default to "null"]

## Methods

### NewTinyAutosaveResetSessionRequest

`func NewTinyAutosaveResetSessionRequest(contextid int32, elementid string, pagehash string, pageinstance string, ) *TinyAutosaveResetSessionRequest`

NewTinyAutosaveResetSessionRequest instantiates a new TinyAutosaveResetSessionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTinyAutosaveResetSessionRequestWithDefaults

`func NewTinyAutosaveResetSessionRequestWithDefaults() *TinyAutosaveResetSessionRequest`

NewTinyAutosaveResetSessionRequestWithDefaults instantiates a new TinyAutosaveResetSessionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextid

`func (o *TinyAutosaveResetSessionRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *TinyAutosaveResetSessionRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *TinyAutosaveResetSessionRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetElementid

`func (o *TinyAutosaveResetSessionRequest) GetElementid() string`

GetElementid returns the Elementid field if non-nil, zero value otherwise.

### GetElementidOk

`func (o *TinyAutosaveResetSessionRequest) GetElementidOk() (*string, bool)`

GetElementidOk returns a tuple with the Elementid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetElementid

`func (o *TinyAutosaveResetSessionRequest) SetElementid(v string)`

SetElementid sets Elementid field to given value.


### GetPagehash

`func (o *TinyAutosaveResetSessionRequest) GetPagehash() string`

GetPagehash returns the Pagehash field if non-nil, zero value otherwise.

### GetPagehashOk

`func (o *TinyAutosaveResetSessionRequest) GetPagehashOk() (*string, bool)`

GetPagehashOk returns a tuple with the Pagehash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagehash

`func (o *TinyAutosaveResetSessionRequest) SetPagehash(v string)`

SetPagehash sets Pagehash field to given value.


### GetPageinstance

`func (o *TinyAutosaveResetSessionRequest) GetPageinstance() string`

GetPageinstance returns the Pageinstance field if non-nil, zero value otherwise.

### GetPageinstanceOk

`func (o *TinyAutosaveResetSessionRequest) GetPageinstanceOk() (*string, bool)`

GetPageinstanceOk returns a tuple with the Pageinstance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageinstance

`func (o *TinyAutosaveResetSessionRequest) SetPageinstance(v string)`

SetPageinstance sets Pageinstance field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


