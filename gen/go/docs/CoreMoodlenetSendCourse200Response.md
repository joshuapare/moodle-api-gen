# CoreMoodlenetSendCourse200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Resourceurl** | **string** | Resource URL from MoodleNet | 
**Status** | **bool** | Status: true if success | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreMoodlenetSendCourse200Response

`func NewCoreMoodlenetSendCourse200Response(resourceurl string, status bool, ) *CoreMoodlenetSendCourse200Response`

NewCoreMoodlenetSendCourse200Response instantiates a new CoreMoodlenetSendCourse200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMoodlenetSendCourse200ResponseWithDefaults

`func NewCoreMoodlenetSendCourse200ResponseWithDefaults() *CoreMoodlenetSendCourse200Response`

NewCoreMoodlenetSendCourse200ResponseWithDefaults instantiates a new CoreMoodlenetSendCourse200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResourceurl

`func (o *CoreMoodlenetSendCourse200Response) GetResourceurl() string`

GetResourceurl returns the Resourceurl field if non-nil, zero value otherwise.

### GetResourceurlOk

`func (o *CoreMoodlenetSendCourse200Response) GetResourceurlOk() (*string, bool)`

GetResourceurlOk returns a tuple with the Resourceurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResourceurl

`func (o *CoreMoodlenetSendCourse200Response) SetResourceurl(v string)`

SetResourceurl sets Resourceurl field to given value.


### GetStatus

`func (o *CoreMoodlenetSendCourse200Response) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreMoodlenetSendCourse200Response) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreMoodlenetSendCourse200Response) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetWarnings

`func (o *CoreMoodlenetSendCourse200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreMoodlenetSendCourse200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreMoodlenetSendCourse200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreMoodlenetSendCourse200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


