# ToolMoodlenetVerifyWebfingerRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Course** | **int32** | The course we are adding to | [default to null]
**Profileurl** | **string** | The profile url that the user has given us | [default to "null"]
**Section** | **int32** | The section within the course we are adding to | [default to null]

## Methods

### NewToolMoodlenetVerifyWebfingerRequest

`func NewToolMoodlenetVerifyWebfingerRequest(course int32, profileurl string, section int32, ) *ToolMoodlenetVerifyWebfingerRequest`

NewToolMoodlenetVerifyWebfingerRequest instantiates a new ToolMoodlenetVerifyWebfingerRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMoodlenetVerifyWebfingerRequestWithDefaults

`func NewToolMoodlenetVerifyWebfingerRequestWithDefaults() *ToolMoodlenetVerifyWebfingerRequest`

NewToolMoodlenetVerifyWebfingerRequestWithDefaults instantiates a new ToolMoodlenetVerifyWebfingerRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourse

`func (o *ToolMoodlenetVerifyWebfingerRequest) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ToolMoodlenetVerifyWebfingerRequest) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ToolMoodlenetVerifyWebfingerRequest) SetCourse(v int32)`

SetCourse sets Course field to given value.


### GetProfileurl

`func (o *ToolMoodlenetVerifyWebfingerRequest) GetProfileurl() string`

GetProfileurl returns the Profileurl field if non-nil, zero value otherwise.

### GetProfileurlOk

`func (o *ToolMoodlenetVerifyWebfingerRequest) GetProfileurlOk() (*string, bool)`

GetProfileurlOk returns a tuple with the Profileurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileurl

`func (o *ToolMoodlenetVerifyWebfingerRequest) SetProfileurl(v string)`

SetProfileurl sets Profileurl field to given value.


### GetSection

`func (o *ToolMoodlenetVerifyWebfingerRequest) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ToolMoodlenetVerifyWebfingerRequest) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ToolMoodlenetVerifyWebfingerRequest) SetSection(v int32)`

SetSection sets Section field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


