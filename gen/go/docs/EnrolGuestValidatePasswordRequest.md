# EnrolGuestValidatePasswordRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Instanceid** | **int32** | instance id of guest enrolment plugin | [default to null]
**Password** | **string** | the course password | [default to "null"]

## Methods

### NewEnrolGuestValidatePasswordRequest

`func NewEnrolGuestValidatePasswordRequest(instanceid int32, password string, ) *EnrolGuestValidatePasswordRequest`

NewEnrolGuestValidatePasswordRequest instantiates a new EnrolGuestValidatePasswordRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnrolGuestValidatePasswordRequestWithDefaults

`func NewEnrolGuestValidatePasswordRequestWithDefaults() *EnrolGuestValidatePasswordRequest`

NewEnrolGuestValidatePasswordRequestWithDefaults instantiates a new EnrolGuestValidatePasswordRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInstanceid

`func (o *EnrolGuestValidatePasswordRequest) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *EnrolGuestValidatePasswordRequest) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *EnrolGuestValidatePasswordRequest) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.


### GetPassword

`func (o *EnrolGuestValidatePasswordRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *EnrolGuestValidatePasswordRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *EnrolGuestValidatePasswordRequest) SetPassword(v string)`

SetPassword sets Password field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


