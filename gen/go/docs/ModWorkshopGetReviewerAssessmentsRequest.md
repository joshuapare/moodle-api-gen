# ModWorkshopGetReviewerAssessmentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Userid** | Pointer to **int32** | User id who did the assessment review (empty or 0 for current user). | [optional] [default to 0]
**Workshopid** | **int32** | Workshop instance id. | 

## Methods

### NewModWorkshopGetReviewerAssessmentsRequest

`func NewModWorkshopGetReviewerAssessmentsRequest(workshopid int32, ) *ModWorkshopGetReviewerAssessmentsRequest`

NewModWorkshopGetReviewerAssessmentsRequest instantiates a new ModWorkshopGetReviewerAssessmentsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetReviewerAssessmentsRequestWithDefaults

`func NewModWorkshopGetReviewerAssessmentsRequestWithDefaults() *ModWorkshopGetReviewerAssessmentsRequest`

NewModWorkshopGetReviewerAssessmentsRequestWithDefaults instantiates a new ModWorkshopGetReviewerAssessmentsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserid

`func (o *ModWorkshopGetReviewerAssessmentsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModWorkshopGetReviewerAssessmentsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModWorkshopGetReviewerAssessmentsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModWorkshopGetReviewerAssessmentsRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetWorkshopid

`func (o *ModWorkshopGetReviewerAssessmentsRequest) GetWorkshopid() int32`

GetWorkshopid returns the Workshopid field if non-nil, zero value otherwise.

### GetWorkshopidOk

`func (o *ModWorkshopGetReviewerAssessmentsRequest) GetWorkshopidOk() (*int32, bool)`

GetWorkshopidOk returns a tuple with the Workshopid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkshopid

`func (o *ModWorkshopGetReviewerAssessmentsRequest) SetWorkshopid(v int32)`

SetWorkshopid sets Workshopid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


