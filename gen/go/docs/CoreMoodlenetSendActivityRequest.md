# CoreMoodlenetSendActivityRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | **int32** | Course module ID | [default to null]
**Issuerid** | **int32** | OAuth 2 issuer ID | 
**Shareformat** | **int32** | Share format | [default to null]

## Methods

### NewCoreMoodlenetSendActivityRequest

`func NewCoreMoodlenetSendActivityRequest(cmid int32, issuerid int32, shareformat int32, ) *CoreMoodlenetSendActivityRequest`

NewCoreMoodlenetSendActivityRequest instantiates a new CoreMoodlenetSendActivityRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMoodlenetSendActivityRequestWithDefaults

`func NewCoreMoodlenetSendActivityRequestWithDefaults() *CoreMoodlenetSendActivityRequest`

NewCoreMoodlenetSendActivityRequestWithDefaults instantiates a new CoreMoodlenetSendActivityRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmid

`func (o *CoreMoodlenetSendActivityRequest) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *CoreMoodlenetSendActivityRequest) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *CoreMoodlenetSendActivityRequest) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetIssuerid

`func (o *CoreMoodlenetSendActivityRequest) GetIssuerid() int32`

GetIssuerid returns the Issuerid field if non-nil, zero value otherwise.

### GetIssueridOk

`func (o *CoreMoodlenetSendActivityRequest) GetIssueridOk() (*int32, bool)`

GetIssueridOk returns a tuple with the Issuerid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuerid

`func (o *CoreMoodlenetSendActivityRequest) SetIssuerid(v int32)`

SetIssuerid sets Issuerid field to given value.


### GetShareformat

`func (o *CoreMoodlenetSendActivityRequest) GetShareformat() int32`

GetShareformat returns the Shareformat field if non-nil, zero value otherwise.

### GetShareformatOk

`func (o *CoreMoodlenetSendActivityRequest) GetShareformatOk() (*int32, bool)`

GetShareformatOk returns a tuple with the Shareformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShareformat

`func (o *CoreMoodlenetSendActivityRequest) SetShareformat(v int32)`

SetShareformat sets Shareformat field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


