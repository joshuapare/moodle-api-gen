# CoreMoodlenetGetSharedCourseInfo200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Issuerid** | **int32** | MoodleNet issuer id | 
**Name** | **string** | Course short name | [default to "null"]
**Server** | **string** | MoodleNet server | 
**Status** | **bool** | status: true if success | 
**Supportpageurl** | **string** | Support page URL | 
**Type** | **string** | Course type | [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreMoodlenetGetSharedCourseInfo200Response

`func NewCoreMoodlenetGetSharedCourseInfo200Response(issuerid int32, name string, server string, status bool, supportpageurl string, type_ string, ) *CoreMoodlenetGetSharedCourseInfo200Response`

NewCoreMoodlenetGetSharedCourseInfo200Response instantiates a new CoreMoodlenetGetSharedCourseInfo200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMoodlenetGetSharedCourseInfo200ResponseWithDefaults

`func NewCoreMoodlenetGetSharedCourseInfo200ResponseWithDefaults() *CoreMoodlenetGetSharedCourseInfo200Response`

NewCoreMoodlenetGetSharedCourseInfo200ResponseWithDefaults instantiates a new CoreMoodlenetGetSharedCourseInfo200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIssuerid

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetIssuerid() int32`

GetIssuerid returns the Issuerid field if non-nil, zero value otherwise.

### GetIssueridOk

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetIssueridOk() (*int32, bool)`

GetIssueridOk returns a tuple with the Issuerid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuerid

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) SetIssuerid(v int32)`

SetIssuerid sets Issuerid field to given value.


### GetName

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) SetName(v string)`

SetName sets Name field to given value.


### GetServer

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetServer() string`

GetServer returns the Server field if non-nil, zero value otherwise.

### GetServerOk

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetServerOk() (*string, bool)`

GetServerOk returns a tuple with the Server field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServer

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) SetServer(v string)`

SetServer sets Server field to given value.


### GetStatus

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetSupportpageurl

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetSupportpageurl() string`

GetSupportpageurl returns the Supportpageurl field if non-nil, zero value otherwise.

### GetSupportpageurlOk

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetSupportpageurlOk() (*string, bool)`

GetSupportpageurlOk returns a tuple with the Supportpageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupportpageurl

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) SetSupportpageurl(v string)`

SetSupportpageurl sets Supportpageurl field to given value.


### GetType

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) SetType(v string)`

SetType sets Type field to given value.


### GetWarnings

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreMoodlenetGetSharedCourseInfo200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


