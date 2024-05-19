# CoreCompetencySetParentCompetencyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Competencyid** | **int32** | The competency id | 
**Parentid** | **int32** | The new competency parent id | [default to null]

## Methods

### NewCoreCompetencySetParentCompetencyRequest

`func NewCoreCompetencySetParentCompetencyRequest(competencyid int32, parentid int32, ) *CoreCompetencySetParentCompetencyRequest`

NewCoreCompetencySetParentCompetencyRequest instantiates a new CoreCompetencySetParentCompetencyRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencySetParentCompetencyRequestWithDefaults

`func NewCoreCompetencySetParentCompetencyRequestWithDefaults() *CoreCompetencySetParentCompetencyRequest`

NewCoreCompetencySetParentCompetencyRequestWithDefaults instantiates a new CoreCompetencySetParentCompetencyRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompetencyid

`func (o *CoreCompetencySetParentCompetencyRequest) GetCompetencyid() int32`

GetCompetencyid returns the Competencyid field if non-nil, zero value otherwise.

### GetCompetencyidOk

`func (o *CoreCompetencySetParentCompetencyRequest) GetCompetencyidOk() (*int32, bool)`

GetCompetencyidOk returns a tuple with the Competencyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencyid

`func (o *CoreCompetencySetParentCompetencyRequest) SetCompetencyid(v int32)`

SetCompetencyid sets Competencyid field to given value.


### GetParentid

`func (o *CoreCompetencySetParentCompetencyRequest) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *CoreCompetencySetParentCompetencyRequest) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *CoreCompetencySetParentCompetencyRequest) SetParentid(v int32)`

SetParentid sets Parentid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


