# TinyEquationFilterRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | **string** | The equation content | [default to "null"]
**Contextid** | **int32** | The context ID | [default to null]

## Methods

### NewTinyEquationFilterRequest

`func NewTinyEquationFilterRequest(content string, contextid int32, ) *TinyEquationFilterRequest`

NewTinyEquationFilterRequest instantiates a new TinyEquationFilterRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTinyEquationFilterRequestWithDefaults

`func NewTinyEquationFilterRequestWithDefaults() *TinyEquationFilterRequest`

NewTinyEquationFilterRequestWithDefaults instantiates a new TinyEquationFilterRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *TinyEquationFilterRequest) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *TinyEquationFilterRequest) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *TinyEquationFilterRequest) SetContent(v string)`

SetContent sets Content field to given value.


### GetContextid

`func (o *TinyEquationFilterRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *TinyEquationFilterRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *TinyEquationFilterRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


