# ModScormGetScormAttemptCountRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ignoremissingcompletion** | Pointer to **bool** | Ignores attempts that haven&#39;t reported a grade/completion | [optional] [default to false]
**Scormid** | **int32** | SCORM instance id | [default to null]
**Userid** | **int32** | User id | 

## Methods

### NewModScormGetScormAttemptCountRequest

`func NewModScormGetScormAttemptCountRequest(scormid int32, userid int32, ) *ModScormGetScormAttemptCountRequest`

NewModScormGetScormAttemptCountRequest instantiates a new ModScormGetScormAttemptCountRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormAttemptCountRequestWithDefaults

`func NewModScormGetScormAttemptCountRequestWithDefaults() *ModScormGetScormAttemptCountRequest`

NewModScormGetScormAttemptCountRequestWithDefaults instantiates a new ModScormGetScormAttemptCountRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIgnoremissingcompletion

`func (o *ModScormGetScormAttemptCountRequest) GetIgnoremissingcompletion() bool`

GetIgnoremissingcompletion returns the Ignoremissingcompletion field if non-nil, zero value otherwise.

### GetIgnoremissingcompletionOk

`func (o *ModScormGetScormAttemptCountRequest) GetIgnoremissingcompletionOk() (*bool, bool)`

GetIgnoremissingcompletionOk returns a tuple with the Ignoremissingcompletion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIgnoremissingcompletion

`func (o *ModScormGetScormAttemptCountRequest) SetIgnoremissingcompletion(v bool)`

SetIgnoremissingcompletion sets Ignoremissingcompletion field to given value.

### HasIgnoremissingcompletion

`func (o *ModScormGetScormAttemptCountRequest) HasIgnoremissingcompletion() bool`

HasIgnoremissingcompletion returns a boolean if a field has been set.

### GetScormid

`func (o *ModScormGetScormAttemptCountRequest) GetScormid() int32`

GetScormid returns the Scormid field if non-nil, zero value otherwise.

### GetScormidOk

`func (o *ModScormGetScormAttemptCountRequest) GetScormidOk() (*int32, bool)`

GetScormidOk returns a tuple with the Scormid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScormid

`func (o *ModScormGetScormAttemptCountRequest) SetScormid(v int32)`

SetScormid sets Scormid field to given value.


### GetUserid

`func (o *ModScormGetScormAttemptCountRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModScormGetScormAttemptCountRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModScormGetScormAttemptCountRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


