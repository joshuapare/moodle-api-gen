# CoreQuestionSubmitTagsFormRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | **int32** | The editing context id | [default to null]
**Formdata** | **string** | The data from the tag form | [default to "null"]
**Questionid** | **int32** | The question id | [default to null]

## Methods

### NewCoreQuestionSubmitTagsFormRequest

`func NewCoreQuestionSubmitTagsFormRequest(contextid int32, formdata string, questionid int32, ) *CoreQuestionSubmitTagsFormRequest`

NewCoreQuestionSubmitTagsFormRequest instantiates a new CoreQuestionSubmitTagsFormRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreQuestionSubmitTagsFormRequestWithDefaults

`func NewCoreQuestionSubmitTagsFormRequestWithDefaults() *CoreQuestionSubmitTagsFormRequest`

NewCoreQuestionSubmitTagsFormRequestWithDefaults instantiates a new CoreQuestionSubmitTagsFormRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextid

`func (o *CoreQuestionSubmitTagsFormRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreQuestionSubmitTagsFormRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreQuestionSubmitTagsFormRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetFormdata

`func (o *CoreQuestionSubmitTagsFormRequest) GetFormdata() string`

GetFormdata returns the Formdata field if non-nil, zero value otherwise.

### GetFormdataOk

`func (o *CoreQuestionSubmitTagsFormRequest) GetFormdataOk() (*string, bool)`

GetFormdataOk returns a tuple with the Formdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormdata

`func (o *CoreQuestionSubmitTagsFormRequest) SetFormdata(v string)`

SetFormdata sets Formdata field to given value.


### GetQuestionid

`func (o *CoreQuestionSubmitTagsFormRequest) GetQuestionid() int32`

GetQuestionid returns the Questionid field if non-nil, zero value otherwise.

### GetQuestionidOk

`func (o *CoreQuestionSubmitTagsFormRequest) GetQuestionidOk() (*int32, bool)`

GetQuestionidOk returns a tuple with the Questionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestionid

`func (o *CoreQuestionSubmitTagsFormRequest) SetQuestionid(v int32)`

SetQuestionid sets Questionid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


