# ModWorkshopUpdateAssessmentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assessmentid** | **int32** | Assessment id. | 
**Data** | [**[]ModWorkshopUpdateAssessmentRequestDataInner**](ModWorkshopUpdateAssessmentRequestDataInner.md) |  | 

## Methods

### NewModWorkshopUpdateAssessmentRequest

`func NewModWorkshopUpdateAssessmentRequest(assessmentid int32, data []ModWorkshopUpdateAssessmentRequestDataInner, ) *ModWorkshopUpdateAssessmentRequest`

NewModWorkshopUpdateAssessmentRequest instantiates a new ModWorkshopUpdateAssessmentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopUpdateAssessmentRequestWithDefaults

`func NewModWorkshopUpdateAssessmentRequestWithDefaults() *ModWorkshopUpdateAssessmentRequest`

NewModWorkshopUpdateAssessmentRequestWithDefaults instantiates a new ModWorkshopUpdateAssessmentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssessmentid

`func (o *ModWorkshopUpdateAssessmentRequest) GetAssessmentid() int32`

GetAssessmentid returns the Assessmentid field if non-nil, zero value otherwise.

### GetAssessmentidOk

`func (o *ModWorkshopUpdateAssessmentRequest) GetAssessmentidOk() (*int32, bool)`

GetAssessmentidOk returns a tuple with the Assessmentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessmentid

`func (o *ModWorkshopUpdateAssessmentRequest) SetAssessmentid(v int32)`

SetAssessmentid sets Assessmentid field to given value.


### GetData

`func (o *ModWorkshopUpdateAssessmentRequest) GetData() []ModWorkshopUpdateAssessmentRequestDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ModWorkshopUpdateAssessmentRequest) GetDataOk() (*[]ModWorkshopUpdateAssessmentRequestDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ModWorkshopUpdateAssessmentRequest) SetData(v []ModWorkshopUpdateAssessmentRequestDataInner)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


