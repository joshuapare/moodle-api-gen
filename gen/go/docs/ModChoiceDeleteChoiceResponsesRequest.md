# ModChoiceDeleteChoiceResponsesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Choiceid** | **int32** | choice instance id | [default to null]
**Responses** | Pointer to **[]map[string]interface{}** |  | [optional] 

## Methods

### NewModChoiceDeleteChoiceResponsesRequest

`func NewModChoiceDeleteChoiceResponsesRequest(choiceid int32, ) *ModChoiceDeleteChoiceResponsesRequest`

NewModChoiceDeleteChoiceResponsesRequest instantiates a new ModChoiceDeleteChoiceResponsesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChoiceDeleteChoiceResponsesRequestWithDefaults

`func NewModChoiceDeleteChoiceResponsesRequestWithDefaults() *ModChoiceDeleteChoiceResponsesRequest`

NewModChoiceDeleteChoiceResponsesRequestWithDefaults instantiates a new ModChoiceDeleteChoiceResponsesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChoiceid

`func (o *ModChoiceDeleteChoiceResponsesRequest) GetChoiceid() int32`

GetChoiceid returns the Choiceid field if non-nil, zero value otherwise.

### GetChoiceidOk

`func (o *ModChoiceDeleteChoiceResponsesRequest) GetChoiceidOk() (*int32, bool)`

GetChoiceidOk returns a tuple with the Choiceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChoiceid

`func (o *ModChoiceDeleteChoiceResponsesRequest) SetChoiceid(v int32)`

SetChoiceid sets Choiceid field to given value.


### GetResponses

`func (o *ModChoiceDeleteChoiceResponsesRequest) GetResponses() []map[string]interface{}`

GetResponses returns the Responses field if non-nil, zero value otherwise.

### GetResponsesOk

`func (o *ModChoiceDeleteChoiceResponsesRequest) GetResponsesOk() (*[]map[string]interface{}, bool)`

GetResponsesOk returns a tuple with the Responses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponses

`func (o *ModChoiceDeleteChoiceResponsesRequest) SetResponses(v []map[string]interface{})`

SetResponses sets Responses field to given value.

### HasResponses

`func (o *ModChoiceDeleteChoiceResponsesRequest) HasResponses() bool`

HasResponses returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


