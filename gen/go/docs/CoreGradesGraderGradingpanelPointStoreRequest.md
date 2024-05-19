# CoreGradesGraderGradingpanelPointStoreRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | The name of the component | 
**Contextid** | **int32** | The ID of the context being graded | 
**Formdata** | **string** | The serialised form data representing the grade | [default to "null"]
**Gradeduserid** | **int32** | The ID of the user show | 
**Itemname** | **string** | The grade item itemname being graded | 
**Notifyuser** | Pointer to **bool** | Wheteher to notify the user or not | [optional] [default to false]

## Methods

### NewCoreGradesGraderGradingpanelPointStoreRequest

`func NewCoreGradesGraderGradingpanelPointStoreRequest(component string, contextid int32, formdata string, gradeduserid int32, itemname string, ) *CoreGradesGraderGradingpanelPointStoreRequest`

NewCoreGradesGraderGradingpanelPointStoreRequest instantiates a new CoreGradesGraderGradingpanelPointStoreRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGraderGradingpanelPointStoreRequestWithDefaults

`func NewCoreGradesGraderGradingpanelPointStoreRequestWithDefaults() *CoreGradesGraderGradingpanelPointStoreRequest`

NewCoreGradesGraderGradingpanelPointStoreRequestWithDefaults instantiates a new CoreGradesGraderGradingpanelPointStoreRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContextid

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetFormdata

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetFormdata() string`

GetFormdata returns the Formdata field if non-nil, zero value otherwise.

### GetFormdataOk

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetFormdataOk() (*string, bool)`

GetFormdataOk returns a tuple with the Formdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormdata

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) SetFormdata(v string)`

SetFormdata sets Formdata field to given value.


### GetGradeduserid

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetGradeduserid() int32`

GetGradeduserid returns the Gradeduserid field if non-nil, zero value otherwise.

### GetGradeduseridOk

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetGradeduseridOk() (*int32, bool)`

GetGradeduseridOk returns a tuple with the Gradeduserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeduserid

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) SetGradeduserid(v int32)`

SetGradeduserid sets Gradeduserid field to given value.


### GetItemname

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetItemname() string`

GetItemname returns the Itemname field if non-nil, zero value otherwise.

### GetItemnameOk

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetItemnameOk() (*string, bool)`

GetItemnameOk returns a tuple with the Itemname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemname

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) SetItemname(v string)`

SetItemname sets Itemname field to given value.


### GetNotifyuser

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetNotifyuser() bool`

GetNotifyuser returns the Notifyuser field if non-nil, zero value otherwise.

### GetNotifyuserOk

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) GetNotifyuserOk() (*bool, bool)`

GetNotifyuserOk returns a tuple with the Notifyuser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotifyuser

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) SetNotifyuser(v bool)`

SetNotifyuser sets Notifyuser field to given value.

### HasNotifyuser

`func (o *CoreGradesGraderGradingpanelPointStoreRequest) HasNotifyuser() bool`

HasNotifyuser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


