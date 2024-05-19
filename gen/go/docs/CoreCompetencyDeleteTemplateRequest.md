# CoreCompetencyDeleteTemplateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Deleteplans** | **bool** | Boolean to indicate if plans must be deleted | [default to null]
**Id** | **int32** | Data base record id for the template | [default to null]

## Methods

### NewCoreCompetencyDeleteTemplateRequest

`func NewCoreCompetencyDeleteTemplateRequest(deleteplans bool, id int32, ) *CoreCompetencyDeleteTemplateRequest`

NewCoreCompetencyDeleteTemplateRequest instantiates a new CoreCompetencyDeleteTemplateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyDeleteTemplateRequestWithDefaults

`func NewCoreCompetencyDeleteTemplateRequestWithDefaults() *CoreCompetencyDeleteTemplateRequest`

NewCoreCompetencyDeleteTemplateRequestWithDefaults instantiates a new CoreCompetencyDeleteTemplateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeleteplans

`func (o *CoreCompetencyDeleteTemplateRequest) GetDeleteplans() bool`

GetDeleteplans returns the Deleteplans field if non-nil, zero value otherwise.

### GetDeleteplansOk

`func (o *CoreCompetencyDeleteTemplateRequest) GetDeleteplansOk() (*bool, bool)`

GetDeleteplansOk returns a tuple with the Deleteplans field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleteplans

`func (o *CoreCompetencyDeleteTemplateRequest) SetDeleteplans(v bool)`

SetDeleteplans sets Deleteplans field to given value.


### GetId

`func (o *CoreCompetencyDeleteTemplateRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCompetencyDeleteTemplateRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCompetencyDeleteTemplateRequest) SetId(v int32)`

SetId sets Id field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


