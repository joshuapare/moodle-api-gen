# CoreGradesGetFeedbackRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | Course ID | 
**Itemid** | **int32** | Grade Item ID | [default to null]
**Userid** | **int32** | User ID | 

## Methods

### NewCoreGradesGetFeedbackRequest

`func NewCoreGradesGetFeedbackRequest(courseid int32, itemid int32, userid int32, ) *CoreGradesGetFeedbackRequest`

NewCoreGradesGetFeedbackRequest instantiates a new CoreGradesGetFeedbackRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGetFeedbackRequestWithDefaults

`func NewCoreGradesGetFeedbackRequestWithDefaults() *CoreGradesGetFeedbackRequest`

NewCoreGradesGetFeedbackRequestWithDefaults instantiates a new CoreGradesGetFeedbackRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreGradesGetFeedbackRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreGradesGetFeedbackRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreGradesGetFeedbackRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetItemid

`func (o *CoreGradesGetFeedbackRequest) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreGradesGetFeedbackRequest) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreGradesGetFeedbackRequest) SetItemid(v int32)`

SetItemid sets Itemid field to given value.


### GetUserid

`func (o *CoreGradesGetFeedbackRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreGradesGetFeedbackRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreGradesGetFeedbackRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


