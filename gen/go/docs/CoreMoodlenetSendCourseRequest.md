# CoreMoodlenetSendCourseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Courseid** | **int32** | Course ID | 
**Issuerid** | **int32** | OAuth 2 issuer ID | 
**Shareformat** | **int32** | Share format | 

## Methods

### NewCoreMoodlenetSendCourseRequest

`func NewCoreMoodlenetSendCourseRequest(courseid int32, issuerid int32, shareformat int32, ) *CoreMoodlenetSendCourseRequest`

NewCoreMoodlenetSendCourseRequest instantiates a new CoreMoodlenetSendCourseRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMoodlenetSendCourseRequestWithDefaults

`func NewCoreMoodlenetSendCourseRequestWithDefaults() *CoreMoodlenetSendCourseRequest`

NewCoreMoodlenetSendCourseRequestWithDefaults instantiates a new CoreMoodlenetSendCourseRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmids

`func (o *CoreMoodlenetSendCourseRequest) GetCmids() []map[string]interface{}`

GetCmids returns the Cmids field if non-nil, zero value otherwise.

### GetCmidsOk

`func (o *CoreMoodlenetSendCourseRequest) GetCmidsOk() (*[]map[string]interface{}, bool)`

GetCmidsOk returns a tuple with the Cmids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmids

`func (o *CoreMoodlenetSendCourseRequest) SetCmids(v []map[string]interface{})`

SetCmids sets Cmids field to given value.

### HasCmids

`func (o *CoreMoodlenetSendCourseRequest) HasCmids() bool`

HasCmids returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreMoodlenetSendCourseRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreMoodlenetSendCourseRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreMoodlenetSendCourseRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetIssuerid

`func (o *CoreMoodlenetSendCourseRequest) GetIssuerid() int32`

GetIssuerid returns the Issuerid field if non-nil, zero value otherwise.

### GetIssueridOk

`func (o *CoreMoodlenetSendCourseRequest) GetIssueridOk() (*int32, bool)`

GetIssueridOk returns a tuple with the Issuerid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuerid

`func (o *CoreMoodlenetSendCourseRequest) SetIssuerid(v int32)`

SetIssuerid sets Issuerid field to given value.


### GetShareformat

`func (o *CoreMoodlenetSendCourseRequest) GetShareformat() int32`

GetShareformat returns the Shareformat field if non-nil, zero value otherwise.

### GetShareformatOk

`func (o *CoreMoodlenetSendCourseRequest) GetShareformatOk() (*int32, bool)`

GetShareformatOk returns a tuple with the Shareformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShareformat

`func (o *CoreMoodlenetSendCourseRequest) SetShareformat(v int32)`

SetShareformat sets Shareformat field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


