# CoreGradesGraderGradingpanelPointFetchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | The name of the component | [default to "null"]
**Contextid** | **int32** | The ID of the context being graded | [default to null]
**Gradeduserid** | **int32** | The ID of the user show | [default to null]
**Itemname** | **string** | The grade item itemname being graded | [default to "null"]

## Methods

### NewCoreGradesGraderGradingpanelPointFetchRequest

`func NewCoreGradesGraderGradingpanelPointFetchRequest(component string, contextid int32, gradeduserid int32, itemname string, ) *CoreGradesGraderGradingpanelPointFetchRequest`

NewCoreGradesGraderGradingpanelPointFetchRequest instantiates a new CoreGradesGraderGradingpanelPointFetchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGraderGradingpanelPointFetchRequestWithDefaults

`func NewCoreGradesGraderGradingpanelPointFetchRequestWithDefaults() *CoreGradesGraderGradingpanelPointFetchRequest`

NewCoreGradesGraderGradingpanelPointFetchRequestWithDefaults instantiates a new CoreGradesGraderGradingpanelPointFetchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContextid

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetGradeduserid

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) GetGradeduserid() int32`

GetGradeduserid returns the Gradeduserid field if non-nil, zero value otherwise.

### GetGradeduseridOk

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) GetGradeduseridOk() (*int32, bool)`

GetGradeduseridOk returns a tuple with the Gradeduserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeduserid

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) SetGradeduserid(v int32)`

SetGradeduserid sets Gradeduserid field to given value.


### GetItemname

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) GetItemname() string`

GetItemname returns the Itemname field if non-nil, zero value otherwise.

### GetItemnameOk

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) GetItemnameOk() (*string, bool)`

GetItemnameOk returns a tuple with the Itemname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemname

`func (o *CoreGradesGraderGradingpanelPointFetchRequest) SetItemname(v string)`

SetItemname sets Itemname field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


