# TinyAutosaveResumeSessionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | **int32** | The context id that owns the editor | 
**Draftid** | **int32** | The new draft item id to resume files to | [default to null]
**Elementid** | **string** | The ID of the element | 
**Pagehash** | **string** | The page hash | 
**Pageinstance** | **string** | The page instance | 

## Methods

### NewTinyAutosaveResumeSessionRequest

`func NewTinyAutosaveResumeSessionRequest(contextid int32, draftid int32, elementid string, pagehash string, pageinstance string, ) *TinyAutosaveResumeSessionRequest`

NewTinyAutosaveResumeSessionRequest instantiates a new TinyAutosaveResumeSessionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTinyAutosaveResumeSessionRequestWithDefaults

`func NewTinyAutosaveResumeSessionRequestWithDefaults() *TinyAutosaveResumeSessionRequest`

NewTinyAutosaveResumeSessionRequestWithDefaults instantiates a new TinyAutosaveResumeSessionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextid

`func (o *TinyAutosaveResumeSessionRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *TinyAutosaveResumeSessionRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *TinyAutosaveResumeSessionRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetDraftid

`func (o *TinyAutosaveResumeSessionRequest) GetDraftid() int32`

GetDraftid returns the Draftid field if non-nil, zero value otherwise.

### GetDraftidOk

`func (o *TinyAutosaveResumeSessionRequest) GetDraftidOk() (*int32, bool)`

GetDraftidOk returns a tuple with the Draftid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDraftid

`func (o *TinyAutosaveResumeSessionRequest) SetDraftid(v int32)`

SetDraftid sets Draftid field to given value.


### GetElementid

`func (o *TinyAutosaveResumeSessionRequest) GetElementid() string`

GetElementid returns the Elementid field if non-nil, zero value otherwise.

### GetElementidOk

`func (o *TinyAutosaveResumeSessionRequest) GetElementidOk() (*string, bool)`

GetElementidOk returns a tuple with the Elementid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetElementid

`func (o *TinyAutosaveResumeSessionRequest) SetElementid(v string)`

SetElementid sets Elementid field to given value.


### GetPagehash

`func (o *TinyAutosaveResumeSessionRequest) GetPagehash() string`

GetPagehash returns the Pagehash field if non-nil, zero value otherwise.

### GetPagehashOk

`func (o *TinyAutosaveResumeSessionRequest) GetPagehashOk() (*string, bool)`

GetPagehashOk returns a tuple with the Pagehash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagehash

`func (o *TinyAutosaveResumeSessionRequest) SetPagehash(v string)`

SetPagehash sets Pagehash field to given value.


### GetPageinstance

`func (o *TinyAutosaveResumeSessionRequest) GetPageinstance() string`

GetPageinstance returns the Pageinstance field if non-nil, zero value otherwise.

### GetPageinstanceOk

`func (o *TinyAutosaveResumeSessionRequest) GetPageinstanceOk() (*string, bool)`

GetPageinstanceOk returns a tuple with the Pageinstance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageinstance

`func (o *TinyAutosaveResumeSessionRequest) SetPageinstance(v string)`

SetPageinstance sets Pageinstance field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


