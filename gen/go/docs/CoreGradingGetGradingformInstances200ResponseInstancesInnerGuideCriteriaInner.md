# CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Criterionid** | Pointer to **int32** | criterion id | [optional] 
**Id** | Pointer to **int32** | filling id | [optional] [default to null]
**Levelid** | Pointer to **int32** | level id | [optional] 
**Remark** | Pointer to **string** | remark | [optional] [default to "null"]
**Remarkformat** | Pointer to **int32** | remark format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Score** | Pointer to **float32** | maximum score | [optional] 

## Methods

### NewCoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner

`func NewCoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner() *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner`

NewCoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner instantiates a new CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInnerWithDefaults

`func NewCoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInnerWithDefaults() *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner`

NewCoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInnerWithDefaults instantiates a new CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCriterionid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetCriterionid() int32`

GetCriterionid returns the Criterionid field if non-nil, zero value otherwise.

### GetCriterionidOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetCriterionidOk() (*int32, bool)`

GetCriterionidOk returns a tuple with the Criterionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCriterionid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) SetCriterionid(v int32)`

SetCriterionid sets Criterionid field to given value.

### HasCriterionid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) HasCriterionid() bool`

HasCriterionid returns a boolean if a field has been set.

### GetId

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLevelid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetLevelid() int32`

GetLevelid returns the Levelid field if non-nil, zero value otherwise.

### GetLevelidOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetLevelidOk() (*int32, bool)`

GetLevelidOk returns a tuple with the Levelid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevelid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) SetLevelid(v int32)`

SetLevelid sets Levelid field to given value.

### HasLevelid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) HasLevelid() bool`

HasLevelid returns a boolean if a field has been set.

### GetRemark

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetRemark() string`

GetRemark returns the Remark field if non-nil, zero value otherwise.

### GetRemarkOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetRemarkOk() (*string, bool)`

GetRemarkOk returns a tuple with the Remark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRemark

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) SetRemark(v string)`

SetRemark sets Remark field to given value.

### HasRemark

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) HasRemark() bool`

HasRemark returns a boolean if a field has been set.

### GetRemarkformat

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetRemarkformat() int32`

GetRemarkformat returns the Remarkformat field if non-nil, zero value otherwise.

### GetRemarkformatOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetRemarkformatOk() (*int32, bool)`

GetRemarkformatOk returns a tuple with the Remarkformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRemarkformat

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) SetRemarkformat(v int32)`

SetRemarkformat sets Remarkformat field to given value.

### HasRemarkformat

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) HasRemarkformat() bool`

HasRemarkformat returns a boolean if a field has been set.

### GetScore

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetScore() float32`

GetScore returns the Score field if non-nil, zero value otherwise.

### GetScoreOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) GetScoreOk() (*float32, bool)`

GetScoreOk returns a tuple with the Score field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScore

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) SetScore(v float32)`

SetScore sets Score field to given value.

### HasScore

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) HasScore() bool`

HasScore returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


