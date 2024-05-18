# EnrolSelfEnrolUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | Id of the course | 
**Instanceid** | Pointer to **int32** | Instance id of self enrolment plugin. | [optional] [default to 0]
**Password** | Pointer to **string** | Enrolment key | [optional] [default to ""]

## Methods

### NewEnrolSelfEnrolUserRequest

`func NewEnrolSelfEnrolUserRequest(courseid int32, ) *EnrolSelfEnrolUserRequest`

NewEnrolSelfEnrolUserRequest instantiates a new EnrolSelfEnrolUserRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnrolSelfEnrolUserRequestWithDefaults

`func NewEnrolSelfEnrolUserRequestWithDefaults() *EnrolSelfEnrolUserRequest`

NewEnrolSelfEnrolUserRequestWithDefaults instantiates a new EnrolSelfEnrolUserRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *EnrolSelfEnrolUserRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *EnrolSelfEnrolUserRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *EnrolSelfEnrolUserRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetInstanceid

`func (o *EnrolSelfEnrolUserRequest) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *EnrolSelfEnrolUserRequest) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *EnrolSelfEnrolUserRequest) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *EnrolSelfEnrolUserRequest) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetPassword

`func (o *EnrolSelfEnrolUserRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *EnrolSelfEnrolUserRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *EnrolSelfEnrolUserRequest) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *EnrolSelfEnrolUserRequest) HasPassword() bool`

HasPassword returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


