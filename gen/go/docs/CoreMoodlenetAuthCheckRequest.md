# CoreMoodlenetAuthCheckRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | Course ID | 
**Issuerid** | **int32** | OAuth 2 issuer ID | [default to null]

## Methods

### NewCoreMoodlenetAuthCheckRequest

`func NewCoreMoodlenetAuthCheckRequest(courseid int32, issuerid int32, ) *CoreMoodlenetAuthCheckRequest`

NewCoreMoodlenetAuthCheckRequest instantiates a new CoreMoodlenetAuthCheckRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMoodlenetAuthCheckRequestWithDefaults

`func NewCoreMoodlenetAuthCheckRequestWithDefaults() *CoreMoodlenetAuthCheckRequest`

NewCoreMoodlenetAuthCheckRequestWithDefaults instantiates a new CoreMoodlenetAuthCheckRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreMoodlenetAuthCheckRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreMoodlenetAuthCheckRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreMoodlenetAuthCheckRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetIssuerid

`func (o *CoreMoodlenetAuthCheckRequest) GetIssuerid() int32`

GetIssuerid returns the Issuerid field if non-nil, zero value otherwise.

### GetIssueridOk

`func (o *CoreMoodlenetAuthCheckRequest) GetIssueridOk() (*int32, bool)`

GetIssueridOk returns a tuple with the Issuerid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuerid

`func (o *CoreMoodlenetAuthCheckRequest) SetIssuerid(v int32)`

SetIssuerid sets Issuerid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


