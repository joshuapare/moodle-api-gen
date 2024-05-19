# CoreMoodlenetAuthCheck200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Loginurl** | **string** | Login url | [default to "null"]
**Status** | **bool** | status: true if success | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreMoodlenetAuthCheck200Response

`func NewCoreMoodlenetAuthCheck200Response(loginurl string, status bool, ) *CoreMoodlenetAuthCheck200Response`

NewCoreMoodlenetAuthCheck200Response instantiates a new CoreMoodlenetAuthCheck200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMoodlenetAuthCheck200ResponseWithDefaults

`func NewCoreMoodlenetAuthCheck200ResponseWithDefaults() *CoreMoodlenetAuthCheck200Response`

NewCoreMoodlenetAuthCheck200ResponseWithDefaults instantiates a new CoreMoodlenetAuthCheck200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLoginurl

`func (o *CoreMoodlenetAuthCheck200Response) GetLoginurl() string`

GetLoginurl returns the Loginurl field if non-nil, zero value otherwise.

### GetLoginurlOk

`func (o *CoreMoodlenetAuthCheck200Response) GetLoginurlOk() (*string, bool)`

GetLoginurlOk returns a tuple with the Loginurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLoginurl

`func (o *CoreMoodlenetAuthCheck200Response) SetLoginurl(v string)`

SetLoginurl sets Loginurl field to given value.


### GetStatus

`func (o *CoreMoodlenetAuthCheck200Response) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreMoodlenetAuthCheck200Response) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreMoodlenetAuthCheck200Response) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetWarnings

`func (o *CoreMoodlenetAuthCheck200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreMoodlenetAuthCheck200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreMoodlenetAuthCheck200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreMoodlenetAuthCheck200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


