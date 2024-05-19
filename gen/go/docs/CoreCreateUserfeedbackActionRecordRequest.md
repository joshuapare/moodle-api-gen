# CoreCreateUserfeedbackActionRecordRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | **string** | The action taken by user | [default to "null"]
**Contextid** | **int32** | The context id of the page the user is in | [default to null]

## Methods

### NewCoreCreateUserfeedbackActionRecordRequest

`func NewCoreCreateUserfeedbackActionRecordRequest(action string, contextid int32, ) *CoreCreateUserfeedbackActionRecordRequest`

NewCoreCreateUserfeedbackActionRecordRequest instantiates a new CoreCreateUserfeedbackActionRecordRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCreateUserfeedbackActionRecordRequestWithDefaults

`func NewCoreCreateUserfeedbackActionRecordRequestWithDefaults() *CoreCreateUserfeedbackActionRecordRequest`

NewCoreCreateUserfeedbackActionRecordRequestWithDefaults instantiates a new CoreCreateUserfeedbackActionRecordRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *CoreCreateUserfeedbackActionRecordRequest) GetAction() string`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *CoreCreateUserfeedbackActionRecordRequest) GetActionOk() (*string, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *CoreCreateUserfeedbackActionRecordRequest) SetAction(v string)`

SetAction sets Action field to given value.


### GetContextid

`func (o *CoreCreateUserfeedbackActionRecordRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreCreateUserfeedbackActionRecordRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreCreateUserfeedbackActionRecordRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


